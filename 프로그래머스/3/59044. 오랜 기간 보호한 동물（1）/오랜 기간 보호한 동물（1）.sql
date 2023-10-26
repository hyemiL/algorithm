-- 코드를 입력하세요
SELECT  
    ins.NAME,
    ins.DATETIME
FROM
    ANIMAL_INS ins
    LEFT JOIN ANIMAL_OUTS outs
    ON ins.ANIMAL_ID = outs.ANIMAL_ID
WHERE 
    outs.DATETIME IS NULL
ORDER BY 
    ins.DATETIME
LIMIT 3;