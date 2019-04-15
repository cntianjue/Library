/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : library

Target Server Type    : MYSQL
Target Server Version : 50615
File Encoding         : 65001

Date: 2019-04-15 17:10:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bookinfo
-- ----------------------------
DROP TABLE IF EXISTS `bookinfo`;
CREATE TABLE `bookinfo` (
  `bno` int(11) DEFAULT NULL,
  `content` varchar(10) DEFAULT NULL,
  `bname` varchar(50) DEFAULT NULL,
  `writer` varchar(10) DEFAULT NULL,
  `company` varchar(50) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookinfo
-- ----------------------------
INSERT INTO `bookinfo` VALUES ('1', 'TR9/12', 'dddd', '孙业', '北京大学出版社', '21', '102');
INSERT INTO `bookinfo` VALUES ('2', 'TR7/90', '大学英语', '胡玲', '清华大学出版社', '13', '111');
INSERT INTO `bookinfo` VALUES ('3', 'TP4/13', '数据库基础', '马凌云', '人民邮电出版社', '23', '111');
INSERT INTO `bookinfo` VALUES ('4', 'TP4/13', '数据库基础', '马凌云', '人民邮电出版社', '23', '111');
INSERT INTO `bookinfo` VALUES ('5', 'TP4/14', 'FoxPro大全', '周虹', '科学出版社', '33', '111');
INSERT INTO `bookinfo` VALUES ('6', 'TP4/15', '计算机网络', '黄力钧', '高等教育出版社', '22', '111');
INSERT INTO `bookinfo` VALUES ('7', 'TP33', '物理', '典韦', '浙江出版社', '33', '111');
INSERT INTO `bookinfo` VALUES ('8', 'TP3/12', 'FoxBASE', '张三', '电子工业出版社', '24', '111');
INSERT INTO `bookinfo` VALUES ('9', 'TS7/21', '高等数学', '刘明', '高等教育出版社', '20', '111');
INSERT INTO `bookinfo` VALUES ('10', 'TR9/12', '线性代数', '孙业', '北京大学出版社', '21', '111');
INSERT INTO `bookinfo` VALUES ('11', 'TR7/90', '大学英语', '胡玲', '清华大学出版社', '13', '111');
INSERT INTO `bookinfo` VALUES ('12', 'TP4/13', '数据库基础', '马凌云', '人民邮电出版社', '23', '111');
INSERT INTO `bookinfo` VALUES ('13', 'TP4/13', '数据库基础', '马凌云', '人民邮电出版社', '23', '111');
INSERT INTO `bookinfo` VALUES ('14', 'TP4/14', 'FoxPro大全', '周虹', '科学出版社', '33', '111');
INSERT INTO `bookinfo` VALUES ('15', 'TP4/15', '计算机网络', '黄力钧', '高等教育出版社', '22', '111');
INSERT INTO `bookinfo` VALUES (null, '321321', null, '32131', '3131', '31321', null);

-- ----------------------------
-- Table structure for bookinfo1
-- ----------------------------
DROP TABLE IF EXISTS `bookinfo1`;
CREATE TABLE `bookinfo1` (
  `bno` int(11) NOT NULL AUTO_INCREMENT,
  `price` int(11) DEFAULT NULL,
  `writer` varchar(20) DEFAULT NULL,
  `publication` date DEFAULT NULL,
  `company` varchar(20) DEFAULT NULL,
  `content` varchar(100) DEFAULT NULL,
  `quantity` int(255) DEFAULT NULL,
  `bname` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bno`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookinfo1
-- ----------------------------
INSERT INTO `bookinfo1` VALUES ('3', '33', '王二', '2019-04-02', '江苏出版社', '讲述的是一个故事', '333', '朱紫国', null);
INSERT INTO `bookinfo1` VALUES ('4', '33', '张以', '2019-04-02', '成都出版社', '讲述的是一个故事', '231', '长安城', '');

-- ----------------------------
-- Table structure for borrow
-- ----------------------------
DROP TABLE IF EXISTS `borrow`;
CREATE TABLE `borrow` (
  `tradeid` int(11) NOT NULL AUTO_INCREMENT,
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `uno` int(11) DEFAULT NULL,
  `bno` int(11) DEFAULT NULL,
  `ifs` int(255) DEFAULT '1',
  PRIMARY KEY (`tradeid`),
  KEY `FK_Reference_2` (`uno`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of borrow
-- ----------------------------
INSERT INTO `borrow` VALUES ('1', '2019-04-14 09:00:44', '1', '2', '1');
INSERT INTO `borrow` VALUES ('2', '2019-04-15 01:24:06', '2', '3', '1');

-- ----------------------------
-- Table structure for boss
-- ----------------------------
DROP TABLE IF EXISTS `boss`;
CREATE TABLE `boss` (
  `bid` int(11) DEFAULT NULL,
  `bname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of boss
-- ----------------------------
INSERT INTO `boss` VALUES ('1', '老板');

-- ----------------------------
-- Table structure for boss_company
-- ----------------------------
DROP TABLE IF EXISTS `boss_company`;
CREATE TABLE `boss_company` (
  `bid` int(11) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of boss_company
-- ----------------------------
INSERT INTO `boss_company` VALUES ('1', '1');

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `cid` int(11) DEFAULT NULL,
  `cname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('1', '一年级二班');

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `cid` int(11) DEFAULT NULL,
  `cname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES ('1', '科技公司');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `did` int(11) DEFAULT NULL,
  `dname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '营销部');
INSERT INTO `department` VALUES ('2', '市场部');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `eid` int(11) DEFAULT NULL,
  `ename` varchar(255) DEFAULT NULL,
  `did` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '张三', '1');
INSERT INTO `employee` VALUES ('2', '王五', '2');

-- ----------------------------
-- Table structure for hero
-- ----------------------------
DROP TABLE IF EXISTS `hero`;
CREATE TABLE `hero` (
  `hid` int(11) NOT NULL,
  `hname` char(255) DEFAULT NULL,
  PRIMARY KEY (`hid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hero
-- ----------------------------
INSERT INTO `hero` VALUES ('3001', '林冲');
INSERT INTO `hero` VALUES ('3002', '鲁智深');
INSERT INTO `hero` VALUES ('3003', '李逵');

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house` (
  `hid` int(11) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house
-- ----------------------------
INSERT INTO `house` VALUES ('1', '中国', '1');
INSERT INTO `house` VALUES ('2', '日本', '2');

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `uno` int(11) NOT NULL,
  `uname` varchar(20) DEFAULT NULL,
  `pass` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`uno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('1', 'admin', '123');
INSERT INTO `login` VALUES ('2', 'test', '123');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `pid` int(11) DEFAULT NULL,
  `pname` varchar(255) DEFAULT NULL,
  `hid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '王二', '1');
INSERT INTO `person` VALUES ('2', '三大', '2');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` int(11) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `cid` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '王二', '1');
