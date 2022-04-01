--The highest purchase amount ordered by the each customer with their ID and highest purchase amount.
select customer_id, max(purchase_amount) as "Maximum Amount" from orders group by customer_id;

--The highest purchase amount on '2012-08-17' for each salesman with their ID.
select salesman_id, order_date, max(purchase_amount) as " Maximum Amount" from orders where order_date = to_date("17-AUG-2012", "DD-MMM-YYYY") group by salesman_id, order_date;

--The highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list [2030, 3450, 5760, 6000].
SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id, order_date HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);