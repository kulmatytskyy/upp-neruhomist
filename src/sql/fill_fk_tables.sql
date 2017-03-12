/**************
| poplate_fk : script to generate random data into a child table with 
| Note that this script will require the original random data generator populate procedure(populate.sql)
|
| USAGE: call populate_fk('DATABASE-NAME','CHILD-TABLE-NAME',NUMBER-OF-ROWS,DEBUG-MODE);
| EXAMPLE: call populate_fk('databasename','child',100);
|
**************/
DELIMITER $$

DROP PROCEDURE IF EXISTS populate_fk $$
CREATE PROCEDURE populate_fk(in_db varchar(25), in_table varchar(25), in_rows int) 
fk_load:BEGIN

select CONCAT("UPDATE ",TABLE_NAME," SET ",COLUMN_NAME,"=(SELECT ",REFERENCED_COLUMN_NAME," FROM ",REFERENCED_TABLE_SCHEMA,".",REFERENCED_TABLE_NAME," ORDER BY RAND() LIMIT 1);") into @query from information_schema.key_column_usage where TABLE_NAME=in_table AND TABLE_SCHEMA=in_db LIMIT 1 OFFSET 2 ;
	


set  foreign_key_checks=0;
call populate(in_db,in_table,in_rows);
PREPARE t_stmt FROM @query;
EXECUTE t_stmt;

set  foreign_key_checks=1;

END
$$
DELIMITER ;

call populate_fk('rent','objects',100);
call populate_fk('rent','inspections',100);
call populate_fk('rent','reviews',100);
call populate_fk('rent','contracts',100);