-- Reset id về lại theo thứ tự
SET @count = 0;
UPDATE phone SET id = @count := @count + 1;
ALTER TABLE phone AUTO_INCREMENT = 1;

select * from phone