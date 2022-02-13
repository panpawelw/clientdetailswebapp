INSERT INTO CLIENTS (id, username, password, email, forename, surname) VALUES
(1, 'jankowalski', 'passwordj', 'jankowalski@email.com', 'Jan', 'Kowalski'),
(2, 'mariakownacka', 'passwordm', 'mariakownacka@email.com', 'Maria', 'Kownacka'),
(3, 'henryksienkiewicz', 'passwordh', 'henryksienkiewicz@email.com', 'Henryk', 'Sienkiewicz');

INSERT INTO ADDRESSES (id, street, house_number, flat_number, postcode, city, country, client_id) VALUES
(1, 'ul. Hallera', '19', '1', '00-000', 'Warszawa', 'Polska', 1),
(2, 'ul. Sucha', '4', '3', '00-000', 'Gdynia', 'Polska', 2),
(3, 'ul. Szkocka', '2', '7', '00-000', 'Kutno', 'Polska', 3),
(4, 'pl. Konstytucji', '09', '2', '00-000', 'Kutno', 'Polska', 3);