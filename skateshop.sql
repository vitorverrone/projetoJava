# Host: 179.188.16.206  (Version 5.6.35-81.0-log)
# Date: 2018-11-22 20:48:58
# Generator: MySQL-Front 6.0  (Build 1.194)


#
# Structure for table "produtos"
#

DROP TABLE IF EXISTS `produtos`;
CREATE TABLE `produtos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomeProd` text,
  `estoque` int(11) DEFAULT NULL,
  `tamanho` varchar(50) DEFAULT NULL,
  `descricao` text,
  `ativo` int(11) DEFAULT NULL,
  `preco` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

#
# Data for table "produtos"
#

INSERT INTO `produtos` VALUES (4,'Shape Maple Hondar Serie Dark Woods 7.7',5,'7.7','Esse shape é uma excelente opção de compra para quem não abre mão de qualidade pagando o melhor preço! \n\nO Shape Maple Hondar Serie Dark Woods 7.7 é fabricado em 100% maple e apresenta ótima estrutura e acabamento de qualidade. Através de tecnologias o shape passa por uma imprensa fria e cola prêmio que torna esse modelo super resistente e leve.',1,'99,99'),(9,'Tênis Vans',5,'41','Tênis da Vans',1,'140,00'),(10,'Skate',5,'único','\t\t\t',1,'145,00'),(13,'Moletom',5,'M','',1,'150'),(14,'Skate',5,'ùnico','',1,'145,00'),(15,'Skate',5,'único','\n',1,'145,00');

#
# Structure for table "usuarios"
#

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) COLLATE latin1_general_ci NOT NULL,
  `senha` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

#
# Data for table "usuarios"
#

INSERT INTO `usuarios` VALUES (1,'admin@admin.com.br','admin123');
