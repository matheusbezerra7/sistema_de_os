-- MySQL dump 10.16  Distrib 10.1.36-MariaDB, for Win32 (AMD64)
--
-- Host: 127.0.0.1    Database: dbhelp
-- ------------------------------------------------------
-- Server version	10.1.36-MariaDB

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
-- Table structure for table `tbclientes`
--

DROP TABLE IF EXISTS `tbclientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbclientes` (
  `idcli` int(11) NOT NULL AUTO_INCREMENT,
  `nomecli` varchar(50) NOT NULL,
  `endcli` varchar(100) DEFAULT NULL,
  `fonecli` varchar(100) NOT NULL,
  `emailcli` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idcli`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbclientes`
--

LOCK TABLES `tbclientes` WRITE;
/*!40000 ALTER TABLE `tbclientes` DISABLE KEYS */;
INSERT INTO `tbclientes` VALUES (1,'Matheus Bezerra Santos','Rua inacio alvarez','1111-1111','matheus.bezerra7@hotmail.com'),(2,'Matias barbosa','Jardim Helena','1111-1111','matiasbarbosa@hotmail.com'),(3,'Messi jogamuito','barcelona espanha','1111-1111','messi10@hotmail.com'),(5,'Gabriella Barbosa','Jardim Helena,2300','1111-1111','gabibarbosa@gmail.org'),(6,'teste teste teste','teste','1111-1111','teste@teste.com'),(7,'Gabriel Gimenes','jardim helena','1111-1122','msadmiasjdm@gmasi.org'),(8,'Geane Ferreira','Jardim helena ,104','1111-1111','teste@teste.com'),(9,'Mike Ross','States','0232-3323','Mikeross@suites.org');
/*!40000 ALTER TABLE `tbclientes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-05  1:56:28
