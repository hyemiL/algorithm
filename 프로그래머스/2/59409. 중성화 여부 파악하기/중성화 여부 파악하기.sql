-- 코드를 입력하세요
SELECT
    ANIMAL_ID,
    NAME,
    CASE 
        WHEN SEX_UPON_INTAKE LIKE '%Intact%' THEN 'X'
        WHEN SEX_UPON_INTAKE NOT LIKE '%Intact%' THEN 'O'
    END AS '중성화'
FROM
    ANIMAL_INS
ORDER BY
    ANIMAL_ID;