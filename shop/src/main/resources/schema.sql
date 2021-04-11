create table users (
      username VARCHAR(100) NOT NULL,
      password VARCHAR(100) NOT NULL,
      enabled TINYINT NOT NULL,
      PRIMARY KEY (username)
  );


create table authorities (
      username VARCHAR(100) NOT NULL,
      authority VARCHAR(100) NOT NULL,
      FOREIGN KEY(username) REFERENCES users(username)

  );

ALTER TABLE authorities
ADD CONSTRAINT TEST_UNIQUE UNIQUE ( username, authority );


create table products (
      id INT NOT NULL AUTO_INCREMENT,
      name VARCHAR(100) NOT NULL,
      description VARCHAR(300) NOT NULL,
      image VARCHAR(100) NOT NULL,
      price DECIMAL(20, 2) NOT NULL,
      PRIMARY KEY (id)
  );
