--The total purchase amount of all orders.
SELECT SUM(purchase_amount) As "Total Sum" FROM orders;

--The total average purchase amount of all orders
Select avg(purchase_amount) As "Average" from orders;

--The Maximum Purchase Amount of all orders
Select max(purchase_amount) As "Maximum" from orders;

--The Minimum Purchase Amount of all orders
Select min(purchase_amount) As "Minimum" from orders;

--The Number of Salesman listed in the table
select COUNT(distinct salesman_id) AS "Total count" from orders;



