/*
SQLyog Ultimate - MySQL GUI v8.2
MySQL - 8.0.30 : Database - blog
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`blog` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `blog`;

/*Table structure for table `article` */

DROP TABLE IF EXISTS `article`;

CREATE TABLE `article` (
                           `id` bigint NOT NULL AUTO_INCREMENT,
                           `title` varchar(100) DEFAULT NULL,
                           `content` text,
                           `cid` bigint DEFAULT NULL,
                           `uid` bigint DEFAULT NULL,
                           `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                           `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb3;

/*Data for the table `article` */

insert  into `article`(`id`,`title`,`content`,`cid`,`uid`,`create_time`,`update_time`) values (9,'Spring轻量级框架','spring',2,1,'2023-06-28 12:27:41','2023-06-28 12:27:41'),(11,'Vue前端框架','vue',2,1,'2023-06-28 12:30:17','2023-06-28 12:30:17'),(19,'Java','java',3,1,'2023-07-11 20:20:45','2023-07-11 20:20:45'),(27,'9999',NULL,NULL,NULL,'2023-07-12 14:12:11','2023-07-12 14:12:11');

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
                            `cid` bigint NOT NULL AUTO_INCREMENT,
                            `cname` varchar(100) DEFAULT NULL,
                            `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                            `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                            PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;

/*Data for the table `category` */

insert  into `category`(`cid`,`cname`,`create_time`,`update_time`) values (2,'java','2023-06-28 09:59:54','2023-06-28 09:49:54'),(3,'mysql','2023-06-28 09:50:03','2023-06-28 09:50:03'),(9,'vue','2023-07-11 20:28:31','2023-07-11 20:28:31');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
                        `uid` bigint NOT NULL AUTO_INCREMENT,
                        `username` varchar(20) DEFAULT NULL,
                        `password` varchar(20) DEFAULT NULL,
                        `phone` varchar(20) DEFAULT NULL,
                        `introduction` varchar(255) DEFAULT NULL,
                        `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                        `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                        PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

/*Data for the table `user` */

insert  into `user`(`uid`,`username`,`password`,`phone`,`introduction`,`create_time`,`update_time`) values (1,'lucy','123456','13567890987','334666777','2023-06-28 10:31:48','2023-06-28 10:31:48'),(2,'1','1','1','1','2023-07-11 20:37:19','2023-07-11 20:37:19');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
