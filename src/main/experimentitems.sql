/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80033 (8.0.33)
 Source Host           : localhost:3306
 Source Schema         : db2023

 Target Server Type    : MySQL
 Target Server Version : 80033 (8.0.33)
 File Encoding         : 65001

 Date: 22/10/2023 23:24:25
*/
create database if not exists web;
use web;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for experimentitems
-- ----------------------------
DROP TABLE IF EXISTS `experimentitems`;
CREATE TABLE `experimentitems`  (
  `itemno` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '实验项目编号，由课程代码后10位+2位课程内序号组成',
  `itemname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '实验项目名称',
  `courseno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '课程编号',
  `itemhour` int NULL DEFAULT NULL COMMENT '实验学时',
  `itemcontent` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '实验内容',
  `itemtype` int NULL DEFAULT NULL COMMENT '实验类型：1演示、2验证、3综合、4设计研究',
  `iscompulsory` int NULL DEFAULT NULL COMMENT '是否必做：1必做，0选做',
  PRIMARY KEY (`itemno` DESC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of experimentitems
-- ----------------------------
INSERT INTO `experimentitems` VALUES ('073110400111', '流量管制', '210731100801', 2, '设计并研究流量管制', 4, 1);
INSERT INTO `experimentitems` VALUES ('073110400110', '策略路由项', '210731100801', 2, '设计并研究策略路由项', 4, 1);
INSERT INTO `experimentitems` VALUES ('073110400109', '入侵检测系统', '210731100801', 2, '掌握入侵检测系统原理', 3, 1);
INSERT INTO `experimentitems` VALUES ('073110400108', '钓鱼网站', '210731100801', 2, '掌握钓鱼网站原理', 3, 1);
INSERT INTO `experimentitems` VALUES ('073110400107', 'OSPF路由项欺骗攻击和防御', '210731100801', 2, '掌握OSPF路由项欺骗攻击和防御', 2, 1);
INSERT INTO `experimentitems` VALUES ('073110400106', 'VLAN防MAC地址欺骗攻击', '210731100801', 2, '掌握VLAN防MAC地址欺骗攻击原理和过程', 2, 1);
INSERT INTO `experimentitems` VALUES ('073110400105', '防生成树欺骗攻击', '210731100801', 2, '掌握防生成树欺骗攻击原理和过程', 2, 1);
INSERT INTO `experimentitems` VALUES ('073110400104', '防DHCP欺骗攻击', '210731100801', 2, '掌握防DHCP欺骗攻击原理和过程', 2, 1);
INSERT INTO `experimentitems` VALUES ('073110400103', 'RIP路由项欺骗攻击', '210731100801', 2, '熟悉RIP路由项欺骗攻击原理和过程', 1, 1);
INSERT INTO `experimentitems` VALUES ('073110400102', 'Smurf攻击', '210731100801', 2, '熟悉Smurf攻击原理和过程', 1, 1);
INSERT INTO `experimentitems` VALUES ('073110400101', 'MAC地址欺骗攻击', '210731100801', 2, '熟悉MAC地址欺骗攻击原理和过程', 1, 1);
INSERT INTO `experimentitems` VALUES ('073110080114', '程序设计思维', '210731104001', 2, '编写程序求解困难问题', 4, 0);
INSERT INTO `experimentitems` VALUES ('073110080113', '问题求解策略2', '210731104001', 2, '编写求解问题的复杂案例', 4, 0);
INSERT INTO `experimentitems` VALUES ('073110080112', '问题求解策略', '210731104001', 2, '掌握递归、理解问题求解策略', 4, 0);
INSERT INTO `experimentitems` VALUES ('073110080111', '组织复杂数据', '210731104001', 2, '掌握结构体和复杂数据组织方法', 4, 1);
INSERT INTO `experimentitems` VALUES ('073110080110', '数据存储与程序组织结构', '210731104001', 2, '使用函数、数组和字符串和指针的案例', 3, 1);
INSERT INTO `experimentitems` VALUES ('073110080109', '数据的顺序组织', '210731104001', 2, '使用数组（串）和指针', 3, 1);
INSERT INTO `experimentitems` VALUES ('073110080108', '数据间接访问', '210731104001', 2, '掌握C指针', 2, 1);
INSERT INTO `experimentitems` VALUES ('073110080107', 'C语言字符串', '210731104001', 2, '掌握C语言字符串使用', 2, 1);
INSERT INTO `experimentitems` VALUES ('073110080106', 'C语言数组', '210731104001', 2, '掌握C语言数组使用', 2, 1);
INSERT INTO `experimentitems` VALUES ('073110080105', '简单问题求解的程序设计', '210731104001', 2, '理解问题求解的基本思路和自定义函数', 3, 1);
INSERT INTO `experimentitems` VALUES ('073110080104', '程序流程控制2', '210731104001', 2, '理解C分支和循环结构', 2, 1);
INSERT INTO `experimentitems` VALUES ('073110080103', '程序流程控制1', '210731104001', 2, '理解C分支和循环结构', 2, 1);
INSERT INTO `experimentitems` VALUES ('073110080102', '数据存储与表示', '210731104001', 2, '掌握C数据类型和相关运算', 2, 1);
INSERT INTO `experimentitems` VALUES ('073110080101', 'C语言基础', '210731104001', 2, '熟悉C语言输入输出', 2, 1);

SET FOREIGN_KEY_CHECKS = 1;
