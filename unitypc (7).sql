-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 07, 2017 at 09:24 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `unitypc`
--

-- --------------------------------------------------------

--
-- Table structure for table `addproduct`
--

CREATE TABLE `addproduct` (
  `P_ID` int(10) NOT NULL,
  `P_SerialNO` varchar(50) NOT NULL,
  `P_Category` varchar(100) NOT NULL,
  `P_Name` varchar(100) DEFAULT NULL,
  `P_Price` double(10,2) DEFAULT NULL,
  `P_AddDate` date DEFAULT NULL,
  `P_WarrantyType` varchar(100) NOT NULL,
  `P_AddWarMonth` int(11) DEFAULT NULL,
  `P_ModelName` varchar(100) DEFAULT NULL,
  `P_Make` varchar(100) NOT NULL,
  `P_Type` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addproduct`
--

INSERT INTO `addproduct` (`P_ID`, `P_SerialNO`, `P_Category`, `P_Name`, `P_Price`, `P_AddDate`, `P_WarrantyType`, `P_AddWarMonth`, `P_ModelName`, `P_Make`, `P_Type`) VALUES
(100, 'BX21545ZX2', 'Laptops', 'Dell Inspiron 15-3542', 64990.00, '2017-02-16', 'Physical Warranty+Software Warranty', 36, 'inspiron 15-3542', 'Dell', 'Notebook'),
(101, 'KM466DS565', 'Laptops', 'Dell Inspiron 15-5547', 59990.00, '2017-02-16', 'Physical Warranty+Software Warranty', 36, 'Inspiron 15-5547', 'Dell', 'Notebook'),
(102, 'UJD25S5652', 'Laptops', 'HP Pavilion 15-E002AU E4X37PA', 65000.00, '2017-02-16', '7', 36, 'Pavilion 15-E002AU E4X37PA', 'HP', 'Probook'),
(103, 'DD6565D65', 'Laptops', 'HP Envy 15-J120TX F7P49PA', 94490.00, '2017-02-16', '5', 36, 'Envy 15-J120TX F7P49PA', 'HP', 'Desktop'),
(104, 'AC42522D2', 'Laptops', 'Acer Aspire E3-112', 60000.00, '2017-02-16', '4', 36, ' E3-112', 'Acer', 'Pro'),
(105, 'PE5455D554', 'Printer', 'HP - Officejet Pro 6978 Wireless All-In-One Instant Ink Ready Printer', 12000.00, '2017-02-16', '4', 9, 'Ink Ready Printer', 'HP', 'Wireless All-In-One '),
(106, 'DSD5445555', 'Printer', 'HP - Sprocket Photo Printer - White', 18000.00, '2017-02-16', '2', 12, ' White 258', 'HP', 'Sprocket Photo Printer'),
(107, 'HGDG45454', 'Printer', 'Canon - PIXMA MG7720 Black Wireless All-In-One Printer - Black', 7000.00, '2017-02-16', '5', 12, 'PIXMA MG7720 Black Wireless ', 'Canon', 'All-In-One Printer'),
(108, 'BBJD45454', 'Computer Casing', 'Cooler Master - HAF912 Mid-Tower Chassis - Black', 4000.00, '2017-02-16', '2', 3, 'With powersupply', 'Cool Master', 'HAF912 Mid-Tower Chassi'),
(109, 'NBJ245646', 'Harddisk', 'Seagate - Backup Plus Slim for Mac 1TB External USB 3.0 Portable Hard Drive', 9000.00, '2017-02-16', '12', 5, ' Backup Plus Slim for Mac 1TB External USB 3.0 ', 'Seagate', 'Portable Hard Drive'),
(110, 'UGD54553N', 'UPS', 'APC - Back-UPS 650VA Battery Back-Up System - Black', 6000.00, '2017-02-16', '6', 36, '650VA Battery Back-Up System ', 'APC', 'Back-UPS '),
(111, 'PO546455N', 'Power Supply', 'EVGA - 850W Modular BQ Power Supply - Black', 7500.00, '2017-02-16', '3', 36, 'Black', 'EVGA', '850W Modular BQ Power Supply '),
(112, 'PJH25245J', 'Motherboard', 'Gigabyte Technology - ATX Motherboard 3466MHz (Socket LGA 1151) - Black', 14000.00, '2017-02-16', '6', 24, 'Socket LGA 1151', 'Gigabyte', 'H81 M3'),
(113, 'KH556645M', 'MOUSE', 'Logitech - M310 Wireless Scroll Mouse - Black', 1500.00, '2017-02-16', '10', 6, 'M310 Wireless Scroll Mouse', 'Logitech', 'Wireless Mouse'),
(114, 'JHD55D665', 'KEYBOARD', 'Logitech - K780 Wireless Keyboard - White', 2500.00, '2017-02-16', '10', 12, ' K780', 'Logitech', 'Wireless Keyboard'),
(115, 'SDF245S66', 'Monitor', 'AOC - 21.5" IPS LED HD Monitor - Black', 6000.00, '2017-02-16', '6', 12, ' 21.5" IPS', 'AOC', 'LED HD Monitor '),
(116, 'GDP256D3', 'AUDIO Item', 'Creative - GigaWorks 14 W Speaker System - Glossy Black', 9000.00, '2017-02-16', '3', 12, 'GigaWorks 14 W', 'GigaWorks ', 'Speaker'),
(117, 'P5421DK3', 'Projector', 'Epson - EX3240 SVGA 3LCD Projector - White', 45000.00, '2017-02-16', '6', 24, 'EX3240 SVGA 3LCD Projector - White', 'Epson', 'LCD Projector '),
(118, 'KKk4565D12', 'Expansion Cards', 'RFX-60', 20000.00, '2017-02-16', '1', 24, 'Laptop', 'Nvidia', 'Rfx'),
(119, 'KKk4565D12', 'Motherboard', 'RFX-60', 20000.00, '2017-02-16', '1', 24, 'Rfx', 'Hp', 'nkjasf'),
(120, 'HGSD542XC4', 'Laptops', 'Dell', 65000.00, '2017-02-18', '5', 36, 'inspiron', 'DELL', 'Touch'),
(121, 'HFGDJ2455', 'Printer', 'HP', 6500.00, '2017-02-18', '1', 12, 'PX360', 'HP', 'deskjet'),
(122, 'HKFNJSN5565', 'Virus Guard', 'bdgfijasdpo', 2000.00, '2017-02-21', '1', 3, '3 User', 'BitDeffender', 'PC+Network Security');

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `BillNo` int(10) NOT NULL,
  `BillDate` date NOT NULL,
  `CustomerName` varchar(100) NOT NULL,
  `CustomerAddress` varchar(100) NOT NULL,
  `Purchase` varchar(100) NOT NULL,
  `Discount` int(10) NOT NULL,
  `GrandTotal` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `billing`
--

INSERT INTO `billing` (`BillNo`, `BillDate`, `CustomerName`, `CustomerAddress`, `Purchase`, `Discount`, `GrandTotal`) VALUES
(1, '2017-02-20', 'Mr.kathir', '69 1/1 Lower St Andrews Place Colombo 15', 'Cash', 10, 125989.92),
(2, '2017-02-22', 'Mr.Kathir', 'akjhfijsdhfiuasdhfuiosdhfiujads', 'Cash', 10, 15147.00),
(3, '2017-03-06', 'Mr.Kathir', '69 1/1 Lower St andrews Place', 'Cash', 10, 15525.00),
(4, '2017-03-06', 'Mr.Kathir', 'jbojfdiogjdsiojsdio', 'Cash', 0, 23000.00);

-- --------------------------------------------------------

--
-- Table structure for table `dummy`
--

CREATE TABLE `dummy` (
  `P_ID` int(10) NOT NULL,
  `BillNo` int(10) NOT NULL,
  `P_Name` varchar(100) NOT NULL,
  `SerialNo` varchar(100) NOT NULL,
  `UnitPrice` double(10,2) NOT NULL,
  `Quantity` int(5) NOT NULL,
  `Total` double(10,2) NOT NULL,
  `WarrantyMonth` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `released_stock`
--

CREATE TABLE `released_stock` (
  `P_ID` int(10) NOT NULL,
  `BillNo` int(10) NOT NULL,
  `Product_Name` varchar(100) NOT NULL,
  `SerialNo` varchar(20) NOT NULL,
  `UnitPrice` double(12,2) NOT NULL,
  `Quantity` int(5) NOT NULL,
  `TotalAmout` double(12,2) NOT NULL,
  `AddDate` date NOT NULL,
  `WarrantyMonth` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `released_stock`
--

INSERT INTO `released_stock` (`P_ID`, `BillNo`, `Product_Name`, `SerialNo`, `UnitPrice`, `Quantity`, `TotalAmout`, `AddDate`, `WarrantyMonth`) VALUES
(104, 1, 'Acer Aspire E3-112', 'AC42522D2', 60000.00, 1, 60000.00, '2017-02-20', 36),
(109, 2, 'Seagate - Backup Plus Slim for Mac 1TB External USB 3.0 Portable Hard Drive', 'NBJ245646', 9000.00, 1, 9000.00, '2017-02-22', 5),
(111, 2, 'EVGA - 850W Modular BQ Power Supply - Black', 'PO546455N', 7500.00, 1, 7500.00, '2017-02-22', 36),
(115, 3, 'AOC - 21.5" IPS LED HD Monitor - Black', 'SDF245S66', 6000.00, 1, 6000.00, '2017-03-06', 12),
(116, 3, 'Creative - GigaWorks 14 W Speaker System - Glossy Black', 'GDP256D3', 9000.00, 1, 9000.00, '2017-03-06', 12),
(119, 4, 'RFX-60', 'KKk4565D12', 20000.00, 1, 20000.00, '2017-03-06', 24);

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

CREATE TABLE `user_details` (
  `User_ID` int(5) NOT NULL,
  `User_Name` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `User_Type` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`User_ID`, `User_Name`, `Password`, `User_Type`) VALUES
(1, 'admin', 'LHKXLoO/DNb0fQmU/j7Qzw==', 'admin'),
(2, 'derushan', 'oJfTtchpM9WC/4Oqpu7FZQ==', 'Manager'),
(3, 'Kathir', 'oJfTtchpM9WC/4Oqpu7FZQ==', 'Keeper'),
(4, 'Dino', '123456789', 'Salesmen'),
(5, 'Hafni', '123456', 'Salesmen');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addproduct`
--
ALTER TABLE `addproduct`
  ADD PRIMARY KEY (`P_ID`);

--
-- Indexes for table `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`BillNo`);

--
-- Indexes for table `dummy`
--
ALTER TABLE `dummy`
  ADD PRIMARY KEY (`P_ID`);

--
-- Indexes for table `released_stock`
--
ALTER TABLE `released_stock`
  ADD PRIMARY KEY (`P_ID`);

--
-- Indexes for table `user_details`
--
ALTER TABLE `user_details`
  ADD PRIMARY KEY (`User_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
