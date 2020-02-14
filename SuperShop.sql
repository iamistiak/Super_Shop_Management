/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.0.45-community-nt : Database - supershop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`supershop` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `supershop`;

/*Table structure for table `admin_login` */

DROP TABLE IF EXISTS `admin_login`;

CREATE TABLE `admin_login` (
  `ID` int(50) NOT NULL auto_increment,
  `USER NAME` varchar(50) default NULL,
  `PASSWORD` varchar(50) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `admin_login` */

insert  into `admin_login`(`ID`,`USER NAME`,`PASSWORD`) values (1,'aaa','111');

/*Table structure for table `create_account` */

DROP TABLE IF EXISTS `create_account`;

CREATE TABLE `create_account` (
  `Full Name` varchar(50) default NULL,
  `Father Name` varchar(50) default NULL,
  `Present Address` varchar(50) default NULL,
  `Permanent Address` varchar(50) default NULL,
  `Mobile No` varchar(50) default NULL,
  `BirthDay` varchar(50) default NULL,
  `Gender` varchar(50) default NULL,
  `User Name` varchar(50) default NULL,
  `Create Password` varchar(50) default NULL,
  `Confirm Password` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `create_account` */

insert  into `create_account`(`Full Name`,`Father Name`,`Present Address`,`Permanent Address`,`Mobile No`,`BirthDay`,`Gender`,`User Name`,`Create Password`,`Confirm Password`) values ('Arifin','xx','xxx','Feni Computer Institute Boys Hostal','xxx','2000-35-20','male','aaa','aaa','xxx'),('Istiak Ahammed jisan','Zakir Hossain','Gunaboti,Chuaddagram,Cumilla','Feni Computer Institute Boys Hostal','0186919940','2000-35-20','Male','aaa','aaa','xxxx'),('Shuvo','Ahsan ullah','Bijoykora,Chuaddagram,cumilla','Feni Computer Institute boys hostal','018xxxxxxxxxxxxxxxx','2019-49-15','Male','shuvo','shuvo','shuvo'),('Abu bokkor onoy','Sadek Hossain','Gunaboti,chuaddagram,Cumilla','Gunaboti,chuaddagram,Cumilla','018xxxxxxxxxxxxxxxxxxxx','2019-24-23','Male','istiak','382279','382279');

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `ID` int(50) NOT NULL auto_increment,
  `Customer Name` varchar(50) default NULL,
  `Address` varchar(50) default NULL,
  `G-mail` varchar(50) default NULL,
  `Contact` varchar(50) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`ID`,`Customer Name`,`Address`,`G-mail`,`Contact`) values (1,'Jisan','Cumilla','mdjisan@gmail.com','01856745'),(2,'Arifin','Cumilla','arifin@gmail.com','017254845'),(3,'taher ','Feni','jisan@gmail.com','0179644549'),(4,'Akib','Feni','akib@gmail.com','+880 18699954'),(5,'Shuvo','Cumilla','shuvo@gmail.com','+880 1869147865'),(6,'abul kashem','Comilla','kashem@gmail.com','+880 145896794'),(7,'MD','xxxxx','xxxxx@gmail.com','+880 18xxxxxxxxxxxxx');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `ID` int(50) NOT NULL auto_increment,
  `Product Name` varchar(50) default NULL,
  `Price` varchar(50) default NULL,
  `Quantity or Weight` varchar(50) default NULL,
  `Company` varchar(50) default NULL,
  `Details` varchar(50) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `product` */

insert  into `product`(`ID`,`Product Name`,`Price`,`Quantity or Weight`,`Company`,`Details`) values (1,'paper','50','5   PES','bashundara','bd'),(2,'Rice','45','10  KG','Nurjahan','bd'),(3,'SYNSODYNE','175','75   ML','SYNSODYNE','UK'),(4,'ATTA','40','1  KG','Teer','Bangladesh'),(5,'MILK','80','1  KG','PRAN','BANGLADESH'),(6,'BRASH','45','1   PES','EUROFRESH','BANGLADESH'),(7,'MARKER','40','1   PES','MATADOR','BANGLADESH'),(8,'Pandrive','850','1  PES','Adata','Bangladeshi'),(9,'Charger','450','1   PES','Imam','BD'),(10,'Photato','10 ','1  PES','Pran','UK'),(11,'Water','457','58    KG','Pran','efs'),(12,'fdf','fdf','5   L','fsdf','sf'),(13,'Mobile ','10','4  PES','bangladesh','bd'),(14,'Kak','5','12  PES','Star line','Bangladesh');

/*Table structure for table `purchase` */

DROP TABLE IF EXISTS `purchase`;

CREATE TABLE `purchase` (
  `ID` int(50) NOT NULL auto_increment,
  `Date` date default NULL,
  `Supplier Name` varchar(50) default NULL,
  `Product Name` varchar(50) default NULL,
  `Price` varchar(50) default NULL,
  `Quantity` varchar(50) default NULL,
  `Discout` varbinary(50) default NULL,
  `total` int(100) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

/*Data for the table `purchase` */

insert  into `purchase`(`ID`,`Date`,`Supplier Name`,`Product Name`,`Price`,`Quantity`,`Discout`,`total`) values (1,'2019-05-12',NULL,NULL,NULL,NULL,NULL,NULL),(2,'2019-05-01','iuo','paper','546','456','64',646),(3,'2019-05-02','jisan','SYNSODYNE','4','5','5',25),(4,'2019-05-09','Kasher','SYNSODYNE','4545','546','654',645),(5,'2019-05-15','jsian','MARKER','5','4','5',20),(6,'2019-05-24','jisan','BRASH','12','45','No Discount',540),(7,'2019-05-08','df','Rice','7','78','no',546),(8,'2019-05-16','fdsf','Rice','8','8','no',64),(9,'2019-05-16','hj','paper','8','8','no',64),(10,'2019-05-16','dddd','ATTA','20','45','no',900),(11,'2019-05-23','gtrrr','BRASH','545','45','jkg',24525),(12,'2019-05-16','fdfg','Rice','45','45','jhgf',2025),(13,'2019-05-01','df','paper','5','4','v',20),(14,'2019-05-17','xcv','Rice','5','4','jhgh',20),(15,'2019-05-15','salam','SYNSODYNE','2','80','No Discount',160),(16,'2019-05-16','jiss','Rice','4','4','No Discount ',16),(17,'2019-05-16','bokkor','BRASH','25','20','No Discount ',500),(18,'2019-05-17','sdfgh','Rice','87','45','No Discount ',3915),(19,'2019-05-16','fdsf','Rice','78','45','No Discount ',3510),(20,'2019-05-15','ji','BRASH','4','4','No Discount ',16),(21,'2019-05-15','fgh','Rice','8','48','No Discount ',384),(22,'2019-05-16','jisan','SYNSODYNE','45','45','No Discount ',2025),(23,'2019-05-10','ter','SYNSODYNE','34','34','No Discount ',1156),(24,'2019-05-27','jisan','ATTA','45','45','No Discount ',1156),(25,'2019-05-02','fsd','SYNSODYNE','5','5','No Discount ',1156),(26,'2019-05-10','rty','SYNSODYNE','45','45','No Discount ',2025),(27,'2019-05-24','rt','Rice','5','8','No Discount ',40),(28,'2019-05-18','f','SELECT PRODUCT-','54','45','No Discount ',2430),(29,'2019-05-09','x','SYNSODYNE','78','78','No Discount ',6084),(30,'2019-05-24','jisan','Rice','56','50','No Discount ',2800),(31,'2019-05-31','jisan','MILK','30','22','No Discount ',660),(32,'2019-05-15','MS','paper','2','78','No Discount ',156);

/*Table structure for table `supplier` */

DROP TABLE IF EXISTS `supplier`;

CREATE TABLE `supplier` (
  `ID` int(50) NOT NULL auto_increment,
  `Supplier Name` varchar(50) default NULL,
  `Address` varchar(50) default NULL,
  `Company` varchar(50) default NULL,
  `Contact` varchar(50) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `supplier` */

insert  into `supplier`(`ID`,`Supplier Name`,`Address`,`Company`,`Contact`) values (1,'Shuvo','Cumilla','Matador','01854565'),(2,'Istiak','Cumilla','Fresh','01869159940'),(3,'Rayhan','Netrokona','Netrokona','01579755'),(4,'Akib','Feni','Bashundhara','01826462'),(5,'Arifin','Cumilla','Teer agro','01886465'),(6,'Taher ','Foridpur','Molla Super','018546554'),(7,'Niloy','Comilla','Pran','0146467653'),(8,'Badon','Pabna','adong','01825655865');

/*Table structure for table `user_login` */

DROP TABLE IF EXISTS `user_login`;

CREATE TABLE `user_login` (
  `ID` int(50) NOT NULL,
  `user name` varchar(50) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_login` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
