# Write your MySQL query statement below
-- 1.id
-- SELECT 
    -- l2.Num AS 'ConsecutiveNums'
-- FROM 
    -- Logs as l1, Logs as l2, Logs as l3
-- WHERE 
    -- l2.Id = l1.Id + 1
    -- AND l2.Id = l3.Id - 1
    -- AND l2.Num = l1.Num
    -- AND l2.Num = l3.Num

-- 2. 第二种解法，使用 临时变量
SELECT
	DISTINCT l.Num AS 'ConsecutiveNums'
FROM
	(
		SELECT
			a.Num,
			@cnt :=
		IF (@pre = a.Num, @cnt + 1, 1) cnt,
		@pre := a.Num pre
	FROM
		LOGS a,
		(SELECT @pre := NULL, @cnt := 0) t
	) l
WHERE
	l.cnt >= 3