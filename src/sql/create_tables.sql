CREATE DATABASE IF NOT EXISTS rent;

USE rent;

CREATE TABLE workers
(
workerID int NOT NULL AUTO_INCREMENT primary key,
Surname varchar(255) NOT NULL,
Phone varchar(255) NOT NULL,
Position varchar(255) NOT NULL
);


CREATE TABLE clients
(
clientID int NOT NULL AUTO_INCREMENT primary key,
Surname varchar(255) NOT NULL,
Phone varchar(255) NOT NULL,
Type varchar(255) NOT NULL,
Maximum_payment numeric(14,2) NOT NULL
);

CREATE TABLE owners
(
ownerID int NOT NULL AUTO_INCREMENT primary key,
Phone varchar(255) NOT NULL UNIQUE,
Name varchar(255) NOT NULL,
legal_owner boolean default false,

Contact_Name varchar(255),
Business_Type varchar(255)
);


CREATE TABLE propertytypes
(
propName varchar(255) NOT NULL primary key
);

INSERT INTO rent.propertytypes VALUES ("living");
INSERT INTO rent.propertytypes VALUES ("non-living");

CREATE TABLE objects
(
objectID int NOT NULL AUTO_INCREMENT primary key,
Address varchar(255) NOT NULL unique,
rooms tinyint NOT NULL,
payment numeric(15,2) NOT NULL,
rentedNow boolean default false,

ownerID int NOT NULL,
FOREIGN KEY fk_owners(ownerID)
REFERENCES owners(ownerID)
ON DELETE CASCADE
ON UPDATE CASCADE,

propName varchar(255) NOT NULL,
FOREIGN KEY fk_propertytypes(propName)
REFERENCES propertytypes(propName)
ON DELETE CASCADE
ON UPDATE CASCADE,

workerID int,
FOREIGN KEY fk_workers(workerID)
REFERENCES workers(workerID)
ON DELETE RESTRICT
ON UPDATE CASCADE
);

CREATE TABLE inspections
(
inspectionID int NOT NULL AUTO_INCREMENT primary key,
Comment varchar(255) NOT NULL,
Date date NOT NULL,
workerID int NOT NULL,
FOREIGN KEY fk_workers(workerID)
REFERENCES workers(workerID)
ON DELETE RESTRICT
ON UPDATE CASCADE,

objectID int NOT NULL,
FOREIGN KEY fk_objects(objectID)
REFERENCES objects(objectID)
ON DELETE CASCADE
ON UPDATE CASCADE
);

CREATE TABLE reviews
(
reviewID int NOT NULL AUTO_INCREMENT primary key,
Comment varchar(255) NOT NULL,
Date date NOT NULL,
clientID int NOT NULL,
FOREIGN KEY fk_clients(clientID)
REFERENCES clients(clientID)
ON DELETE CASCADE
ON UPDATE CASCADE,

objectID int NOT NULL,
FOREIGN KEY fk_objects(objectID)
REFERENCES objects(objectID)
ON DELETE CASCADE
ON UPDATE CASCADE
);

CREATE TABLE contracts
(
contractID int NOT NULL AUTO_INCREMENT primary key,
StartDate date NOT NULL,
EndDate date NOT NULL,
CHECK (EndDate>StartDate),
monthlyPayment numeric(15,2) NOT NULL,
clientID int NOT NULL,
FOREIGN KEY fk_clients(clientID)
REFERENCES clients(clientID)
ON DELETE CASCADE
ON UPDATE CASCADE,

objectID int NOT NULL,
FOREIGN KEY fk_objects(objectID)
REFERENCES objects(objectID)
ON DELETE CASCADE
ON UPDATE CASCADE,


workerID int NOT NULL,
FOREIGN KEY fk_workers(workerID)
REFERENCES workers(workerID)
ON DELETE RESTRICT
ON UPDATE CASCADE
);



DELIMITER $$
CREATE TRIGGER `insert_contracts_enddate` BEFORE INSERT ON `contracts`
FOR EACH ROW
BEGIN
    IF NEW.enddate<NEW.startdate THEN
        SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'check constraint on contracts.enddate failed';
    END IF;
END$$   
DELIMITER ;  

DELIMITER $$
CREATE TRIGGER `update_contracts_enddate` BEFORE UPDATE ON `contracts`
FOR EACH ROW
BEGIN
    IF NEW.enddate<NEW.startdate THEN
        SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'check constraint on contracts.enddate failed';
    END IF;
END$$   
DELIMITER ; 
 
DELIMITER $$
CREATE TRIGGER `insert_objects_rooms` BEFORE INSERT ON `objects`
FOR EACH ROW
BEGIN
    IF NEW.rooms<1 OR NEW.rooms>10 THEN
        SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'check constraint on objects.rooms failed';
    END IF;
END$$   
DELIMITER ;  

DELIMITER $$
CREATE TRIGGER `update_objects_rooms` BEFORE UPDATE ON `objects`
FOR EACH ROW
BEGIN
    IF NEW.rooms<1 OR NEW.rooms>10 THEN
        SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'check constraint on objects.rooms failed';
    END IF;
END$$   
DELIMITER ;  

DELIMITER $$
CREATE TRIGGER `insert_inspections_date` BEFORE INSERT ON `inspections`
FOR EACH ROW
BEGIN
	select rentedNow into @rented from objects where objectID = NEW.objectID;
    IF @rented = false THEN
        SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'check constraint on inspections.date failed';
    END IF;
END$$   
DELIMITER ;  

DELIMITER $$
CREATE TRIGGER `update_inspections_date` BEFORE UPDATE ON `inspections`
FOR EACH ROW
BEGIN
    select rentedNow into @rented from objects where objectID = NEW.objectID;
    IF @rented = false THEN
        SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'check constraint on inspections.date failed';
    END IF;
END$$   
DELIMITER ;  

DELIMITER $$
CREATE TRIGGER `insert_reviews_date` BEFORE INSERT ON `reviews`
FOR EACH ROW
BEGIN
	select rentedNow into @rented from objects where objectID = NEW.objectID;
    IF @rented = true THEN
        SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'check constraint on inspections.date failed';
    END IF;
END$$   
DELIMITER ;  

DELIMITER $$
CREATE TRIGGER `update_rewiews_date` BEFORE UPDATE ON `reviews`
FOR EACH ROW
BEGIN
    select rentedNow into @rented from objects where objectID = NEW.objectID;
    IF @rented = true THEN
        SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'check constraint on inspections.date failed';
    END IF;
END$$   
DELIMITER ;  



INSERT INTO rent.workers VALUES (1, "name", "phone", "position");
INSERT INTO rent.clients VALUES (1, "name", "phone", "type", 250);
INSERT INTO rent.owners VALUES (1, "name", "phone", false, null, null);
INSERT INTO rent.objects VALUES (1, "name", 5, 150, false, 1, "living", 1);
INSERT INTO rent.objects VALUES (2, "address", 5, 150, true, 1, "living", 1);

INSERT INTO rent.inspections VALUES (1, "address", '2012.04.20', 1, 2);
INSERT INTO rent.inspections VALUES (2, "address", '2012.04.20', 1, 1);

INSERT INTO rent.reviews VALUES (1, "comment", '2012.04.20', 1, 2);
INSERT INTO rent.reviews VALUES (2, "comment", '2012.04.20', 1, 1);
