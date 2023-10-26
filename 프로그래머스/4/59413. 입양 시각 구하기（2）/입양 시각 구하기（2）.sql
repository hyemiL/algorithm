-- 코드를 입력하세요

--WITH [테이블 이름] (별명) AS (
WITH TBL (HOURS) AS (
    --SELECT [시작하는 값] AS [별명]
    SELECT 0 AS HOURS
    --FROM 테이블 > 여기서는 가상의 테이블이 필요하니까 DUAL
        FROM DUAL
    --UNION ALL > 각 쿼리의 모든 결과를 포함한 합집합 (중복제거 안함)
    UNION ALL
    --SELECT (별명 + 1) > 위에서 수행한 행들을 다시 조회하면서 수를 1씩 더함
    SELECT HOURS + 1
    -- FROM [테이블 이름] > [테이블 이름]을 호출하면서 재귀호출
        FROM TBL
    --WHERE 1=1 > 항상 참이 되는 조건문
    WHERE 1=1
    --AND [별명] < [끝내는 값] > 재귀호출의 종료조건
        AND HOURS < 23
)

SELECT
    t.HOURS,
    NVL(a.COUNT, '0') AS COUNT
FROM (
    SELECT
        EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP)) AS hours,
        COUNT(EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP))) AS COUNT
    FROM
        ANIMAL_OUTS
    GROUP BY 
        EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP))
    ORDER BY
        hours ) a
    RIGHT JOIN TBL t
    ON a.hours = t.HOURS
ORDER BY
    t.HOURS;