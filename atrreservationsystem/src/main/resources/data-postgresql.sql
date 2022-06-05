-- populate users table
-- Initial table population
INSERT INTO USERS(USERNAME, PASSWORD_HASH, FIRST_NAME, LAST_NAME, EMAIL, ENABLED) VALUES
    ('LeoD', '$2a$10$ocecgV0tbvt9ARWMryvHmeKPiMAL.LnK5u3f1SQEgtsgFXcS1X1dW', 'Leonardo','DiCaprio', 'leoD@gmail.com', TRUE),
    ('JackieC', '$2a$10$ocecgV0tbvt9ARWMryvHmeKPiMAL.LnK5u3f1SQEgtsgFXcS1X1dW', 'Jackie','Chan', 'jackiechan@gmail.com', TRUE),
    ('BruceL', '$2a$10$ocecgV0tbvt9ARWMryvHmeKPiMAL.LnK5u3f1SQEgtsgFXcS1X1dW', 'Bruce','Lee', 'brucelee@ymail.com', TRUE),
    ('ChristK', '$2a$10$ocecgV0tbvt9ARWMryvHmeKPiMAL.LnK5u3f1SQEgtsgFXcS1X1dW', 'Christopher','Nolan', 'ChristNolan@gmail.com', TRUE),
    ('TomC', '$2a$10$ocecgV0tbvt9ARWMryvHmeKPiMAL.LnK5u3f1SQEgtsgFXcS1X1dW', 'Tom','Cruise', 'tomcruise@gmail.com', TRUE);

-- populate ROLES table
-- Initial table population
INSERT INTO ROLES(ROLE_NAME) VALUES('USER');

-- populate USERS_ROLES table
-- Initial table population
INSERT INTO USERS_ROLES (USER_ID, ROLE_ID) VALUES(1, 1);
INSERT INTO USERS_ROLES (USER_ID, ROLE_ID) VALUES(2, 1);

-- populate locations
INSERT INTO LOCATIONS (address_str,city,state_cd,POSTAL_CODE) VALUES
    ('198 E Delaware Pl','Chicago','Illinois',60611),
    ('401 N Wabash Ave','Chicago','Illinois',60601),
    ('243 E Ontario St','Chicago','Illinois',60611),
    ('301 S Market St','San Jose','California',95113),
    ('1717 N Akard St','Dallas','Texas', 75201);

-- populate hotels
insert into hotels (hotel_name, location_id) values ('Hilton Chicago', 1);
insert into hotels (hotel_name, location_id) values ('Trump International Hotel', 2);
insert into hotels (hotel_name, location_id) values ('The Aloft', 3);
insert into hotels (hotel_name, location_id) values ('San Jose Marriott', 4);
insert into hotels (hotel_name, location_id) values ('Fairmont Dallas', 5);


-- populate room_types
insert into room_types(ROOM_TYPE_STR) values('Single Room');
insert into room_types(ROOM_TYPE_STR) values('Double Room');
insert into room_types(ROOM_TYPE_STR) values('Queen Room');

-- populate rooms
insert into rooms(ROOM_TYPE_ID, hotel_id, guests, COST_PER_NIGHT,room_name) values (1, 1 , 2, 250,'R1');
insert into rooms(ROOM_TYPE_ID, hotel_id, guests, COST_PER_NIGHT,room_name) values (2, 1 , 4, 500,'R2');
insert into rooms(ROOM_TYPE_ID, hotel_id, guests, COST_PER_NIGHT,room_name) values (3, 1 , 6, 800,'R3');
insert into rooms(ROOM_TYPE_ID, hotel_id, guests, COST_PER_NIGHT,room_name) values (1, 2 , 2, 300,'R1');
insert into rooms(ROOM_TYPE_ID, hotel_id, guests, COST_PER_NIGHT,room_name) values (2, 2 , 4, 600,'R2');
insert into rooms(ROOM_TYPE_ID, hotel_id, guests, COST_PER_NIGHT,room_name) values (3, 2 , 6, 1000,'R3');
insert into rooms(ROOM_TYPE_ID, hotel_id, guests, COST_PER_NIGHT,room_name) values (1, 3 , 2, 150,'R1');
insert into rooms(ROOM_TYPE_ID, hotel_id, guests, COST_PER_NIGHT,room_name) values (2, 3 , 4, 250,'R2');
insert into rooms(ROOM_TYPE_ID, hotel_id, guests, COST_PER_NIGHT,room_name) values (3, 4 , 6, 400,'R1');
insert into rooms(ROOM_TYPE_ID, hotel_id, guests, COST_PER_NIGHT,room_name) values (1, 5 , 2, 250,'R1');
insert into rooms(ROOM_TYPE_ID, hotel_id, guests, COST_PER_NIGHT,room_name) values (2, 5 , 4, 500,'R2');
insert into rooms(ROOM_TYPE_ID, hotel_id, guests, COST_PER_NIGHT,room_name) values (3, 5 , 6, 800,'R3');


-- populate reservations
insert into RESERVATIONS(START_DT, END_DT, USER_ID, ROOM_ID) values('2021-04-15','2021-04-20',2,1);
insert into RESERVATIONS(START_DT, END_DT, USER_ID, ROOM_ID) values('2021-05-20','2021-05-25',1,2);


-- populate payment table
insert into payment(user_id, card_type, card_holder_name, card_number, cvv,exp_dt) values(2, 'Master Card','Jackie Chan',2483003122003098, 456,'2027-04-15');
insert into payment(user_id, card_type, card_holder_name, card_number, cvv,exp_dt) values(1, 'Visa','Leonardo DiCaprio',2223003122003222, 254,'2031-04-15');
