# Write your MySQL query statement below
-- ���ҳ�ÿ�����ŵ� max�������� in ƥ��
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