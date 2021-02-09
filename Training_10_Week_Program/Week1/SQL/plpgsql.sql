/*
pl/pgSQL stands FOR PROCEDURAL langauge/ Postgres Sequential Query LANGUAGE

It IS used TO allow developers TO CREATE their own FUNCTIONS, PROCEDURES, AND tirgge.
IN essense, you can define your own reusable PROCEDURES AND even specify WHEN they should run.
*/

-- Note that there are already built-in functions in SQL

-- Scalar Functions
SELECT card_id, upper(card_name) FROM cards;
SELECT card_id, LOWER(card_name) FROM cards;
SELECT card_id, concat(card_name, ' plus some extra words') FROM cards; 

-- Aggregate Function
SELECT AVG(card_id) FROM cards;
SELECT COUNT(card_id) FROM cards;
SELECT SUM(card_id) FROM cards;

-- Let's create a function that will allow us to check for the existence of a card by a certain nome on our card table.
/* There are several types of parameters you can specify in pl/pgSQL.
 * They are:
 * 
 * "in" parameters: These are parameters that are passed in as arguments when the function is called
 * 
 * "inout" parameters: These are parameters that are passed in and also returned
 * 
 * "out" parameters: You don't pass these parameters into the function; you simply return them.
 * 
 * In Postgres, function definitions are wrapped in "dollar quotes" -> $$stuff inside$$
 */

CREATE OR REPLACE FUNCTION hasCardName(IN cardname VARCHAR, OUT card_id INT, OUT cardnameexists BOOL)
AS 
$$
	SELECT card_id, -- Note that what you select is your "return value"
	CASE WHEN card_name IS NULL THEN FALSE
	ELSE TRUE
	END 
	
	FROM cards 
	WHERE card_name = cardname;
$$ LANGUAGE SQL;

-- How do you use a custom function?
SELECT * FROM hasCardName('Water Wisp');