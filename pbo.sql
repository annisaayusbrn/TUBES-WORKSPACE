-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2019 at 08:37 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 7.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminutama`
--

CREATE TABLE `adminutama` (
  `username_admin` char(25) NOT NULL,
  `password_admin` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminutama`
--

INSERT INTO `adminutama` (`username_admin`, `password_admin`) VALUES
('admin_utama', 'ITERA19');

-- --------------------------------------------------------

--
-- Table structure for table `kegiatan`
--

CREATE TABLE `kegiatan` (
  `id_kegiatan` char(6) NOT NULL,
  `nama_kegiatan` varchar(25) DEFAULT NULL,
  `waktu_mulai` date DEFAULT NULL,
  `waktu_selesai` date DEFAULT NULL,
  `id_tempat` char(6) DEFAULT NULL,
  `id_lembaga` char(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `lembaga`
--

CREATE TABLE `lembaga` (
  `id_lembaga` char(6) NOT NULL,
  `nama_lembaga` varchar(25) DEFAULT NULL,
  `username_lembaga` char(25) DEFAULT NULL,
  `password_lembaga` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lembaga`
--

INSERT INTO `lembaga` (`id_lembaga`, `nama_lembaga`, `username_lembaga`, `password_lembaga`) VALUES
('01U', 'IKM', 'ikm_itera', 'ikm19'),
('02U', 'HIMALAYA', 'himalaya', 'himalaya19'),
('03U', 'UMPPASA', 'umppasa', 'umppasa19'),
('04U', 'SRIWIJAYA', 'sriwijaya', 'sriwijaya19'),
('05U', 'BUMI PASUNDAN', 'bumi_pasundan', 'bp19'),
('06U', 'HME', 'mesin_itera', 'hme19'),
('07U', 'HMF', 'fisika_itera', 'hmf19'),
('08U', 'PERSITERA', 'persitera_itera', 'persitera19'),
('09U', 'RENANG', 'renang_itera', 'renang19'),
('10U', 'HMTG', 'geofisika_itera', 'hmtg19'),
('11U', 'HMGT', 'geomatika_itera', 'hmgt19'),
('12U', 'HMS', 'sipil_itera', 'hms19'),
('13U', 'KM ITERA', 'km_itera', 'km19'),
('14U', 'UKMBS', 'ukmbs_itera', 'ukmbs19'),
('15U', 'PPLK', 'pplk_itera', 'pplk19'),
('16U', 'ICOSITER', 'icositer_itera', 'icositer19'),
('17U', 'AKADEMIK', 'akademik_itera', 'akademik19');

-- --------------------------------------------------------

--
-- Table structure for table `tempat`
--

CREATE TABLE `tempat` (
  `id_tempat` char(6) NOT NULL,
  `nama_tempat` varchar(25) DEFAULT NULL,
  `wilayah` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tempat`
--

INSERT INTO `tempat` (`id_tempat`, `nama_tempat`, `wilayah`) VALUES
('01A', 'Ruang Rektor', 'Gedung A'),
('01B', 'Ruang Dosen', 'Gedung B'),
('01C', 'C101', 'Gedung C'),
('01D', 'D101', 'Gedung D'),
('01E', 'E001', 'Gedung E'),
('01G', 'GK101', 'Gedung Kuliah Umum'),
('01L', 'LT01', 'Laboratorium Teknik'),
('01T', 'Asrama TB1', 'Asrama'),
('02A', 'Ruang Wakil Rektor', 'Gedung A'),
('02B', 'Lobby B', 'Gedung B'),
('02C', 'C102', 'Gedung C'),
('02D', 'D102', 'Gedung D'),
('02E', 'E002', 'Gedung E'),
('02G', 'GK102', 'Gedung Kuliah Umum'),
('02L', 'LT02', 'Laboratorium Teknik'),
('02S', 'Klinik', 'Gedung B'),
('02T', 'Asrama TB2', 'Asrama'),
('03A', 'Selasar Gedung A', 'Gedung A'),
('03B', 'ATM Center', 'Gedung B'),
('03C', 'C103', 'Gedung C'),
('03D', 'D103', 'Gedung D'),
('03E', 'E003', 'Gedung E'),
('03G', 'GK103', 'Gedung Kuliah Umum'),
('03L', 'LT03', 'Laboratorium Teknik'),
('03S', 'Bukit Kelara Lestari', 'Gedung B'),
('03T', 'Asrama TB3', 'Asrama'),
('04A', 'Wifi Corner 1', 'Gedung A'),
('04B', 'Selasar Gedung B', 'Gedung B'),
('04C', 'C104', 'Gedung C'),
('04D', 'D104', 'Gedung D'),
('04E', 'E004', 'Gedung E'),
('04G', 'GK104', 'Gedung Kuliah Umum'),
('04L', 'LT04', 'Laboratorium Teknik'),
('04S', 'Masjid', 'Asrama'),
('04T', 'Asrama TB4', 'Asrama'),
('05C', 'C105', 'Gedung C'),
('05D', 'Selasar Gedung D', 'Gedung D'),
('05E', 'E005', 'Gedung E'),
('05G', 'GK105', 'Gedung Kuliah Umum'),
('05L', 'LT05', 'Laboratorium Teknik'),
('05S', 'Parkiran', 'Gedung D'),
('06D', 'Lobby', 'Gedung D'),
('06E', 'E006', 'Gedung E'),
('06G', 'GK106', 'Gedung Kuliah Umum'),
('06L', 'LT06', 'Laboratorium Teknik'),
('06S', 'Rumah Kayu', 'Gedung D'),
('07C', 'Ruang Akademik', 'Gedung C'),
('07D', 'D201', 'Gedung D'),
('07E', 'E005', 'Gedung E'),
('07G', 'GK107', 'Gedung Kuliah Umum'),
('07L', 'LT07', 'Laboratorium Teknik'),
('07S', 'Mushola', 'Gedung D'),
('08C', 'Studio Arsitektur', 'Gedung C'),
('08D', 'D202', 'Gedung D'),
('08E', 'E005', 'Gedung E'),
('08G', 'GK108', 'Gedung Kuliah Umum'),
('08L', 'LT08', 'Laboratorium Teknik'),
('09C', 'C202', 'Gedung C'),
('09D', 'D203', 'Gedung D'),
('09E', 'E005', 'Gedung E'),
('09G', 'GK109', 'Gedung Kuliah Umum'),
('10C', 'C203', 'Gedung C'),
('10D', 'D204', 'Gedung D'),
('10E', 'E006', 'Gedung E'),
('10G', 'GK110', 'Gedung Kuliah Umum'),
('11C', 'C204', 'Gedung C'),
('11D', 'D205', 'Gedung D'),
('11E', 'E007', 'Gedung E'),
('11G', 'GK111', 'Gedung Kuliah Umum'),
('12C', 'C205', 'Gedung C'),
('12D', 'D206', 'Gedung D'),
('12E', 'LTPB', 'Gedung E'),
('12G', 'GK112', 'Gedung Kuliah Umum'),
('13C', 'C206', 'Gedung C'),
('13D', 'D207', 'Gedung D'),
('13E', 'E101', 'Gedung E'),
('13G', 'GK113', 'Gedung Kuliah Umum'),
('14C', 'Aula', 'Gedung C'),
('14D', 'D301', 'Gedung D'),
('14E', 'E102', 'Gedung E'),
('14G', 'GK114', 'Gedung Kuliah Umum'),
('15C', 'Lab Multimedia', 'Gedung C'),
('15D', 'D302', 'Gedung D'),
('15E', 'E103', 'Gedung E'),
('15G', 'GK201', 'Gedung Kuliah Umum'),
('16C', 'Lab TPB', 'Gedung C'),
('16D', 'D303', 'Gedung D'),
('16E', 'E104', 'Gedung E'),
('16G', 'GK202', 'Gedung Kuliah Umum'),
('17C', 'Wifi Corner 2', 'Gedung C'),
('17D', 'D304', 'Gedung D'),
('17E', 'E105', 'Gedung E'),
('17G', 'GK203', 'Gedung Kuliah Umum'),
('18C', 'Embung 1', 'Gedung C'),
('18D', 'D305', 'Gedung D'),
('18E', 'E106', 'Gedung E'),
('18G', 'GK204', 'Gedung Kuliah Umum'),
('19E', 'E107', 'Gedung E'),
('19G', 'GK205', 'Gedung Kuliah Umum'),
('20E', 'E108', 'Gedung E'),
('20G', 'GK206', 'Gedung Kuliah Umum'),
('21E', 'E109', 'Gedung E'),
('21G', 'GK207', 'Gedung Kuliah Umum'),
('22E', 'E110', 'Gedung E'),
('22G', 'GK208', 'Gedung Kuliah Umum'),
('23E', 'E111', 'Gedung E'),
('23G', 'GK209', 'Gedung Kuliah Umum'),
('24E', 'E112', 'Gedung E'),
('24G', 'GK210', 'Gedung Kuliah Umum'),
('25E', 'E113', 'Gedung E'),
('25G', 'GK211', 'Gedung Kuliah Umum'),
('26E', 'E114', 'Gedung E'),
('26G', 'GK212', 'Gedung Kuliah Umum'),
('27E', 'Perpustakaan 1', 'Gedung E'),
('27G', 'GK213', 'Gedung Kuliah Umum'),
('28E', 'Perpustakaan 2', 'Gedung E'),
('28G', 'GK214', 'Gedung Kuliah Umum'),
('29E', 'Lab Bahasa', 'Gedung E'),
('29G', 'GK301', 'Gedung Kuliah Umum'),
('30E', 'E201', 'Gedung E'),
('30G', 'GK302', 'Gedung Kuliah Umum'),
('31E', 'E202', 'Gedung E'),
('31G', 'GK303', 'Gedung Kuliah Umum'),
('32E', 'E203', 'Gedung E'),
('32G', 'GK304', 'Gedung Kuliah Umum'),
('33E', 'E204', 'Gedung E'),
('33G', 'GK305', 'Gedung Kuliah Umum'),
('34E', 'E205', 'Gedung E'),
('34G', 'GK306', 'Gedung Kuliah Umum'),
('35E', 'E206', 'Gedung E'),
('35G', 'GK307', 'Gedung Kuliah Umum'),
('36E', 'E207', 'Gedung E'),
('36G', 'GK308', 'Gedung Kuliah Umum'),
('37E', 'E208', 'Gedung E'),
('37G', 'GK309', 'Gedung Kuliah Umum'),
('38E', 'E209', 'Gedung E'),
('38G', 'GK310', 'Gedung Kuliah Umum'),
('39E', 'E210', 'Gedung E'),
('39G', 'GK311', 'Gedung Kuliah Umum'),
('40E', 'E211', 'Gedung E'),
('40G', 'GK312', 'Gedung Kuliah Umum'),
('41E', 'E212', 'Gedung E'),
('41G', 'GK313', 'Gedung Kuliah Umum'),
('42E', 'Aula', 'Gedung E'),
('42G', 'GK314', 'Gedung Kuliah Umum'),
('43E', 'E301', 'Gedung E'),
('43G', 'Aula', 'Gedung Kuliah Umum'),
('44E', 'E301', 'Gedung E'),
('44G', 'GK401', 'Gedung Kuliah Umum'),
('45E', 'E303', 'Gedung E'),
('45G', 'GK402', 'Gedung Kuliah Umum'),
('46E', 'E304', 'Gedung E'),
('46G', 'GK403', 'Gedung Kuliah Umum'),
('47E', 'E305', 'Gedung E'),
('47G', 'GK404', 'Gedung Kuliah Umum'),
('48E', 'E306', 'Gedung E'),
('48G', 'GK405', 'Gedung Kuliah Umum'),
('49E', 'E307', 'Gedung E'),
('49G', 'GK406', 'Gedung Kuliah Umum'),
('50E', 'E308', 'Gedung E'),
('50G', 'GK407', 'Gedung Kuliah Umum'),
('51E', 'E309', 'Gedung E'),
('51G', 'GK408', 'Gedung Kuliah Umum'),
('52E', 'E310', 'Gedung E'),
('52G', 'GK409', 'Gedung Kuliah Umum'),
('53E', 'E311', 'Gedung E'),
('53G', 'GK410', 'Gedung Kuliah Umum'),
('54E', 'E312', 'Gedung E'),
('54G', 'Gazebo 1', 'Gedung Kuliah Umum'),
('55G', 'Gazebo 2', 'Gedung Kuliah Umum'),
('56G', 'Selasar', 'Gedung Kuliah Umum'),
('57G', 'Parkiran 1', 'Gedung Kuliah Umum'),
('58G', 'Parkiran 2', 'Gedung Kuliah Umum');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminutama`
--
ALTER TABLE `adminutama`
  ADD PRIMARY KEY (`username_admin`);

--
-- Indexes for table `kegiatan`
--
ALTER TABLE `kegiatan`
  ADD PRIMARY KEY (`id_kegiatan`),
  ADD KEY `id_tempat` (`id_tempat`),
  ADD KEY `id_lembaga` (`id_lembaga`);

--
-- Indexes for table `lembaga`
--
ALTER TABLE `lembaga`
  ADD PRIMARY KEY (`id_lembaga`);

--
-- Indexes for table `tempat`
--
ALTER TABLE `tempat`
  ADD PRIMARY KEY (`id_tempat`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kegiatan`
--
ALTER TABLE `kegiatan`
  ADD CONSTRAINT `kegiatan_ibfk_1` FOREIGN KEY (`id_tempat`) REFERENCES `tempat` (`id_tempat`),
  ADD CONSTRAINT `kegiatan_ibfk_2` FOREIGN KEY (`id_lembaga`) REFERENCES `lembaga` (`id_lembaga`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
