CREATE TABLE usr
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    email      VARCHAR(255),
    CONSTRAINT pk_usr PRIMARY KEY (id)
);

CREATE TABLE role
(
    id      BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    role    INTEGER,
    user_id BIGINT,
    CONSTRAINT pk_role PRIMARY KEY (id)
);
ALTER TABLE role
    ADD CONSTRAINT FK_ROLE_ON_USER FOREIGN KEY (user_id) REFERENCES usr (id);

CREATE TABLE task
(
    id      BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    text    VARCHAR(255),
    user_id BIGINT,
    date    TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_task PRIMARY KEY (id)
);
ALTER TABLE task
    ADD CONSTRAINT FK_TASK_ON_USER FOREIGN KEY (user_id) REFERENCES usr (id);
