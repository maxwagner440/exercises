-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
SELECT title FROM film AS f
JOIN film_actor AS fa ON fa.film_id = f.film_id
JOIN actor AS a ON a.actor_id = fa.actor_id
WHERE a.first_name = 'NICK' AND a.last_name = 'STALLONE';

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

SELECT title FROM film AS f
JOIN film_actor AS fa ON fa.film_id = f.film_id
JOIN actor AS a ON a.actor_id = fa.actor_id
WHERE a.first_name = 'RITA' AND a.last_name = 'REYNOLDS';


-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

SELECT title FROM film AS f
JOIN film_actor AS fa ON fa.film_id = f.film_id
JOIN actor AS a ON a.actor_id = fa.actor_id
WHERE  a.last_name = 'DEAN';

-- 4. All of the the ‘Documentary’ films
-- (68 rows)

SELECT title, c.name FROM film AS f
JOIN film_category AS fc ON fc.film_id = f.film_id
JOIN category AS c ON c.category_id = fc.category_id
WHERE c.name = 'Documentary';

-- 5. All of the ‘Comedy’ films
-- (58 rows)

SELECT title, c.name FROM film AS f
JOIN film_category AS fc ON fc.film_id = f.film_id
JOIN category AS c ON c.category_id = fc.category_id
WHERE c.name = 'Comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

SELECT name FROM category AS c
JOIN film_category AS fc ON fc.category_id = c.category_id
JOIN film AS f ON f.film_id = fc.film_id
WHERE f.rating = 'G' AND c.name = 'Children';


-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

SELECT title FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id
WHERE f.rating = 'G' AND c.name = 'Family' AND f.length < '120';


-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

SELECT title FROM film AS f
JOIN film_actor AS fa ON fa.film_id = f.film_id
JOIN actor AS a ON a.actor_id = fa.actor_id
WHERE a.first_name = 'MATTHEW' AND a.last_name = 'LEIGH' AND f.rating = 'G';


-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

SELECT title FROM film AS f 
JOIN film_category AS fc ON fc.film_id = f.film_id
JOIN category AS c ON c.category_id = fc.category_id
WHERE c.name = 'Sci-Fi' AND f.release_year = '2006';

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

SELECT title FROM film AS f
JOIN film_actor AS fa ON fa.film_id = f.film_id
JOIN actor AS a ON a.actor_id = fa.actor_id
JOIN film_category AS fc ON fc.film_id = fa.film_id
JOIN category AS c ON c.category_id = fc.category_id
Where a.first_name = 'NICK' AND a.last_name = 'STALLONE' AND c.name = 'Action';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

SELECT ad.address, ci.city, co.country FROM store st
JOIN address ad ON ad.address_id = st.address_id
JOIN city AS ci ON ci.city_id = ad.city_id
JOIN country AS co on co.country_id = ci.country_id;


-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

SELECT st.store_id, ad.address, sta.first_name, sta.last_name FROM store st
JOIN staff AS sta ON sta.store_id = st.store_id
JOIN address ad ON ad.address_id = st.address_id
JOIN city AS ci ON ci.city_id = ad.city_id
JOIN country AS co on co.country_id = ci.country_id;



-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

SELECT cu.first_name, cu.last_name, COUNT(re.rental_date) AS cre FROM customer cu
JOIN rental AS re ON re.customer_id = cu.customer_id
GROUP BY cu.first_name, cu.last_name
ORDER BY cre DESC
LIMIT 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

SELECT cu.first_name, cu.last_name, SUM(pa.amount) as sumpa FROM customer AS cu
JOIN payment as pa ON pa.customer_id = cu.customer_id
GROUP BY cu.first_name, cu.last_name
ORDER BY sumpa DESC
LIMIT 10;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

SELECT st.store_id, ad.address, COUNT(re.return_date), SUM(pa.amount), AVG(pa.amount) FROM store as st
JOIN address ad ON ad.address_id = st.address_id
JOIN inventory inv ON inv.store_id = st.store_id

JOIN rental re ON re.inventory_id = inv.inventory_id
JOIN payment pa ON pa.rental_id = re.rental_id
GROUP BY st.store_id, ad.address;


-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

SELECT fi.title, COUNT(re.rental_date) AS cre FROM film AS fi
JOIN inventory inv ON inv.film_id = fi.film_id
JOIN rental re ON re.inventory_id = inv.inventory_id
GROUP BY fi.title
ORDER BY cre DESC
LIMIT 10

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

SELECT ca.name, COUNT(re.rental_date) AS cre FROM category AS ca
JOIN film_category fc ON fc.category_id = ca.category_id
JOIN film fi ON fi.film_id = fc.film_id
JOIN inventory inv ON inv.film_id = fi.film_id
JOIN rental re ON re.inventory_id = inv.inventory_id
GROUP BY ca.name
ORDER BY cre DESC
LIMIT 5;

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

SELECT fi.title, COUNT(re.rental_date) AS cre FROM film AS fi
JOIN film_category fc ON fc.film_id = fi.film_id
JOIN category ca ON ca.category_id = fc.category_id
JOIN inventory inv ON inv.film_id = fi.film_id
JOIN rental re ON re.inventory_id = inv.inventory_id
WHERE ca.name = 'Action'
GROUP BY fi.title
ORDER BY cre DESC
LIMIT 5;

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

SELECT  a.first_name, a.last_name, COUNT(re.rental_date) AS cre FROM actor AS a
JOIN film_actor fa ON fa.actor_id = a.actor_id
JOIN film fi ON fi.film_id = fa.film_id
JOIN inventory inv ON inv.film_id = fi.film_id
JOIN rental re ON re.inventory_id = inv.inventory_id
GROUP BY a.actor_id, a.first_name, a.last_name
ORDER BY cre DESC
LIMIT 10 ;

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

SELECT a.first_name, a.last_name, COUNT(re.rental_date) as cre FROM actor AS a
JOIN film_actor fa ON fa.actor_id = a.actor_id
JOIN film_category fc ON fc.film_id = fa.film_id
JOIN category ca ON ca.category_id = fc.category_id
JOIN inventory inv ON inv.film_id = fc.film_id
JOIN rental re ON re.inventory_id = inv.inventory_id
WHERE ca.name = 'Comedy'
GROUP BY a.first_name, a.last_name
ORDER BY cre DESC
LIMIT 5;
