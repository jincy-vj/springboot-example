-- Drop tables if they exist
DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS product;

-- Create tables
CREATE TABLE product (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    quantity INT,
    price DOUBLE
);

CREATE TABLE users (
    id INT PRIMARY KEY,
    name VARCHAR(150),
    email VARCHAR(100)
);

CREATE TABLE customer (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(100),
    product_id INT,
    FOREIGN KEY (product_id) REFERENCES product(id)
);

-- Insert data into tables
INSERT INTO product (name, quantity, price) VALUES ('A', 5, 10.6);
INSERT INTO product (name, quantity, price) VALUES ('B', 3, 200.8);
INSERT INTO product (name, quantity, price) VALUES ('C', 1, 50.1);
INSERT INTO product (name, quantity, price) VALUES ('D', 2, 600.00);

INSERT INTO users (id, name, email) VALUES (1, 'Thara', 't@gmail.com');
INSERT INTO users (id, name, email) VALUES (2, 'Binu', 'b@gmail.com');
INSERT INTO users (id, name, email) VALUES (3, 'Miya', 'm@gmail.com');
INSERT INTO users (id, name, email) VALUES (4, 'Dinoope', 'd@gmail.com');

INSERT INTO customer (id, name, email, product_id) VALUES (100, 'Dinoope', 'd@gmail.com', 1);
