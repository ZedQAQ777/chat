
CREATE DATABASE
USE `chat`;

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '信息id',
  `userId` char(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '对应的用户id',
  `content` varchar(50) DEFAULT NULL COMMENT '信息内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1006 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='历史信息';

/*Data for the table `message` */

insert  into `message`(`id`,`userId`,`content`) values (1001,'1','B你好'),(1002,'2','A你好'),(1003,'2','我来了'),(1004,'1','我也来了'),(1005,'1','2021-03-07 10:21 增加转换yaml功能');

/*Table structure for table `userr` */

DROP TABLE IF EXISTS `userr`;

CREATE TABLE `userr` (
  `id` char(19) NOT NULL COMMENT '用户id',
  `name` varchar(50) DEFAULT NULL COMMENT '名字',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';

/*Data for the table `userr` */

insert  into `userr`(`id`,`name`) values ('1','A');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
