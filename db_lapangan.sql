-- phpMyAdmin SQL Dump
-- version 2.11.9.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 25, 2017 at 08:34 PM
-- Server version: 5.0.67
-- PHP Version: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_lapangan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_booking_member`
--

CREATE TABLE IF NOT EXISTS `tb_booking_member` (
  `id_booking_member` int(10) NOT NULL auto_increment,
  `tgl_aktif` date NOT NULL,
  `tgl_nonaktif` date NOT NULL,
  `team` varchar(20) NOT NULL,
  `lapangan` varchar(20) NOT NULL,
  `lama` int(3) NOT NULL,
  `jam_main` varchar(20) NOT NULL,
  `jam_selesai` varchar(20) NOT NULL,
  `hari` varchar(10) NOT NULL,
  `Total` varchar(20) NOT NULL,
  PRIMARY KEY  (`id_booking_member`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `tb_booking_member`
--

INSERT INTO `tb_booking_member` (`id_booking_member`, `tgl_aktif`, `tgl_nonaktif`, `team`, `lapangan`, `lama`, `jam_main`, `jam_selesai`, `hari`, `Total`) VALUES
(2, '2017-05-25', '2017-06-25', 'Poenix', 'Studio 3', 2, '07:00', '09:00', 'Rabu', '504000');

-- --------------------------------------------------------

--
-- Table structure for table `tb_booking_regular`
--

CREATE TABLE IF NOT EXISTS `tb_booking_regular` (
  `id_regular` int(10) NOT NULL auto_increment,
  `tgl_booking` date NOT NULL,
  `penyewa` varchar(50) NOT NULL,
  `lapangan` varchar(20) NOT NULL,
  `harga` varchar(20) NOT NULL,
  `jam_main` varchar(10) NOT NULL,
  `jam_selesai` varchar(10) NOT NULL,
  `lama` varchar(2) NOT NULL,
  `total` varchar(20) NOT NULL,
  `dp` varchar(20) NOT NULL,
  `sisa` varchar(20) NOT NULL,
  PRIMARY KEY  (`id_regular`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `tb_booking_regular`
--

INSERT INTO `tb_booking_regular` (`id_regular`, `tgl_booking`, `penyewa`, `lapangan`, `harga`, `jam_main`, `jam_selesai`, `lama`, `total`, `dp`, `sisa`) VALUES
(1, '2017-05-25', 'ihsan', 'Studio 1', '80000', '07:00', '08:00', '1', '80000', '80000', '0'),
(2, '2017-05-25', 'aip', 'Studio 1', '80000', '07:00', '08:00', '1', '80000', '50000', '30000'),
(3, '2017-05-25', 'pimen', 'Studio 3', '70000', '09:00', '11:00', '2', '140000', '2000', '138000'),
(4, '2017-05-11', 'botak', 'Studio 1', '80000', '00:00', '02:00', '2', '160000', '50000', '110000');

-- --------------------------------------------------------

--
-- Table structure for table `tb_event`
--

CREATE TABLE IF NOT EXISTS `tb_event` (
  `id_event` int(10) NOT NULL auto_increment,
  `tgl_booking` date NOT NULL,
  `penyewa` varchar(20) NOT NULL,
  `tgl_main` date NOT NULL,
  `lama_hari` int(3) NOT NULL,
  `jam` int(10) NOT NULL,
  `jam_main` varchar(10) NOT NULL,
  `jam_selesai` varchar(10) NOT NULL,
  `lapangan` varchar(20) NOT NULL,
  `harga` varchar(20) NOT NULL,
  `total` varchar(20) NOT NULL,
  PRIMARY KEY  (`id_event`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `tb_event`
--

INSERT INTO `tb_event` (`id_event`, `tgl_booking`, `penyewa`, `tgl_main`, `lama_hari`, `jam`, `jam_main`, `jam_selesai`, `lapangan`, `harga`, `total`) VALUES
(1, '2017-05-25', 'ihsan', '2017-06-08', 4, 2, '07:00', '09:00', 'Studio 3', '70000', '560000'),
(2, '2017-05-26', 'Harist', '2017-06-01', 4, 2, '08:00', '10:00', 'Studio 1', '80000', '640000'),
(3, '2017-05-26', 'botak', '2017-06-05', 5, 4, '11:00', '15:00', 'Studio 3', '70000', '1400000');

-- --------------------------------------------------------

--
-- Table structure for table `tb_lapangan`
--

CREATE TABLE IF NOT EXISTS `tb_lapangan` (
  `id_lapangan` varchar(5) NOT NULL,
  `lapangan` varchar(20) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `harga` int(11) NOT NULL,
  PRIMARY KEY  (`id_lapangan`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_lapangan`
--

INSERT INTO `tb_lapangan` (`id_lapangan`, `lapangan`, `jenis`, `harga`) VALUES
('L001', 'Studio 1', 'Plur', 80000),
('L002', 'Studio 2', 'Sintetis', 100000),
('L003', 'Studio 3', 'Sintetis', 70000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_member`
--

CREATE TABLE IF NOT EXISTS `tb_member` (
  `id_member` varchar(5) NOT NULL,
  `tgl_daftar` date NOT NULL,
  `team` varchar(30) NOT NULL,
  `manager` varchar(30) NOT NULL,
  `no_hp` varchar(12) NOT NULL,
  PRIMARY KEY  (`id_member`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_member`
--

INSERT INTO `tb_member` (`id_member`, `tgl_daftar`, `team`, `manager`, `no_hp`) VALUES
('M0001', '2017-05-10', 'Poenix', 'Ihsan Miftahul Huda', '085352044517'),
('M0002', '2017-05-11', 'Diamond', 'Pirman Abdurrahman', '089763124451'),
('M0003', '2017-05-13', 'Informatika', 'Moch Arif Zamzami Munawwir', '082314456789'),
('M0004', '2017-05-13', 'Paradice', 'Median Nh', '087965433212');

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE IF NOT EXISTS `tb_user` (
  `id_user` int(5) NOT NULL auto_increment,
  `nama` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `type` varchar(30) NOT NULL,
  PRIMARY KEY  (`id_user`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`id_user`, `nama`, `username`, `password`, `type`) VALUES
(1, 'ihsan Miftahul Huda', 'ihsan', 'ihsan', 'Admin'),
(2, 'Pirman Abdurrahman', 'pimen', 'pimen', 'Operator'),
(5, 'aho', 'ahok', '123', 'Admin');
