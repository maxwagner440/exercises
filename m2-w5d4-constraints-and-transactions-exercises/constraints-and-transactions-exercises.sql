-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

BEGIN TRANSACTION;

INSERT INTO actor (first_name, last_name)
VALUES('Hampton', 'Avenue')

INSERT INTO actor (first_name, last_name)
VALUES('Lisa', 'Byway')
SELECT * FROM actor WHERE first_name = 'Hampton' AND last_name = 'Avenue'
SELECT * FROM actor WHERE first_name = 'Lisa'

COMMIT;

ROLLBACK;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.

BEGIN TRANSACTION;

INSERT INTO film (film_id, title, description, language_id, release_year, rental_duration, rental_rate, replacement_cost, length)
VALUES (DEFAULT, 'Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 1, 2008, 3, 4.99, 20.99, 198)	

SELECT * from film Where title = 'Euclidean PI'

COMMIT;

ROLLBACK;
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
BEGIN TRANSACTION;

INSERT INTO film_actor (actor_id, film_id)
VALUES ( 204, 1002)

INSERT INTO film_actor (actor_id, film_id)
VALUES ( 205, 1002)

SELECT film_id FROM film_actor WHERE actor_id = 204


COMMIT;

ROLLBACK;

-- 4. Add Mathmagical to the category table.
BEGIN TRANSACTION;

INSERT INTO category (category_id, name)
VALUES (default, 'Mathmagical')

SELECT category_id FROM category WHERE name = 'Mathmagical'

COMMIT;

ROLLBACK;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

BEGIN TRANSACTION;

UPDATE film_category SET category_id = 17 WHERE film_id IN 
(SELECT film_id FROM film WHERE title IN ('Euclidean PI', 'EGG IGBY', 'RANDOM GO', 'YOUNG LANGUAGE'))

INSERT INTO film_category (film_id , category_id)
VALUES ((SELECT film_id FROM film WHERE title IN ('Euclidean PI')), 17)


SELECT title, film.film_id FROM film
JOIN film_category fc ON fc.film_id = film.film_id
WHERE fc.category_id = 17

COMMIT;

ROLLBACK;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
BEGIN TRANSACTION;

UPDATE film SET rating = 'G' WHERE film_id IN
(SELECT film_id FROM film_category WHERE category_id =17)

SELECT rating FROM film WHERE title = 'RANDOM GO'

COMMIT;

ROLLBACK;

SELECT * FROM film WHERE title = 'Euclidean PI'

-- 7. Add a copy of "Euclidean PI" to all the stores.

BEGIN TRANSACTION;

INSERT INTO inventory (film_id, store_id)
VALUES (1002, 1)

INSERT INTO inventory (film_id, store_id)
VALUES (1002, 2)

COMMIT;

ROLLBACK;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
BEGIN TRANSACTION;

DELETE FROM film WHERE title = 'Euclidean PI'

COMMIT;

ROLLBACK;

--No because I have referenced this movie's key ID's to other tables such as inventory and film category.

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
BEGIN TRANSACTION;

DELETE FROM category WHERE name = 'Mathmagical'

COMMIT;

ROLLBACK;

--No because it is used as a foreign key on film_category

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
BEGIN TRANSACTION;

DELETE FROM film_category WHERE category_id IN (SELECT category_id FROM category WHERE name = 'Mathmagical')

SELECT * FROM film_category WHERE category_id IN (SELECT category_id FROM category WHERE name = 'Mathmagical')
COMMIT;

ROLLBACK;

--Yes it did because Mathmagical on the film_category was a reference from category, but not the actual category row.

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

BEGIN TRANSACTION;

DELETE FROM category WHERE name = 'Mathmagical'

SELECT * FROM category WHERE name = 'Mathmagical'
COMMIT;

ROLLBACK;

--Yes it did because we severed the connection that 'Mathmagical' had with film_category and therefore took away the forein key.

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

SELECT * FROM film WHERE title = 'Euclidean PI'
SELECT * FROM inventory WHERE film_id IN(SELECT film_id FROM film WHERE title = 'Euclidean PI')

BEGIN TRANSACTION;
DELETE FROM film_actor WHERE film_id IN(SELECT film_id FROM film WHERE title = 'Euclidean PI')
DELETE FROM inventory WHERE film_id IN(SELECT film_id FROM film WHERE title = 'Euclidean PI')
DELETE FROM film WHERE title = 'Euclidean PI'

COMMIT;

ROLLBACK;