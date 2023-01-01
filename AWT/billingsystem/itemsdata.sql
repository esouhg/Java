DROP TABLE IF EXISTS `items`;
CREATE TABLE `items` (
  `id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `rate` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `items` WRITE;
INSERT INTO `items` VALUES (1,'Margherita',110),(2,'Corn n Cheese',180),(3,'Paneer Paratha',210),(4,'Farmhouse',260),(5,'Peppy Paneer',260),(6,'Veg Extravaganza',300),(7,'Veggie Paradise',260),(8,'The 4 Cheese Pizza',350),(9,'Creamy Tomato Pasta Pizza',260),(10,'Moroccan Spice Pasta Pizza - Veg',180),(11,'Fresh Veggie',210),(12,'Double Cheese Margherita',210),(13,'Mexican Green Wave',260),(14,'Deluxe Veggie',300),(15,'Paneer Makhani',300),(16,'Indi Tandoori Paneer',300),(17,'Cheese n Tomato',210),(18,'Achari Do Pyaaza',210),(19,'The Cheese Dominator',350),(20,'Veg Loaded',160),(21,'Non Veg Loaded',170),(22,'Paneer n Onion',120),(23,'Paneer Barbeque Chicken',120),(24,'Cheesy',110),(25,'Chicken Sausage',110),(26,'Capsicum',90),(27,'Golden Corn',90),(28,'Tomato',60),(29,'Onion',70),(30,'Chicken Keema Paratha',250),(31,'Pepper Barbeque Chicken',250),(32,'Chicken Sausage (non pizzamania)',200),(33,'Creamy Tomato Pasta Pizza - Non Veg',280),(34,'Moroccan Spice Pasta Pizza - Non Veg',280),(35,'Chicken Domintor',360),(36,'Spiced Double Chicken',310),(37,'Chicken Maximus',400),(38,'Top 5 Chicken Feast Pizza',400),(39,'Indo Fusion Chicken Pizza',400),(40,'Chicken Golden Delight',310),(41,'Non Veg Supreme',360),(42,'Chicken Pepperoni',360),(43,'Chicken Fiesta',310),(44,'Pepper Barbeque & Onion',280),(45,'Indi Chicken Tikka',360),(46,'Keema Do Pyaaza',250),(47,'Burger Pizza - Non Veg',160),(48,'Basil Pesto Dip',50),(49,'Harissa Dip',50),(50,'Red Velvet Lava Cake',140),(51,'Tomato Ketchup',1),(52,'Garlic Breadsticks',110),(53,'Cheesy Jalapeno Dip',30),(54,'Cheesy Dip',30),(55,'Choco Lava Cake',110),(56,'Butterscotch Mousse Cake',110),(57,'Taco Mexicana Non Veg',160),(58,'Taco Mexicana Veg',140),(59,'Crinkle Fries',70);
UNLOCK TABLES;
