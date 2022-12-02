
DROP TABLE IF EXISTS concert_merch_purchase;
DROP TABLE IF EXISTS concert_ticket_purchase;
DROP TABLE IF EXISTS concert_show;
DROP TABLE IF EXISTS concert_attendee;


CREATE  TABLE concert_attendee(
    concert_attendee_id int  NOT NULL AUTO_INCREMENT,
    concert_attendee_name varchar(40) NOT NULL,

    PRIMARY KEY (concert_attendee_id)
    );

CREATE TABLE concert_show(
    concert_show_id INT NOT NULL  AUTO_INCREMENT,
    concert_artist varchar(60) NOT NULL,
    concert_attendee_id INT NOT NULL  ,
    PRIMARY KEY (concert_show_id),
    FOREIGN KEY (concert_attendee_id) references concert_attendee (concert_attendee_id)
);

CREATE TABLE concert_ticket_purchase(
    concert_ticket_purchase_id INT NOT NULL  AUTO_INCREMENT,
    concert_attendee_id INT NOT NULL ,
    concert_show_id INT NOT NULL ,
    concert_name varchar(60),

    PRIMARY KEY (concert_ticket_purchase_id),
    FOREIGN KEY (concert_attendee_id) references concert_attendee (concert_attendee_id),
    FOREIGN KEY (concert_show_id) references concert_show (concert_attendee_id)

);

CREATE TABLE concert_merch_purchase(
    concert_merch_purchase_id INT NOT NULL  AUTO_INCREMENT,
    concert_merch_item varchar(40) NOT NULL,
    concert_attendee_id INT NOT NULL ,

    PRIMARY KEY (concert_merch_purchase_id),
    FOREIGN KEY (concert_attendee_id) references concert_attendee (concert_attendee_id)

    );