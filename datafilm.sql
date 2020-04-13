-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Apr 2020 pada 15.24
-- Versi server: 10.4.6-MariaDB
-- Versi PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `datafilm`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `film`
--

CREATE TABLE `film` (
  `ID` varchar(5) NOT NULL,
  `Judul` varchar(20) NOT NULL,
  `Tipe` varchar(20) NOT NULL,
  `Episode` varchar(5) NOT NULL,
  `Genre` varchar(20) NOT NULL,
  `Status` varchar(20) NOT NULL,
  `Rating` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `film`
--

INSERT INTO `film` (`ID`, `Judul`, `Tipe`, `Episode`, `Genre`, `Status`, `Rating`) VALUES
('6', 'My Spy', 'Film', '1', 'Action, Comedy, Fami', 'Selesai', '7'),
('18', 'TATB PS I Still Love', 'Film', '1', 'Romance', 'Selesai', '9'),
('7', 'Itaewon Class', 'Drama Korea', '16', 'Drama, Romance', 'Selesai', '9'),
('16', 'TATB Iv Loved Before', 'Film', '1', 'Romance', 'Selesai', '9'),
('21', 'Frozen', 'Film', '1', 'Cartoon', 'Selesai', '8'),
('32', 'Birds of Prey', 'Film', '1', 'Action, Adventure, C', 'Selesai', '9'),
('67', 'Onward', 'Film', '1', 'Cartoon', 'Selesai', '7'),
('', 'Secret Zoo', 'Film', '1', 'Action, Comedy', 'Selesai', '1'),
('67', 'The Lion King', 'Film', '1', 'Action, Comedy', 'Selesai', '8'),
('14', 'Soniq The Hedgehog', 'Film', '1', 'Cartoon', 'Selesai', '7'),
('21', 'IT', 'Film', '1', 'Horror', ' Selesai', '8');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
