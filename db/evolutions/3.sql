
# --- !Ups
DROP TABLE IF EXISTS OrderItem;
CREATE TABLE OrderItem (
       id INT NOT NULL AUTO_INCREMENT,
       UUID varchar(255),
       stripeId VARCHAR(255),
       address_id INT,
       FOREIGN KEY(address_id) REFERENCES Address(id),
       PRIMARY KEY(id)

);

# --- !Downs
DROP TABLE IF EXISTS OrderItem;