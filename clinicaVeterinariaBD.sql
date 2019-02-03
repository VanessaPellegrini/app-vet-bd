-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.3.11-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para clinicaveterinariabd
CREATE DATABASE IF NOT EXISTS `clinicaveterinariabd` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `clinicaveterinariabd`;

-- Volcando estructura para tabla clinicaveterinariabd.tbldueno
CREATE TABLE IF NOT EXISTS `tbldueno` (
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `edad` smallint(6) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `nombreMascota` varchar(100) DEFAULT NULL,
  `sexoMascota` char(1) DEFAULT NULL,
  `id` int(2) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla clinicaveterinariabd.tbldueno: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tbldueno` DISABLE KEYS */;
INSERT INTO `tbldueno` (`nombre`, `apellido`, `edad`, `sexo`, `nombreMascota`, `sexoMascota`, `id`) VALUES
	('carlos', 'guzman', 25, 'M', 'plumita', 'H', 1),
	('maria del barrio', 'perez', 35, 'F', 'lali', 'H', 2),
	('Jorge', 'Ortiz', 54, 'M', 'pirata', 'M', 3);
/*!40000 ALTER TABLE `tbldueno` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
