/*polpulate users*/
INSERT INTO users(username,password,enabled) VALUES ('guest','$2a$10$0.ESlGysrPaiW5HaapKwoehzWt5AibgbPPOvMhDv8D6H26QQ/CwhS', TRUE);
INSERT INTO users(username,password,enabled) VALUES ('admin','$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe', TRUE);

/*populate roles*/ 
INSERT INTO authorities (username, authority) VALUES ('guest', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_USER');

/*polpulate timespans*/
INSERT INTO `timespan` VALUES (1,'10:45','10:00'),(2,'11:45','11:00'),(3,'14:15','13:30'),(4,'15:15','14:30'),(5,'16:15','15:30'),(6,'17:15','16:30');

/*polpulate categories*/
INSERT INTO `category` VALUES (1,'Allergist',NULL),(2,'Cardiologist',NULL),(3,'Chiropractor',NULL),(5,'Dermatologist',NULL),(6,'Gastroenterologist',NULL),(7,'Opthalmologist',NULL),(8,'Optometrist',NULL),(9,'Orthopedic Surgeon',NULL),(10,'Pediatrician',NULL),(11,'Primary Care Doctor',NULL),(12,'Psychiatrist',NULL),(13,'Urologist',NULL);

/*populate phones*/
INSERT INTO `phone` VALUES (1,'999','3333','222'),(2,'111','4444','333'),(3,'444','6666','555'),(4,'111','3333','222');

/*populate addresses*/
INSERT INTO `address` VALUES (1,'Fairfield','IA','1000 N 4th','12345'),(2,'Fairfield','IA','1000 Nth','52557'),(3,'Fairfield','IA','1000 N 4th','52557'),(4,'Fairfield','IA','1000 N 4th','52557');

/*populate doctors*/
INSERT INTO `doctor` VALUES (1,'Khanh','Tran','15 years experience',1,1,1),(2,'Tom','Kid','4 years experience',2,10,2),(3,'John','Doe','2 years experience',3,1,3),(4,'David','Pull','1 year experience',4,5,4);

/*populate doctors - timespan*/
INSERT INTO `doctor_timespan` VALUES (1,1),(1,2),(1,3),(1,4),(1,5), (2,1),(2,2),(2,3),(3,1),(3,2),(3,3),(3,4),(3,5),(3,6),(4,1),(4,2),(4,3),(4,4),(4,5),(4,6);
