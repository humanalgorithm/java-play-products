# --- !Ups
CREATE TABLE Product (
       id INT NOT NULL AUTO_INCREMENT,
       name VARCHAR(255),
       url VARCHAR(255),
       description VARCHAR(255),
       price DECIMAL,
       PRIMARY KEY(id)
);

# --- !Downs
DROP TABLE IF EXISTS product;




