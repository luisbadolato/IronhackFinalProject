DROP SCHEMA IF EXISTS chords_service;
CREATE SCHEMA chords_service;
USE chords_service;

DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject`
	(id BIGINT NOT NULL,
	subject_name VARCHAR(255),
	subject_order INT,
    module_name VARCHAR(16),
	PRIMARY KEY (id));

DROP TABLE IF EXISTS `section`;
CREATE TABLE `section`
	(id BIGINT NOT NULL,
	section_name VARCHAR(255),
	section_order INT,
    subject_id BIGINT,
    FOREIGN KEY (subject_id) REFERENCES `subject`(id),
	PRIMARY KEY (id));

DROP TABLE IF EXISTS `unit`;
CREATE TABLE `unit`
	(id BIGINT NOT NULL,
	unit_name VARCHAR(255),
	unit_order INT,
    section_id BIGINT,
    FOREIGN KEY (section_id) REFERENCES `section`(id),
	PRIMARY KEY (id));

DROP TABLE IF EXISTS `post`;
CREATE TABLE `post`
	(id BIGINT NOT NULL,
	post_title VARCHAR(255),
    post_body VARCHAR(1024),
    unit_id BIGINT,
    FOREIGN KEY (unit_id) REFERENCES `unit`(id),
	PRIMARY KEY (id));

DROP TABLE IF EXISTS `lesson`;
CREATE TABLE `lesson`
	(id BIGINT NOT NULL AUTO_INCREMENT,
	lesson_title VARCHAR(255),
    text_body VARCHAR(1024),
    image_url VARCHAR(255),
    advice_text VARCHAR(255),
    audio_slow_url VARCHAR(255),
    audio_fast_url VARCHAR(255),
    unit_id BIGINT,
    FOREIGN KEY (unit_id) REFERENCES `unit`(id),
	PRIMARY KEY (id));
