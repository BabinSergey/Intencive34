CREATE TABLE IF NOT EXISTS orders(
    id SERIAL PRIMARY KEY,
    coefficient Double Precision NOT NULL ,
    amount INT NOT NULL,
    route VARCHAR
);

INSERT INTO orders (coefficient, amount, route) VALUES (5.0, 2, 'BUSINESS');
INSERT INTO orders (coefficient, amount, route) VALUES (5.5, 2, 'BUSINESS');
INSERT INTO orders (coefficient, amount, route) VALUES (6.5, 1, 'BUSINESS');
INSERT INTO orders (coefficient, amount, route) VALUES (7.5, 3, 'BUSINESS');
INSERT INTO orders (coefficient, amount, route) VALUES (3.5, 1, 'BUSINESS');