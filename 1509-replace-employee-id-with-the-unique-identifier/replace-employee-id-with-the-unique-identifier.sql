# Write your MySQL query statement below
select e.unique_id,o.name from Employees o left join EmployeeUNI e on o.id=e.id;