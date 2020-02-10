CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
      set N = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      select t.Salary 
      from (select distinct Salary from Employee order by Salary desc limit N, 1) t
  );
END