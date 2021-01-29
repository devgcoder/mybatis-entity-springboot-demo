/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : mybatis-entity

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-01-29 14:10:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(20) DEFAULT NULL,
  `age` tinyint(4) DEFAULT NULL,
  UNIQUE KEY `uni_id` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
