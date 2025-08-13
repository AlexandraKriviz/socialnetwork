CREATE TABLE IF NOT EXISTS network_users (
  id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  name     VARCHAR(255),
  surname  VARCHAR(255),
  login    VARCHAR(255),
  password VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS messages (
 id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
 text        VARCHAR(255),
 sender_id   BIGINT UNSIGNED,
 receiver_id BIGINT UNSIGNED,
 status      VARCHAR(255),
 CONSTRAINT fk_messages_sender
 FOREIGN KEY (sender_id)   REFERENCES network_users(id),
 CONSTRAINT fk_messages_receiver
 FOREIGN KEY (receiver_id) REFERENCES network_users(id)
);

