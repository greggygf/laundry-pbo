-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 14, 2018 at 12:31 PM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.1.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tsql_laundry`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id_customer` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_telp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id_customer`, `nama`, `alamat`, `no_telp`) VALUES
(1, 'Hafizh Dias R', 'Singosari', '0878'),
(2, 'Reza Ariestya P', 'Kepanjen', '0811'),
(3, 'Abdallah Darussalam C', 'Muharto', '0871'),
(4, 'Ilham Nuswantoro A', 'Pasuruan', '0819'),
(5, 'Greggy Gianini F', 'Malang', '087759659653');

-- --------------------------------------------------------

--
-- Table structure for table `jenis_laundry`
--

CREATE TABLE `jenis_laundry` (
  `id_jenis_laundry` int(11) NOT NULL,
  `nama_jenis_laundry` varchar(50) NOT NULL,
  `deleted` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenis_laundry`
--

INSERT INTO `jenis_laundry` (`id_jenis_laundry`, `nama_jenis_laundry`, `deleted`) VALUES
(1, 'Cuci', 0),
(2, 'Cuci Kering', 0),
(3, 'Cuci Kering Setrika', 0);

-- --------------------------------------------------------

--
-- Table structure for table `jenis_pakaian`
--

CREATE TABLE `jenis_pakaian` (
  `id_jenis_pakaian` int(11) NOT NULL,
  `nama_jenis_pakaian` varchar(50) NOT NULL,
  `deleted` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenis_pakaian`
--

INSERT INTO `jenis_pakaian` (`id_jenis_pakaian`, `nama_jenis_pakaian`, `deleted`) VALUES
(1, 'Baju', 0),
(2, 'Celana', 0),
(3, 'Jaket', 0),
(4, 'Celana Jeans', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tarif`
--

CREATE TABLE `tarif` (
  `id_tarif` int(11) NOT NULL,
  `id_jenis_pakaian` int(11) NOT NULL,
  `id_jenis_laundry` int(11) NOT NULL,
  `biaya` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tarif`
--

INSERT INTO `tarif` (`id_tarif`, `id_jenis_pakaian`, `id_jenis_laundry`, `biaya`) VALUES
(1, 1, 1, 2000),
(2, 2, 1, 2500),
(3, 4, 1, 4000),
(4, 3, 1, 5000);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `id_customer` int(11) NOT NULL,
  `id_tarif` int(11) NOT NULL,
  `tgl_ambil` date NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `id_customer`, `id_tarif`, `tgl_ambil`, `total`) VALUES
(1, 2, 3, '2018-12-06', 12000),
(2, 1, 4, '2018-12-05', 25000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `id_customer` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`, `id_customer`) VALUES
('greg', 'greg', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_customer`);

--
-- Indexes for table `jenis_laundry`
--
ALTER TABLE `jenis_laundry`
  ADD PRIMARY KEY (`id_jenis_laundry`);

--
-- Indexes for table `jenis_pakaian`
--
ALTER TABLE `jenis_pakaian`
  ADD PRIMARY KEY (`id_jenis_pakaian`);

--
-- Indexes for table `tarif`
--
ALTER TABLE `tarif`
  ADD PRIMARY KEY (`id_tarif`),
  ADD KEY `FK_tarif_jenis_pakaian` (`id_jenis_pakaian`),
  ADD KEY `FK_tarif_jenis_laundry` (`id_jenis_laundry`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `FK_transaksi_customer` (`id_customer`),
  ADD KEY `FK_transaksi_tarif` (`id_tarif`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD KEY `FK_user_customer` (`id_customer`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tarif`
--
ALTER TABLE `tarif`
  ADD CONSTRAINT `FK_tarif_jenis_laundry` FOREIGN KEY (`id_jenis_laundry`) REFERENCES `jenis_laundry` (`id_jenis_laundry`),
  ADD CONSTRAINT `FK_tarif_jenis_pakaian` FOREIGN KEY (`id_jenis_pakaian`) REFERENCES `jenis_pakaian` (`id_jenis_pakaian`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `FK_transaksi_customer` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`),
  ADD CONSTRAINT `FK_transaksi_tarif` FOREIGN KEY (`id_tarif`) REFERENCES `tarif` (`id_tarif`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FK_user_customer` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
