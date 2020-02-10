# Write your MySQL query statement below
-- 先找出每个部门的 max，接着用 in 匹配
select 
    d.Name AS 'Department',
    e.Name AS 'Employee',
    Salary
from 
    Employee e left join Department d on e.DepartmentId = d.Id
where 
(d.Id, e.Salary) in (
    select DepartmentId, max(Salary)
    from Employee
    group by DepartmentId
)