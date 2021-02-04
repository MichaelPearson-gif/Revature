-- Let's add some records to our tables
INSERT INTO cards VALUES(DEFAULT, 'Dragon Man', 2, TRUE, '1999-10-02');
INSERT INTO cards VALUES(DEFAULT, 'Water Wisp', NULL);
INSERT INTO cards VALUES(DEFAULT, 'Fire Ant', 1, FALSE, '2020-11-01');
INSERT INTO cards VALUES(DEFAULT, 'Dallas Cowboy', 3, TRUE, '1900-02-03');
INSERT INTO cards VALUES(DEFAULT, 'Steel Refigerator', 1, FALSE, '1234-03-30');

INSERT INTO card_type VALUES(2, 'Dragon');
INSERT INTO card_type VALUES(1, 'Fire');
INSERT INTO card_type VALUES(3, 'Western');

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
