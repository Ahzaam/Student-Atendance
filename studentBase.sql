SELECT * FROM student_details ;
-- ALTER TABLE student_details ADD `2021-08-01` VARCHAR(1);
        
ALTER TABLE student_details DROP COLUMN `00`;
describe student_details;
DELETE FROM student_details
WHERE id > 4;