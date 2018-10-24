

# --- First database schema

# --- !Ups

CREATE TABLE UserAccount(
       id INT NOT NULL AUTO_INCREMENT,
       password VARCHAR(255),
       fullName VARCHAR(255),
       username VARCHAR(255),
       boolean BOOLEAN default 0,
       primary key (id)
)

# --- !Downs
DROP TABLE IF EXISTS UserAccount;