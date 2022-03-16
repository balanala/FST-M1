--Update the grade score of salesmen from Rome to 200.
Update salesman Set grade=200 where salesman_city = 'Rome';

--Update the grade score of James Hoog to 300.
Update salesman Set grade=300 where salesman_name = 'Lauson Hen';

-- Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='Nail Knite';

--Display Modified Data
Select * from salesman;