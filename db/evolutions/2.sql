
# --- !Ups
CREATE TABLE Address (
       id INT NOT NULL AUTO_INCREMENT,
       address_line1 VARCHAR(255),
       address_city VARCHAR(255),
       address_state VARCHAR(255),
       address_zip VARCHAR(255),
       PRIMARY KEY(id)
);

# --- !Downs
DROP TABLE IF EXISTS Address;
