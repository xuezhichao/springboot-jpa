/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50534
Source Host           : 127.0.0.1:3306
Source Database       : mytestdb

Target Server Type    : MYSQL
Target Server Version : 50534
File Encoding         : 65001

Date: 2018-10-17 17:20:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for depart
-- ----------------------------
DROP TABLE IF EXISTS `depart`;
CREATE TABLE `depart` (
  `id` int(11) NOT NULL,
  `departName` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(255) COLLATE utf8_general_mysql500_ci NOT NULL,
  `name` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `pwd` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- ----------------------------
-- Table structure for user_depart
-- ----------------------------
DROP TABLE IF EXISTS `user_depart`;
CREATE TABLE `user_depart` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `depart_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;
