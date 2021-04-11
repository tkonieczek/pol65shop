INSERT INTO users(username,password,enabled) VALUES ('marian','$2a$10$Ln3A/k6sOL.MEnM8iphyDOhwpoFyGKavz2qk2Z7vHRC.Np6JZ/qoa', true);
INSERT INTO users(username,password,enabled) VALUES ('mariola','$2a$10$9kHiP/C5l9R3eMeam.43FO52pQUg0WgLFYfMksWRDfSdDmmVrpN6u', true);
INSERT INTO users(username,password,enabled) VALUES ('admin','$2a$10$LVDzLapcfjvVfa04ZNhVcOcUEyL57.sEV/KddKIdQioWm61YmRZMG', true);


INSERT INTO authorities (username, authority) VALUES ('marian', 'USER');
INSERT INTO authorities (username, authority) VALUES ('mariola', 'USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ADMIN');

INSERT INTO products (name, description, image, price) VALUES ('Gray Shoe', 'Gray Shoe description', 'prod_2.png', 20.0);
INSERT INTO products (name, description, image, price) VALUES ('Blue Shoe High Heels', 'Blue Shoe High Heels description', 'prod_3.png', 15.0);
INSERT INTO products (name, description, image, price) VALUES ('Denim Jacket', 'Denim Jacket description', 'model_5.png', 5.5);
INSERT INTO products (name, description, image, price) VALUES ('Leather Green Bag', 'Leather Green Bag description', 'prod_1.png', 50.0);
INSERT INTO products (name, description, image, price) VALUES ('Smooth Cloth', 'Smooth Cloth description', 'model_1.png', 50.0);
INSERT INTO products (name, description, image, price) VALUES ('Yellow Jacket', 'Yellow Jacket description', 'model_7.png', 50.0);