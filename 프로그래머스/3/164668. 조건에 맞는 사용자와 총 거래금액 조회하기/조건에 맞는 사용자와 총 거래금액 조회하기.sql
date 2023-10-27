-- 코드를 입력하세요
SELECT
    UGU.USER_ID,
    UGU.NICKNAME,
    SUM(UGB.PRICE) AS TOTAL_SALES
FROM
    USED_GOODS_BOARD UGB 
    JOIN USED_GOODS_USER UGU ON UGB.WRITER_ID = UGU.USER_ID
WHERE
    UGB.STATUS = 'DONE'
GROUP BY
    UGU.USER_ID
HAVING 
    SUM(UGB.PRICE) >= 700000
ORDER BY 
    TOTAL_SALES;