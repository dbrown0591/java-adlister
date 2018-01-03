USE adlister_db;



CREATE TABLE users (
    id INT unsigned not NULL auto_increment,
    username VARCHAR(50),
    email VARCHAR(100) NOT NULL,
    password TEXT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ads (
    id INT unsigned NOT NULL auto_increment,
    user_id VARCHAR(50),
    title  VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    PRIMARY KEY (id),
    foreign key (user_id) REFERENCES users(id)

);