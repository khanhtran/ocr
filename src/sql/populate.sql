 INSERT INTO users(username,password,enabled) VALUES ('guest','$2a$10$0.ESlGysrPaiW5HaapKwoehzWt5AibgbPPOvMhDv8D6H26QQ/CwhS', TRUE);
INSERT INTO users(username,password,enabled) VALUES ('admin','$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe', TRUE);
 
INSERT INTO authorities (username, authority) VALUES ('guest', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_USER');
 

INSERT INTO `location` VALUES (NULL,'442 Glenwood Avenue','Culver City','CA', '87547');
INSERT INTO `location` VALUES (NULL,'1 Yellow Brook Road','Emerald City','OZ', '12345');
 
INSERT INTO `employee` VALUES (NULL,12, 8754,'Curious','George','Boy Monkey',1,"guest");
INSERT INTO `employee` VALUES (NULL,123, 8733,'Allen','Rench','Torque Master',2,"admin");

INSERT INTO `timespan` VALUES (1,'10:45','10:00'),(2,'11:45','11:00'),(3,'14:15','13:30'),(4,'15:15','14:30'),(5,'16:15','15:30'),(6,'17:15','16:30');					