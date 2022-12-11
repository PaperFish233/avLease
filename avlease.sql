/*
 Navicat Premium Data Transfer

 Source Server         : Mysql
 Source Server Type    : MySQL
 Source Server Version : 80030
 Source Host           : localhost:3306
 Source Schema         : avlease

 Target Server Type    : MySQL
 Target Server Version : 80030
 File Encoding         : 65001

 Date: 11/12/2022 08:48:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for announcement
-- ----------------------------
DROP TABLE IF EXISTS `announcement`;
CREATE TABLE `announcement`  (
  `Ano` int NOT NULL AUTO_INCREMENT,
  `Aname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `Acontent` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `Atime` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Ano`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of announcement
-- ----------------------------
INSERT INTO `announcement` VALUES (6, 'paperfish1', '沙发，第一条！', '2022-12-7 9:49:27');
INSERT INTO `announcement` VALUES (7, 'paperfish1', '板凳，第二条！', '2022-12-7 9:49:29');
INSERT INTO `announcement` VALUES (8, 'paperfish1', '这个系统很简陋！', '2022-12-7 9:49:31');

-- ----------------------------
-- Table structure for lease
-- ----------------------------
DROP TABLE IF EXISTS `lease`;
CREATE TABLE `lease`  (
  `Lno` int NOT NULL AUTO_INCREMENT,
  `Lname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `Ltap` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `Ltime` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `Lstate` int NULL DEFAULT NULL,
  PRIMARY KEY (`Lno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lease
-- ----------------------------
INSERT INTO `lease` VALUES (19, 'paperfish2', '死了都要爱', '2022-12-7 9:51:44', 2);
INSERT INTO `lease` VALUES (20, 'paperfish2', '1', '2022-12-7 10:01:52', 2);
INSERT INTO `lease` VALUES (21, 'paperfish2', '飘向北方', '2022-12-7 10:13:42', 2);
INSERT INTO `lease` VALUES (22, 'paperfish2', '死了都要爱', '2022-12-7 10:19:05', 2);
INSERT INTO `lease` VALUES (23, 'paperfish3', '死了都要爱', '2022-12-7 10:40:41', 2);
INSERT INTO `lease` VALUES (24, 'paperfish2', '爱在西元前', '2022-12-7 23:06:58', 2);
INSERT INTO `lease` VALUES (25, 'paperfish1', '死了都要爱', '2022-12-9 16:45:15', 2);
INSERT INTO `lease` VALUES (26, 'paperfish3', 'LoveStory', '2022-12-9 16:48:16', 2);

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `Mno` int NOT NULL AUTO_INCREMENT,
  `Mname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `Mcontent` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `Mtime` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Mno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES (5, 'paperfish1', '这是第1条数据！', '2022-12-7 9:49:42');
INSERT INTO `message` VALUES (6, 'paperfish1', '这是第2条数据！', '2022-12-7 9:49:54');
INSERT INTO `message` VALUES (7, 'paperfish1', '这是第3条数据！', '2022-12-7 9:49:58');

-- ----------------------------
-- Table structure for tap
-- ----------------------------
DROP TABLE IF EXISTS `tap`;
CREATE TABLE `tap`  (
  `Tno` int NOT NULL AUTO_INCREMENT,
  `Tname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `TTno` int NULL DEFAULT NULL,
  `Tstate` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Tno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tap
-- ----------------------------
INSERT INTO `tap` VALUES (13, '死了都要爱', 8, '1');
INSERT INTO `tap` VALUES (14, '飘向北方', 1, '1');
INSERT INTO `tap` VALUES (15, '新地球', 2, '1');
INSERT INTO `tap` VALUES (16, '爱在西元前', 8, '1');
INSERT INTO `tap` VALUES (17, 'LoveStory', 9, '1');
INSERT INTO `tap` VALUES (18, '反转地球', 10, '1');
INSERT INTO `tap` VALUES (19, '1', 1, '1');

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type`  (
  `TTTno` int NOT NULL AUTO_INCREMENT,
  `TTTname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`TTTno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES (1, '摇滚');
INSERT INTO `type` VALUES (2, '嘻哈');
INSERT INTO `type` VALUES (7, '朋克');
INSERT INTO `type` VALUES (8, '流行');
INSERT INTO `type` VALUES (9, '欧美');
INSERT INTO `type` VALUES (10, '国潮');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `Uno` int NOT NULL AUTO_INCREMENT,
  `Uaccount` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `Uname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `Upassword` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `Uauthority` int NULL DEFAULT NULL,
  PRIMARY KEY (`Uno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'paperfish1', '纸鱼', '1', 1);
INSERT INTO `user` VALUES (2, 'paperfish2', '垃圾鱼', '2', 2);
INSERT INTO `user` VALUES (12, 'paperfish3', '臭鱼', '3', 2);

SET FOREIGN_KEY_CHECKS = 1;
