show databases;
use world;

show tables;
show schemas;
select * from country;
select * from city;

DROP PROCEDURE IF EXISTS sp1;


DELIMITER //

CREATE PROCEDURE sp1(IN GNPOld_param FLOAT, IN GovernmentForm_param VARCHAR(50))
BEGIN
    DECLARE modifiedGovernmentForm VARCHAR(50);
    
    -- Append wildcard to the GovernmentForm_param
    SET modifiedGovernmentForm = CONCAT('%', GovernmentForm_param, '%');
    
    SELECT * 
    FROM country 
    WHERE GNPOld >= GNPOld_param 
      AND GovernmentForm LIKE modifiedGovernmentForm;
END //

DELIMITER ;

call sp1(1000,"Republic")

select * from country where IndepYear > 1992

-- Step 1: Create the procedure
DELIMITER //

CREATE PROCEDURE exampleProcedure(IN inputValue INT)
BEGIN
    DECLARE result INT;

    -- Perform some calculation
    SET result = inputValue * 2;

    -- Store the result in a user-defined variable
    SET @outputValue = result;

    -- Optionally, you can output the result directly
    SELECT result AS Result;  -- Outputs the result directly
END //

DELIMITER ;


-- Step 2: Call the procedure
CALL exampleProcedure(10);

-- Step 3: Access the output
SELECT @outputValue AS Resultoutput;  -- This should return 20


