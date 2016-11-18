DROP TABLE IF EXISTS `saluki_invoke_statistics`;
CREATE TABLE `saluki_invoke_statistics` (
  `id` varchar(255) PRIMARY KEY,
  `invoke_date` datetime DEFAULT NULL,
  `service` varchar(255) DEFAULT NULL,
  `method` varchar(255) DEFAULT NULL,
  `consumer` varchar(255) DEFAULT NULL,
  `provider` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT '',
  `success` int(11) DEFAULT NULL,
  `failure` int(11) DEFAULT NULL,
  `elapsed` int(11) DEFAULT NULL,
  `concurrent` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);