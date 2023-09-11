CREATE TABLE IF NOT EXISTS db_users (
      id SERIAL PRIMARY KEY,
      name VARCHAR NOT NULL,
      surname VARCHAR NOT NULL,
      age INT,
      order_id INT,
      FOREIGN KEY (order_id) REFERENCES ORDERS
);

INSERT INTO db_users (name, surname, age, order_id) VALUES ('Ivan', 'Ivanov', 23, 1);
INSERT INTO db_users (name, surname, age, order_id) VALUES ('Sergey', 'Sidorov', 30, 2);
INSERT INTO db_users (name, surname, age, order_id) VALUES ('Petr', 'Petrov', 45, 3);
INSERT INTO db_users (name, surname, age, order_id) VALUES ('Maxim', 'Smirnov', 18, 4);
INSERT INTO db_users (name, surname, age, order_id) VALUES ('Oleg', 'Ivanov', 54, 5);

