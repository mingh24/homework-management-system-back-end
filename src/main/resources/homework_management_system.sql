-- MySQL dump 10.13  Distrib 8.0.19, for osx10.15 (x86_64)
--
-- Host: 127.0.0.1    Database: homework_management_system
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `homework`
--

DROP TABLE IF EXISTS `homework`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `homework` (
  `homework_id` int NOT NULL AUTO_INCREMENT,
  `teacher_id` int NOT NULL,
  `homework_title` varchar(30) NOT NULL,
  `homework_content` text NOT NULL,
  PRIMARY KEY (`homework_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `homework`
--

LOCK TABLES `homework` WRITE;
/*!40000 ALTER TABLE `homework` DISABLE KEYS */;
INSERT INTO `homework` VALUES (1,1001,'Java EE 01','作业管理系统'),(2,1001,'Java EE 02','将作业管理系统部署到服务器上'),(3,1002,'软件测试与质量保证 01','设计微信朋友圈的测试用例'),(4,1002,'软件测试与质量保证 02','在第一次作业基础上，引入等价类划分与边界值'),(5,1003,'软件系统构思综合实践 01','分析现有选课系统，设立新选课系统的改进目标'),(6,1004,'软件过程与改进 01','基于CMMI对项目团队进行过程管理'),(7,1003,'软件系统构思综合训练 02','给出新选课系统的项目方案建议'),(9,1004,'软件过程与改进 02','使用FMEA对项目团队的风险进行分析'),(10,1001,'项目管理 01','简述项目管理的五大过程组与十大知识领域');
/*!40000 ALTER TABLE `homework` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `student_id` int NOT NULL,
  `student_name` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (17301001,'小红','483a4f5e8619d13ee53902bf7c397e18'),(17301002,'小橙','90aac9cb79ef41057e0088d08e13db78'),(17301003,'小黄','f9f603484a0388ae3e58096a34cb0aa4'),(17301004,'小绿','6d90758309c00d83e20590db0629840c');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_homework`
--

DROP TABLE IF EXISTS `student_homework`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_homework` (
  `student_homework_id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `homework_id` int NOT NULL,
  `title` varchar(30) NOT NULL,
  `content` text NOT NULL,
  `teacher_comment` text,
  PRIMARY KEY (`student_homework_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_homework`
--

LOCK TABLES `student_homework` WRITE;
/*!40000 ALTER TABLE `student_homework` DISABLE KEYS */;
INSERT INTO `student_homework` VALUES (1,17301001,1,'作业管理系统','homework-management-system','设计得还不错，可以尝试一下把前后端分离。'),(2,17301002,1,'基于Vue和SpringBoot的前后端分离的作业管理系统','https://github.com/Yi1275432232/homework-management-system-front-end',''),(3,17301002,2,'通过Nginx反向代理','https://github.com/Yi1275432232/homework-management-system-back-end',NULL),(5,17301002,6,'CMMI v1.3','CMMI v1.3',NULL),(6,17301003,5,'选课系统改进目标','大概构想一下功能性需求与非功能性需求',NULL),(7,17301004,3,'朋友圈测试用例','思维导图',NULL),(8,17301003,10,'项目管理的五大过程组与十大知识领域','🙌没有人\n\n👐比我\n\n👌更懂\n\n☝项目管理',NULL);
/*!40000 ALTER TABLE `student_homework` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `teacher_id` int NOT NULL,
  `teacher_name` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1001,'刘老师','680d33d7a78b92238d2e6c81d6252f1d'),(1002,'张老师','bc48fad568263928ebbd3bd16bf0e944'),(1003,'李老师','2e2ffb30964d1d92a00639d6586660fa'),(1004,'王老师','25b1169c4839076083bdfa8d40524f5f');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-19 18:34:32
