-- MySQL dump 10.13  Distrib 8.0.26, for Linux (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `idbook` int(11) NOT NULL,
  `service` varchar(45) DEFAULT NULL,
  `vehicle` int(17) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `user_id_user` int(11) NOT NULL,
  `vehicle_id_vehicle` int(11) NOT NULL,
  `user` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idbook`),
  UNIQUE KEY `idbook_UNIQUE` (`idbook`),
  KEY `fk_book_user1_idx` (`user_id_user`),
  KEY `fk_book_vehicle1_idx` (`vehicle_id_vehicle`),
  CONSTRAINT `fk_book_user1` FOREIGN KEY (`user_id_user`) REFERENCES `user` (`id_user`),
  CONSTRAINT `fk_book_vehicle1` FOREIGN KEY (`vehicle_id_vehicle`) REFERENCES `vehicle` (`id_vehicle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'changing tire',1,'2021-07-04','change front tire','progression',1,1,'1'),(2,'change oil',1,'2021-06-05','oil DW500x','progression',1,1,'1'),(3,'change brakes',1,'2021-07-20','change all four brakes','done',1,2,'1'),(4,'engine deep clean',1,'2021-05-04','engine deep clean - Master clean','progression',1,1,'1');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice` (
  `id_invoice` int(11) NOT NULL,
  `maintenance_description` varchar(45) DEFAULT NULL,
  `amount` varchar(45) DEFAULT NULL,
  `maintenance_id_maintenance` int(11) NOT NULL,
  PRIMARY KEY (`id_invoice`),
  UNIQUE KEY `id_invoice_UNIQUE` (`id_invoice`),
  KEY `fk_invoice_maintenance1_idx` (`maintenance_id_maintenance`),
  CONSTRAINT `fk_invoice_maintenance1` FOREIGN KEY (`maintenance_id_maintenance`) REFERENCES `maintenance` (`id_maintenance`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maintenance`
--

DROP TABLE IF EXISTS `maintenance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maintenance` (
  `id_maintenance` int(11) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `description` varchar(120) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `book_idbook` int(11) NOT NULL,
  PRIMARY KEY (`id_maintenance`),
  UNIQUE KEY `id_maintenance_UNIQUE` (`id_maintenance`),
  KEY `fk_maintenance_book1_idx` (`book_idbook`),
  CONSTRAINT `fk_maintenance_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maintenance`
--

LOCK TABLES `maintenance` WRITE;
/*!40000 ALTER TABLE `maintenance` DISABLE KEYS */;
INSERT INTO `maintenance` VALUES (1,'Total','The customer asked for titanium disks',1,3),(2,'Partial','chenge oil - client prefers Castrol',0,2),(3,'Total','change tyres - Not refurbished',1,1),(4,'Total','clean the whole engine - automatic transmission',1,4);
/*!40000 ALTER TABLE `maintenance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maintenance_supply`
--

DROP TABLE IF EXISTS `maintenance_supply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maintenance_supply` (
  `maintenance_id_maintenance` int(11) NOT NULL,
  `supply_id_supply` int(11) NOT NULL,
  PRIMARY KEY (`maintenance_id_maintenance`,`supply_id_supply`),
  KEY `fk_maintenance_has_supply_supply1_idx` (`supply_id_supply`),
  KEY `fk_maintenance_has_supply_maintenance_idx` (`maintenance_id_maintenance`),
  CONSTRAINT `fk_maintenance_has_supply_maintenance` FOREIGN KEY (`maintenance_id_maintenance`) REFERENCES `maintenance` (`id_maintenance`),
  CONSTRAINT `fk_maintenance_has_supply_supply1` FOREIGN KEY (`supply_id_supply`) REFERENCES `supply` (`id_supply`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maintenance_supply`
--

LOCK TABLES `maintenance_supply` WRITE;
/*!40000 ALTER TABLE `maintenance_supply` DISABLE KEYS */;
INSERT INTO `maintenance_supply` VALUES (2,1),(3,1),(4,1),(1,2),(4,2),(4,3);
/*!40000 ALTER TABLE `maintenance_supply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supply`
--

DROP TABLE IF EXISTS `supply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supply` (
  `id_supply` int(11) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `brand` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_supply`),
  UNIQUE KEY `id_supply_UNIQUE` (`id_supply`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supply`
--

LOCK TABLES `supply` WRITE;
/*!40000 ALTER TABLE `supply` DISABLE KEYS */;
INSERT INTO `supply` VALUES (1,'tyre car','goodyea'),(2,'wheel','goober'),(3,' Castrol GTX',' Castrol');
/*!40000 ALTER TABLE `supply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `surname` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE KEY `id_user_UNIQUE` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'José Roberto da','Duré','12345',839918477,'robertodure1990@gmail.com','Dublin, Ireland');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle` (
  `id_vehicle` int(11) NOT NULL,
  `make` varchar(45) DEFAULT NULL,
  `model` varchar(45) DEFAULT NULL,
  `engine` varchar(45) DEFAULT NULL,
  `licence` int(12) DEFAULT NULL,
  PRIMARY KEY (`id_vehicle`),
  UNIQUE KEY `id_vehicle_UNIQUE` (`id_vehicle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES (1,'Volkswagen','Golf','petrol',96786867),(2,'BMW','200i','Diesel',45667889);
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-14 15:06:00
