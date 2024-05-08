CREATE TABLE user
(
    user_id          INT PRIMARY KEY AUTO_INCREMENT,
    email            VARCHAR(255) NOT NULL UNIQUE,
    hashed_password  VARCHAR(255) NOT NULL,
    avatar_file_name VARCHAR(255)
);

CREATE TABLE note
(
    note_id   INT PRIMARY KEY AUTO_INCREMENT,
    user_id   INT          NOT NULL,
    title     VARCHAR(255) NOT NULL,
    content   TEXT,
    date      INT,
    is_stared BOOLEAN
);

CREATE TABLE todo
(
    todo_id     INT PRIMARY KEY AUTO_INCREMENT,
    user_id     INT          NOT NULL,
    title       VARCHAR(255) NOT NULL,
    detail      TEXT,
    begin       INT,
    end         INT,
    is_finished BOOLEAN
);
