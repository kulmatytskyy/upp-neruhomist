use rent;

DELIMITER $$
CREATE TRIGGER `insert_reviews_date` BEFORE INSERT ON `reviews`
FOR EACH ROW
BEGIN
	select rentedNow into @rented from objects where objectID = NEW.objectID;
    IF @rented = true THEN
        SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'check constraint on object.rentedNow failed';
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
            SET MESSAGE_TEXT = 'check constraint on object.rentedNow failed';
    END IF;
END$$   
DELIMITER ;  
