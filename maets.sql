-- MySQL dump 10.16  Distrib 10.1.26-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: maets
-- ------------------------------------------------------
-- Server version	10.1.26-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `gamesstoreinfo`
--

DROP TABLE IF EXISTS `gamesstoreinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gamesstoreinfo` (
  `productID` int(11) NOT NULL,
  `name` varchar(25) NOT NULL,
  `price` double NOT NULL,
  `ageRating` int(2) NOT NULL,
  `description` varchar(500) NOT NULL,
  `minimumSpecs` varchar(100) NOT NULL,
  `genres` varchar(50) NOT NULL,
  `publisherID` int(11) NOT NULL,
  PRIMARY KEY (`productID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gamesstoreinfo`
--

LOCK TABLES `gamesstoreinfo` WRITE;
/*!40000 ALTER TABLE `gamesstoreinfo` DISABLE KEYS */;
INSERT INTO `gamesstoreinfo` VALUES (0,'Game_Name',69.99,12,'This is a video game.','You\'ll need a lot to run this bad boy.','Horror',1);
/*!40000 ALTER TABLE `gamesstoreinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `moviestoreinfo`
--

DROP TABLE IF EXISTS `moviestoreinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `moviestoreinfo` (
  `productID` int(11) NOT NULL,
  `name` varchar(25) NOT NULL,
  `price` double NOT NULL,
  `ageRating` int(2) NOT NULL,
  `description` varchar(500) NOT NULL,
  `runtime` int(11) NOT NULL,
  `genres` varchar(50) NOT NULL,
  `publisherID` int(11) NOT NULL,
  PRIMARY KEY (`productID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `moviestoreinfo`
--

LOCK TABLES `moviestoreinfo` WRITE;
/*!40000 ALTER TABLE `moviestoreinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `moviestoreinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-22 18:53:54
