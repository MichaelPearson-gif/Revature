-- Let's add some records to our tables
INSERT INTO cards VALUES(DEFAULT, 'Dragon Man', 2, TRUE, '1999-10-02');
INSERT INTO cards VALUES(DEFAULT, 'Water Wisp', NULL);
INSERT INTO cards VALUES(DEFAULT, 'Fire Ant', 1, FALSE, '2020-11-01');
INSERT INTO cards VALUES(DEFAULT, 'Dallas Cowboy', 3, TRUE, '1900-02-03');
INSERT INTO cards VALUES(DEFAULT, 'Steel Refigerator', 1, FALSE, '1234-03-30');
INSERT INTO cards VALUES(DEFAULT, 'Fire', NULL, FALSE, '1990-02-15');

INSERT INTO card_type VALUES(2, 'Dragon');
INSERT INTO card_type VALUES(1, 'Fire');
INSERT INTO card_type VALUES(3, 'Western');
INSERT INTO card_type VALUES(4, 'Rock');

INSERT INTO player VALUES(1, 'Michael', 'Pearson');
INSERT INTO player VALUES(2, 'Michael', 'Ball');
INSERT INTO player VALUES(3, 'Christina', 'Russ');
INSERT INTO player VALUES(4, 'Osama', 'Nagi');

INSERT INTO deck VALUES(1, 2);
INSERT INTO deck values(2, 4);
INSERT INTO deck VALUES(3, 3);
INSERT INTO deck VALUES(4, 1);

INSERT INTO deck_card_jt VALUES(4, 1);
INSERT INTO deck_card_jt VALUES(4, 2);
INSERT INTO deck_card_jt VALUES(2, 1);
-- Reading from the card table
SELECT * FROM card_type;
SELECT * FROM card_table;
SELECT * FROM card_table_deck;
SELECT * FROM cards;
SELECT * FROM deck;
SELECT * FROM player;
SELECT * FROM deck_card_jt;
SELECT card_name, card_type FROM cards;

-- This is an example of using an aggregate function.
SELECT COUNT(*) FROM deck_card_jt WHERE deck_id = 4 AND card_id = 1;

-- Updating a record on the card table
UPDATE cards 
SET card_id = 4
WHERE card_name = 'Water Wisp';

-- Deleting a record on the cards table
DELETE FROM cards 
WHERE card_name = 'Dallas Cowboy' AND card_age = 121;

-- If we wish to view a complete card record, we can choose to join our cards table with the card_type table.
-- This will allow us to view information about the card type as well

-- Inner join
SELECT * FROM cards c
INNER JOIN card_type ct 
ON c.card_type_id = ct.type_id;

-- Outer Join
SELECT * FROM cards c
FULL JOIN card_type ct 
ON c.card_type_id = ct.type_id;

-- Left Join
SELECT * FROM cards c 
LEFT JOIN card_type ct 
ON c.card_type_id = ct.type_id;

-- Right Join
SELECT * FROM cards c 
RIGHT JOIN card_type ct 
ON c.card_type_id = ct.type_id;

--Cross Join
SELECT * FROM cards c 
CROSS JOIN card_type ct;

-- Set operations are different from joins that they combine the results of queries.
-- When using a set operator, you must have the same number of columns in each result set and like
-- data types must be stacked on top of each other.

-- Union: Does not support duplicate values
(SELECT card_id, card_name FROM cards) UNION (SELECT * FROM card_type);

-- Union All: Same as Union, but accepts duplicates
(SELECT card_id, card_name FROM cards) UNION ALL (SELECT * FROM card_type);

-- Intersect: Will return records that are present in both result sets.
(SELECT card_name FROM cards) INTERSECT (SELECT type_name FROM card_type);

-- Except (also called "minus" in some dialects): will return all of the records in the first result set except
-- for the records which happen to be present in the second result set.
(SELECT card_name FROM cards) EXCEPT (SELECT type_name FROM card_type);
