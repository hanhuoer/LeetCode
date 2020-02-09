# Write your MySQL query statement below
SELECT s1.Score, COUNT(DISTINCT(s2.Score)) AS 'RANK'
FROM Scores s1, Scores s2
WHERE s1.Score <= s2.Score
GROUP BY s1.Id
ORDER BY RANK