CREATE TABLE IF NOT EXISTS users (
                                     id serial PRIMARY KEY,
                                     country VARCHAR(255),
    date_of_birth TIMESTAMP NOT NULL,
    email VARCHAR(255),
    first_name VARCHAR(255),
    gender VARCHAR(255),
    last_name VARCHAR(255),
    occupation VARCHAR(255),
    password VARCHAR(255),
    profile_photo_url VARCHAR(255),
    role VARCHAR(255)
    );
select * from users