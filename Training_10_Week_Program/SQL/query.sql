-- Let's add some records to our tables
INSERT INTO cards VALUES(1, 'Dragon Man', 2, 'Dragon', TRUE, '1999-10-02', 21);
INSERT INTO cards("card_name", "card_type") VALUES('Water Wisp', 'Water');
INSERT INTO cards VALUES(2, 'Fire Ant', 1, 'Fire', FALSE, '2020-11-01', 0);
INSERT INTO cards VALUES(3, 'Dallas Cowboy', 2, 'Western', TRUE, '1900-02-03', 121);

-- Reading from the card table
SELECT * FROM cards;
SELECT card_name, card_type FROM cards;

-- Updating a record on the card table
UPDATE cards 
SET card_id = 4
WHERE card_name = 'Water Wisp';

-- Deleting a record on the cards table
DELETE FROM cards 
WHERE card_name = 'Dallas Cowboy' AND card_age = 121;
