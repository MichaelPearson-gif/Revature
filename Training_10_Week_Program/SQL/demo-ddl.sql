-- It is gennerally going to be easiest for you to match your tables to your Java models.

DROP TABLE cards;
-- We need to create a structure that can store data about cards

CREATE TABLE cards(
	card_id INT PRIMARY KEY,
	card_name VARCHAR NOT NULL,
	card_type_id INT REFERENCES card_type(type_id),
	face_up BOOL,
	date_created DATE
); 

DROP TABLE card_type;
CREATE TABLE card_type(
	type_id INT PRIMARY KEY,
	type_name VARCHAR NOT NULL UNIQUE
);

DROP TABLE player;
CREATE TABLE player(
	player_id INT PRIMARY KEY,
	first_name VARCHAR,
	last_name VARCHAR
);

CREATE TABLE deck(
	deck_id INT PRIMARY KEY,
	player_id INT REFERENCES player(player_id)
);

-- To showcase a many-to-many relationship between our deck and card entities
-- we will want a bridge table (also called a join table).

CREATE TABLE deck_card_jt(
	deck_id INT REFERENCES deck(deck_id),
	card_id INT REFERENCES cards(card_id),
	CONSTRAINT deck_card_pk  PRIMARY KEY(deck_id, card_id)
);