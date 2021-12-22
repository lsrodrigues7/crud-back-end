-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: api_spring
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `codigo_cliente` int NOT NULL AUTO_INCREMENT,
  `bairro_cliente` varchar(255) DEFAULT NULL,
  `codigo_telefone` int DEFAULT NULL,
  `endereco_cliente` varchar(255) DEFAULT NULL,
  `nome_cliente` varchar(255) DEFAULT NULL,
  `numero_telefone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'centro',1,'centro','leonardo rodrigues','99999999999'),(2,'teste',2,'teste','joao pedro morais','88888888888'),(4,'Centro',3,'Kazuo Murakami','Leonardo souza rodrigues','123456789876'),(8,'centro',4,'lutecia','Joao victor','212321324353'),(9,'arlindo eiras',7,'antonio monteiro','joana rodrigues','123456789876');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefone`
--

DROP TABLE IF EXISTS `telefone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefone` (
  `codigo_telefone` int NOT NULL AUTO_INCREMENT,
  `codigo_cliente` int DEFAULT NULL,
  `descricao_telefone` varchar(255) DEFAULT NULL,
  `nome_cliente` varchar(255) DEFAULT NULL,
  `numero_telefone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo_telefone`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefone`
--

LOCK TABLES `telefone` WRITE;
/*!40000 ALTER TABLE `telefone` DISABLE KEYS */;
INSERT INTO `telefone` VALUES (1,0,'leonardo rodrigues','leonardo rodrigues','99999999999'),(2,0,'joao pedro morais','joao pedro morais','88888888888'),(3,NULL,NULL,NULL,'123456789876'),(4,NULL,'Joao victor','Joao victor','212321324353'),(5,NULL,NULL,NULL,'231434356223'),(7,NULL,'joana rodrigues','joana rodrigues','123456789876'),(8,NULL,NULL,NULL,'456384728274'),(9,NULL,NULL,NULL,'334878777222'),(10,NULL,NULL,NULL,'109874627133');
/*!40000 ALTER TABLE `telefone` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-22  0:08:57
