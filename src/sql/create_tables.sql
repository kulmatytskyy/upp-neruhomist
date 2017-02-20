CREATE DATABASE IF NOT EXISTS rent;

USE rent;

CREATE TABLE workers
(
workerID int NOT NULL AUTO_INCREMENT primary key,
Surname varchar(255) NOT NULL,
Phone int NOT NULL,
Position varchar(255) NOT NULL
);

CREATE TABLE clients
(
clientID int NOT NULL AUTO_INCREMENT primary key,
Surname varchar(255) NOT NULL,
Phone int NOT NULL,
Type varchar(255) NOT NULL,
Maximum_payment numeric(14,2) NOT NULL
);

CREATE TABLE owners
(
ownerID int NOT NULL AUTO_INCREMENT primary key,
Phone int NOT NULL UNIQUE,
Name varchar(255) NOT NULL,
legal_owner boolean default false,

Contact_Name varchar(255),
Business_Type varchar(255)
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
ON UPDATE CASCADE
);

CREATE TABLE objects
(
objectID int NOT NULL AUTO_INCREMENT primary key,
Address varchar(255) NOT NULL,
Type varchar(255) NOT NULL,
rooms int NOT NULL,
payment numeric(15,2) NOT NULL,
ownerID int NOT NULL,
FOREIGN KEY fk_owners(ownerID)
REFERENCES owners(ownerID)
ON DELETE CASCADE
ON UPDATE CASCADE,

workerID int,
FOREIGN KEY fk_workers(workerID)
REFERENCES workers(workerID)
ON DELETE RESTRICT
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
