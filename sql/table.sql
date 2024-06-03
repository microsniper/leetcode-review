CREATE TABLE `algorithm` (
     `algorithm_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
     `topic` varchar(255) COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '题目',
     `difficulty` varchar(255) COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '难度',
     `content` text COLLATE utf8mb4_bin NOT NULL COMMENT '题目内容',
     `tip` varchar(500) COLLATE utf8mb4_bin DEFAULT '' COMMENT '示例',
     `example` varchar(500) COLLATE utf8mb4_bin DEFAULT '',
     `result` varchar(500) COLLATE utf8mb4_bin NOT NULL COMMENT '返回值',
     `param` varchar(500) COLLATE utf8mb4_bin NOT NULL COMMENT '参数',
     `remark` varchar(500) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '备注',
     `create_time` datetime NOT NULL COMMENT '创建时间',
     `update_time` datetime NOT NULL COMMENT '修改时间',
     PRIMARY KEY (`algorithm_id`),
     KEY `idx_topic` (`topic`),
     KEY `idx_diffculty` (`difficulty`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;