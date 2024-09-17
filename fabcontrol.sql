-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generacion: 10-09-2024 a las 16:06:03
-- Version del servidor: 8.0.26
-- Version de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fabcontrol`
--

CREATE DATABASE fabcontrol;
USE fabcontrol;

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` 
PROCEDURE `InsertEncargos` (IN `p_id_usuario` INT, IN `p_id_mueble` INT, IN `p_cantidad` INT, IN `p_date_out` VARCHAR(12))
INSERT INTO encargos(id_usuario, id_mueble, cantidad, date_out) VALUES(p_id_usuario,p_id_mueble,p_cantidad,p_date_out)$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encargos`
--

CREATE TABLE `encargos` (
  `id` int NOT NULL,
  `id_usuario` int NOT NULL,
  `id_mueble` int NOT NULL,
  `cantidad` int NOT NULL,
  `date_out` varchar(12) NOT NULL,
  `date_return` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `muebles`
--

CREATE TABLE `muebles` (
  `id` int NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `material` varchar(50) NOT NULL,
  `color` varchar(30) NOT NULL,
  `dimensiones` varchar(50) NOT NULL,
  `peso` varchar(50) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `stock` int NOT NULL,
  `disponibles` int NOT NULL,
  `encargados` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `muebles`
--

INSERT INTO muebles VALUES(1,"Pampa","Silla","Madera","Roble","40x40x80cm","5kg","250000",48,37,0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido_paterno` varchar(30) NOT NULL,
  `apellido_materno` varchar(30) NOT NULL,
  `domicilio` varchar(30) DEFAULT NULL,
  `tel` varchar(25) DEFAULT NULL,
  `sanctions` int DEFAULT '0',
  `sanc_money` int NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO usuarios VALUES(1,"Luciano","Ayala","Cernetti","Picoloro 6443","+54 9 11 3333-4444",0,0);
INSERT INTO usuarios VALUES(2,"Guillermina","Acevedo","x","La Chacra 4234","+54 9 11 2323-2564",0,0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `encargos`
--
ALTER TABLE `encargos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `muebles`
--
ALTER TABLE `muebles`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `encargos`
--
ALTER TABLE `encargos`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `muebles`
--
ALTER TABLE `muebles`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
