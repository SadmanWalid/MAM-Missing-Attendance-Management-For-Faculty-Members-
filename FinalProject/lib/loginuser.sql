-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 03, 2017 at 01:40 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `loginuser`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Id` varchar(11) NOT NULL,
  `password` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Id`, `password`) VALUES
('11', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `t_id` varchar(11) NOT NULL,
  `int_time` varchar(45) DEFAULT NULL,
  `out_time` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`t_id`, `int_time`, `out_time`, `date`) VALUES
('1', '', '5:00', '1/3/17'),
('1', '', '5:00', '2/3/17'),
('1', '8:00', '9', '3/3/17'),
('1', '8:00', '', '4/3/17'),
('1', '8:00', '5:00', '5/3/17'),
('1', '8:00', '5:00', '7/3/17'),
('1', '8:00', '5:00', '8/3/17'),
('1', '8:00', '5:00', '9/3/17'),
('1', '8:00', '5:00', '10/3/17'),
('1', '8:00', '5:00', '11/3/17'),
('1', '8:00', '5:00', '12/3/17'),
('1', '8:00', '5:00', '13/3/17'),
('1', '8:00', '5:00', '15/3/17'),
('1', '8:00', '5:00', '16/3/17'),
('1', '8:00', '5:00', '17/3/17'),
('1', '8:00', '5:00', '18/3/17'),
('1', '8:00', '5:00', '19/3/17'),
('1', '8:00', '5:00', '20/3/17'),
('1', '8:00', '5:00', '22/3/17'),
('1', '8:00', '5:00', '23/3/17'),
('1', '8:00', '5:00', '24/3/17'),
('1', '8:00', '5:00', '25/3/17'),
('1', '8:00', '5:00', '26/3/17'),
('1', '8:00', '5:00', '27/3/17'),
('1', '8:00', '5:00', '28/3/17'),
('1', '8:00', '5:00', '30/3/17'),
('2', '2', '5:00', '1/3/17'),
('2', '2', '5:00', '2/3/17'),
('2', '8:00', '5:00', '3/3/17'),
('2', '8:00', '5:00', '4/3/17'),
('2', '8:00', '', '5/3/17'),
('2', '', '5:00', '7/3/17'),
('2', '8:00', '5:00', '8/3/17'),
('2', '', '5:00', '9/3/17'),
('2', '8:00', '5:00', '10/3/17'),
('2', '8:00', '', '11/3/17'),
('2', '8:00', '5:00', '12/3/17'),
('2', '8:00', '5:00', '13/3/17'),
('2', '8:00', '5:00', '15/3/17'),
('2', '8:00', '5:00', '16/3/17'),
('2', '8:00', '5:00', '17/3/17'),
('2', '8:00', '5:00', '18/3/17'),
('2', '8:00', '5:00', '19/3/17'),
('2', '8:00', '5:00', '20/3/17'),
('2', '8:00', '5:00', '22/3/17'),
('2', '8:00', '5:00', '23/3/17'),
('2', '8:00', '5:00', '24/3/17'),
('2', '8:00', '5:00', '25/3/17'),
('2', '8:00', '5:00', '26/3/17'),
('2', '8:00', '5:00', '27/3/17'),
('2', '8:00', '5:00', '28/3/17'),
('2', '8:00', '5:00', '30/3/17'),
('3', '2', '5:00', '1/3/17'),
('3', '8:00', '5:00', '2/3/17'),
('3', '8:00', '5:00', '3/3/17'),
('3', '8:00', '5:00', '4/3/17'),
('3', '8:00', '5:00', '5/3/17'),
('3', '8:00', '5:00', '7/3/17'),
('3', '8:00', '5:00', '8/3/17'),
('3', '8:00', '5:00', '9/3/17'),
('3', '8:00', '5:00', '10/3/17'),
('3', '8:00', '5:00', '11/3/17'),
('3', '8:00', '5:00', '12/3/17'),
('3', '', '5:00', '13/3/17'),
('3', '8:00', '5:00', '15/3/17'),
('3', '8:00', '5:00', '16/3/17'),
('3', '8:00', '5:00', '17/3/17'),
('3', '8:00', '5:00', '18/3/17'),
('3', '8:00', '5:00', '19/3/17'),
('3', '8:00', '5:00', '20/3/17'),
('3', '8:00', '5:00', '22/3/17'),
('3', '8:00', '5:00', '23/3/17'),
('3', '8:00', '5:00', '24/3/17'),
('3', '8:00', '5:00', '25/3/17'),
('3', '8:00', '5:00', '26/3/17'),
('3', '8:00', '', '27/3/17'),
('3', '8:00', '5:00', '28/3/17'),
('3', '8:00', '5:00', '30/3/17');

-- --------------------------------------------------------

--
-- Table structure for table `req_table`
--

CREATE TABLE `req_table` (
  `t_id` varchar(11) NOT NULL,
  `date` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `t_id` varchar(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`t_id`, `Name`, `password`) VALUES
('1', 'A', '1111'),
('2', 'B', '2222'),
('3', 'C', '3333');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`t_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
