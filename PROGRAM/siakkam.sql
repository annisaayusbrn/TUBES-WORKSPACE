-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Bulan Mei 2019 pada 08.34
-- Versi server: 10.1.35-MariaDB
-- Versi PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `siakkam`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftarakun`
--

CREATE TABLE `daftarakun` (
  `username` char(20) NOT NULL,
  `password` char(20) NOT NULL,
  `type` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `daftarakun`
--

INSERT INTO `daftarakun` (`username`, `password`, `type`) VALUES
('akademik_itera', 'akademik19', 1),
('bumi_pasundan', 'bp19', 0),
('fisika_itera', 'hmf19', 0),
('geofisika_itera', 'hmtg19', 0),
('geomatika_itera', 'hmgt19', 0),
('himalaya', 'himalaya19', 0),
('icositer_itera', 'icositer19', 0),
('ikm_itera', 'ikm19', 0),
('km_itera', 'km19', 0),
('mesin_itera', 'hme19', 0),
('persitera_itera', 'persitera19', 0),
('pplk_itera', 'pplk19', 0),
('renang_itera', 'renang19', 0),
('sipil_itera', 'hms19', 0),
('sriwijaya', 'sriwijaya19', 0),
('ukmbs_itera', 'ukmbs19', 0),
('umppasa', 'umppasa19', 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftarkegiatan`
--

CREATE TABLE `daftarkegiatan` (
  `id` int(11) NOT NULL,
  `nama_kegiatan` varchar(25) NOT NULL,
  `waktu_mulai` datetime DEFAULT NULL,
  `waktu_selesai` datetime DEFAULT NULL,
  `id_lembaga` int(11) DEFAULT NULL,
  `id_tempat` char(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `daftarkegiatan`
--

INSERT INTO `daftarkegiatan` (`id`, `nama_kegiatan`, `waktu_mulai`, `waktu_selesai`, `id_lembaga`, `id_tempat`) VALUES
(1, 'buka bersama', '2019-05-24 16:30:00', '2019-05-24 19:00:00', 13, '49G');

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftarlembaga`
--

CREATE TABLE `daftarlembaga` (
  `id` int(11) NOT NULL,
  `nama` char(40) NOT NULL,
  `username` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `daftarlembaga`
--

INSERT INTO `daftarlembaga` (`id`, `nama`, `username`) VALUES
(1, 'IKM', 'ikm_itera'),
(2, 'HIMALAYA', 'himalaya'),
(3, 'UMPASA', 'umppasa'),
(4, 'SRIWIJAYA', 'sriwijaya'),
(5, 'BUMI PASUNDAN', 'bumi_pasundan'),
(6, 'HME', 'mesin_itera'),
(7, 'HMF', 'fisika_itera'),
(8, 'PERSITERA', 'persitera_itera'),
(9, 'RENANG', 'renang_itera'),
(10, 'HMTG', 'geofisika_itera'),
(11, 'HMGT', 'geomatika_itera'),
(12, 'HMS', 'sipil_itera'),
(13, 'KM ITERA', 'km_itera'),
(14, 'UKMBS', 'ukmbs_itera'),
(15, 'PPLK', 'pplk_itera'),
(16, 'ICOSITER', 'icositer_itera'),
(17, 'AKADEMIK', 'akademik_itera');

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftartempat`
--

CREATE TABLE `daftartempat` (
  `id_tempat` char(6) NOT NULL,
  `nama_tempat` varchar(25) DEFAULT NULL,
  `wilayah` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `daftartempat`
--

INSERT INTO `daftartempat` (`id_tempat`, `nama_tempat`, `wilayah`) VALUES
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

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengajuan`
--

CREATE TABLE `pengajuan` (
  `id` int(11) NOT NULL,
  `waktu_diajukan` datetime DEFAULT NULL,
  `nama_kegiatan` varchar(25) DEFAULT NULL,
  `waktu_mulai` datetime DEFAULT NULL,
  `waktu_selesai` datetime DEFAULT NULL,
  `id_lembaga` int(11) DEFAULT NULL,
  `id_tempat` char(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `daftarakun`
--
ALTER TABLE `daftarakun`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `daftarkegiatan`
--
ALTER TABLE `daftarkegiatan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_lembaga` (`id_lembaga`),
  ADD KEY `id_tempat` (`id_tempat`);

--
-- Indeks untuk tabel `daftarlembaga`
--
ALTER TABLE `daftarlembaga`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`);

--
-- Indeks untuk tabel `daftartempat`
--
ALTER TABLE `daftartempat`
  ADD PRIMARY KEY (`id_tempat`);

--
-- Indeks untuk tabel `pengajuan`
--
ALTER TABLE `pengajuan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_lembaga` (`id_lembaga`),
  ADD KEY `id_tempat` (`id_tempat`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `daftarkegiatan`
--
ALTER TABLE `daftarkegiatan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `daftarlembaga`
--
ALTER TABLE `daftarlembaga`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT untuk tabel `pengajuan`
--
ALTER TABLE `pengajuan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `daftarkegiatan`
--
ALTER TABLE `daftarkegiatan`
  ADD CONSTRAINT `daftarkegiatan_ibfk_1` FOREIGN KEY (`id_lembaga`) REFERENCES `daftarlembaga` (`id`),
  ADD CONSTRAINT `daftarkegiatan_ibfk_2` FOREIGN KEY (`id_tempat`) REFERENCES `daftartempat` (`id_tempat`);

--
-- Ketidakleluasaan untuk tabel `daftarlembaga`
--
ALTER TABLE `daftarlembaga`
  ADD CONSTRAINT `daftarlembaga_ibfk_1` FOREIGN KEY (`username`) REFERENCES `daftarakun` (`username`);

--
-- Ketidakleluasaan untuk tabel `pengajuan`
--
ALTER TABLE `pengajuan`
  ADD CONSTRAINT `pengajuan_ibfk_1` FOREIGN KEY (`id_lembaga`) REFERENCES `daftarlembaga` (`id`),
  ADD CONSTRAINT `pengajuan_ibfk_2` FOREIGN KEY (`id_tempat`) REFERENCES `daftartempat` (`id_tempat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
