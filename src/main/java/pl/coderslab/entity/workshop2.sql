CREATE DATABASE IF NOT EXISTS workshop2;
USE workshop2;

CREATE TABLE users(
    id INT(11) AUTO_INCREMENT NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(60) NOT NULL,
    PRIMARY KEY (id)
);

# dodawanie użytkownika,
INSERT INTO users(email, username, password) VALUES (?, ?, ?);

# zmiana danych,
UPDATE users SET email = ?, username = ?, password = ? WHERE id = ?;

# pobieranie po id,
SELECT (email, username, password) FROM users WHERE id = ?;

# usuwanie po id,
DELETE FROM users WHERE id = ?;

# pobieranie wszystkich użytkowników.
SELECT * FROM users;