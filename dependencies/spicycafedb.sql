-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 28, 2024 at 09:31 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `spicycafedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `food_items`
--

CREATE TABLE `food_items` (
  `item_name` varchar(128) NOT NULL,
  `category` varchar(32) NOT NULL,
  `short_code` varchar(32) NOT NULL,
  `price` float NOT NULL,
  `available_qnty` int(11) NOT NULL,
  `item_code` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `food_items`
--

INSERT INTO `food_items` (`item_name`, `category`, `short_code`, `price`, `available_qnty`, `item_code`) VALUES
('Apple Juice', 'juice', 'aplj', 240, 23, 'aplj1'),
('Chicken Fried Rice (Normal)', 'fried_rice', 'cfrn', 800, 50, 'chifrrn'),
('Cheesy Delight Pizza (Regular)', 'pizza', 'cdpr', 1770, 15, 'pizza1');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `first_name` varchar(128) NOT NULL,
  `last_name` varchar(128) NOT NULL,
  `user_id` varchar(64) NOT NULL,
  `password` varchar(128) NOT NULL,
  `job_roll` varchar(128) NOT NULL,
  `last_log_in_date` date NOT NULL DEFAULT current_timestamp(),
  `last_log_in_time` time NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`first_name`, `last_name`, `user_id`, `password`, `job_roll`, `last_log_in_date`, `last_log_in_time`) VALUES
('Pasindu', 'Weerasekara', 'pasindu', 'pasindu', 'manager', '2024-04-28', '12:51:19'),
('Malith', 'Dileesha', 'malith', 'malith', 'chashier', '2024-04-28', '12:59:52');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
