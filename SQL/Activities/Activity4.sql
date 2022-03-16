--Add a new column - grade - to the salesman table
Alter Table salesman Add grade int;

--Update the values in the grade column
Update salesman Set grade = 100;

-- Display data
Select * from salesman;