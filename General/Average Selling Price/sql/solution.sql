1SELECT p.product_id, IFNULL(ROUND(SUM(units*price)/SUM(units),2),0) AS average_price
2FROM Prices p LEFT JOIN UnitsSold u
3ON p.product_id = u.product_id AND
4u.purchase_date BETWEEN start_date AND end_date
5group by product_id