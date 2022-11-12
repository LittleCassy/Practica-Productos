-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-11-2022 a las 20:53:15
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `productos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `id` int(11) NOT NULL,
  `categoria` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`id`, `categoria`) VALUES
(1, 'Informática'),
(2, 'Cableado'),
(3, 'Accesorios'),
(4, 'Componentes'),
(5, 'Electrónica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` mediumint(8) UNSIGNED NOT NULL,
  `producto` text NOT NULL,
  `precio` varchar(100) NOT NULL,
  `cateogria` mediumint(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `producto`, `precio`, `cateogria`) VALUES
(1, 'facilisis', '26', 4),
(2, 'eu,', '40', 1),
(3, 'auctor quis,', '30', 3),
(4, 'ac', '93', 3),
(5, 'Duis', '31', 3),
(6, 'aliquam arcu.', '74', 4),
(7, 'eget', '86', 1),
(8, 'lorem', '57', 3),
(9, 'tincidunt', '62', 3),
(10, 'aliquet,', '52', 4),
(11, 'acd', '22', 4),
(12, 'fringilla cursus', '83', 4),
(13, 'velit', '65', 2),
(14, 'facilisi.', '61', 4),
(15, 'Phasellus ornare.', '56', 3),
(16, 'ornare tortor', '80', 1),
(17, 'vel, convallis', '64', 1),
(18, 'Integer', '23', 1),
(19, 'venenatis vel,', '32', 4),
(20, 'ac arcu.', '69', 2),
(21, 'Suspendissea', '31', 2),
(22, 'lectusa', '10', 3),
(23, 'cursusa vestibuluma.', '96', 1),
(24, 'Nullaa tincidunta,', '58', 4),
(25, 'Duisa', '61', 4),
(26, 'malesuada', '98', 2),
(27, 'montes, nascetur', '54', 2),
(28, 'Mauris vestibulum,', '77', 4),
(29, 'suscipit', '53', 2),
(30, 'malesuada malesuada.', '45', 5),
(31, 'vel turpis.', '13', 2),
(32, 'euismod ac,', '28', 1),
(33, 'tempor,', '97', 2),
(34, 'luctus', '95', 2),
(35, 'ad', '39', 2),
(36, 'mattis ornare,', '24', 2),
(37, 'non, cursus', '21', 3),
(38, 'egestas.', '20', 1),
(39, 'molestie', '46', 3),
(40, 'sollicitudin a,', '18', 3),
(41, 'esta', '61', 4),
(43, 'nona', '71', 4),
(44, 'euismoda', '89', 1),
(45, 'mattisa', '88', 5),
(46, 'sollicitudin', '20', 5),
(47, 'pede ac', '90', 3),
(48, 'Aliquam', '16.0', 3),
(49, 'Integera', '69', 2),
(50, 'orci lobortis', '75', 4),
(53, 'Emilia', '100000.0', 1),
(54, 'Cassy', '16.0', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `producto` (`producto`) USING HASH;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` mediumint(8) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
