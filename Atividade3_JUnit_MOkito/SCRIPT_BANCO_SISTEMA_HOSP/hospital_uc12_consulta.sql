-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hospital_uc12
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
-- Table structure for table `consulta`
--

DROP TABLE IF EXISTS `consulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consulta` (
  `ID_CONSULTA` int NOT NULL,
  `DATA_HORA` datetime DEFAULT NULL,
  `VALOR` double DEFAULT NULL,
  `NUM_CARTEIRA_CONV` varchar(45) DEFAULT NULL,
  `ID_CONVENIO_FK` int NOT NULL,
  `ID_PACIENTE_FK` int NOT NULL,
  `ID_MEDICO_FK` int NOT NULL,
  `ID_ESPECIALIDADE_FK` int NOT NULL,
  PRIMARY KEY (`ID_CONSULTA`),
  KEY `fk_CONSULTA_CONVENIO1` (`ID_CONVENIO_FK`),
  KEY `fk_CONSULTA_PACIENTE1` (`ID_PACIENTE_FK`),
  KEY `fk_CONSULTA_MEDICO1` (`ID_MEDICO_FK`),
  KEY `fk_CONSULTA_ESPECIALIDADE1` (`ID_ESPECIALIDADE_FK`),
  CONSTRAINT `fk_CONSULTA_CONVENIO1` FOREIGN KEY (`ID_CONVENIO_FK`) REFERENCES `convenio` (`ID_CONVENIO`),
  CONSTRAINT `fk_CONSULTA_ESPECIALIDADE1` FOREIGN KEY (`ID_ESPECIALIDADE_FK`) REFERENCES `especialidade` (`ID_ESPECIALIDADE`),
  CONSTRAINT `fk_CONSULTA_MEDICO1` FOREIGN KEY (`ID_MEDICO_FK`) REFERENCES `medico` (`ID_MEDICO`),
  CONSTRAINT `fk_CONSULTA_PACIENTE1` FOREIGN KEY (`ID_PACIENTE_FK`) REFERENCES `paciente` (`ID_PACIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consulta`
--

LOCK TABLES `consulta` WRITE;
/*!40000 ALTER TABLE `consulta` DISABLE KEYS */;
/*!40000 ALTER TABLE `consulta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-01 19:50:04
