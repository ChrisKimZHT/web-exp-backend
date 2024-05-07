CREATE TABLE user
(
    id             INT PRIMARY KEY AUTO_INCREMENT,
    email          VARCHAR(255) NOT NULL,
    hashedPassword VARCHAR(255) NOT NULL,
    avatarFileName VARCHAR(255)
);

CREATE TABLE note
(
    noteId   INT PRIMARY KEY AUTO_INCREMENT,
    userId   INT          NOT NULL,
    title    VARCHAR(255) NOT NULL,
    content  TEXT,
    date     TIMESTAMP,
    isStared BOOLEAN
);

CREATE TABLE todo
(
    todoId     INT PRIMARY KEY AUTO_INCREMENT,
    userId     INT          NOT NULL,
    title      VARCHAR(255) NOT NULL,
    detail     TEXT,
    beginDate  TIMESTAMP,
    endDate    TIMESTAMP,
    isDeadline BOOLEAN,
    isFinished BOOLEAN
);
