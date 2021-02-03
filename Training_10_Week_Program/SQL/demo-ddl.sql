-- It is gennerally going to be easiest for you to match your tables to your Java models.

DROP TABLE cards;
-- We need to create a structure that can store data about cards

CREATE TABLE cards(
	card_id INT NOT NULL,
	card_name VARCHAR NOT NULL,
	card_type_id INT,
	card_type VARCHAR,
	face_up BOOL,
	date_created DATE,
	card_age INT
); 