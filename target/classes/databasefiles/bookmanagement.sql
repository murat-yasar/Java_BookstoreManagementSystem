-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 14, 2022 at 10:38 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookmanagement`
--
CREATE DATABASE IF NOT EXISTS `bookmanagement` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bookmanagement`;

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `pk_id` int(11) NOT NULL,
  `genre` varchar(50) NOT NULL,
  `title` varchar(100) NOT NULL,
  `publish_year` int(11) NOT NULL,
  `author` varchar(100) DEFAULT NULL,
  `count` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`pk_id`, `genre`, `title`, `publish_year`, `author`, `count`) VALUES
(1, 'Science-Fiction', 'I, Robot', 1950, 'Isaac Asimov', 1),
(2, 'Coursebook', 'Java: How to Program', 1996, 'Paul Deitel, Harvey Deitel', 1),
(3, 'Fantasy', 'The Lord of the Rings', 1954, 'J. R. R. Tolkien', 1),
(4, 'Adventure', 'Moby Dick', 1851, 'Herman Melville', 1),
(5, 'Self Help & Personal Development', 'The 7 Habits of Highly Effective People', 1989, 'Stephen Covey', 1),
(6, 'Travel', 'Down and Out in Paris and London', 1933, 'George Orwell', 1),
(7, 'Children’s Books', 'Little Women', 1880, 'May Alcott', 1),
(8, 'History', 'Orientalism', 1978, 'Edward W. Said', 1),
(9, 'History', 'Guns, Germs, and Steel', 1997, 'Jared Diamond', 1),
(10, 'Memoir & Biography', 'Angela’s Ashes', 1996, 'Frank McCourt', 1),
(11, 'Politics', 'Why Nations Fail: The Origins of Power, Prosperity', 2013, 'Daron Acemoglu, James A. Robinson', 1),
(12, 'Politics', '21 Lessons for the 21st Century', 2018, 'Yuval Noah Harari', 1),
(13, 'Action and Adventure', 'White Fang', 1906, 'Jack London', 1),
(14, 'Detective & Mystery', 'Murder on the the Orient Express', 1934, 'Agatha Christie', 1),
(15, 'Horror', 'The Shining', 1977, 'Stephen King', 1),
(16, 'Cooking', 'Indian Instant Pot Cookbook', 2017, 'Urvashi Pitre', 1),
(17, 'Art & Photography', 'How to Create Stunning Digital Photography', 2012, 'Tony Northrup', 1),
(18, 'Health & Fitness', 'Food Can Fix It', 2018, 'Dr. Mehmet Öz', 1),
(19, 'Crafts, Hobbies & Home', 'Bobby Fischer Teaches Chess', 1966, 'Bobby Fischer, Stuart Margulies, Don Mosenfelder', 1),
(20, 'Crafts, Hobbies & Home', 'Chess Fundamentals', 1921, 'José Raúl Capablanca', 1),
(21, 'Religion & Spirituality', 'Eat, Pray, Love', 2007, 'Elizabeth Gilbert', 1),
(22, 'Religion & Spirituality', 'The Art of Happiness', 2005, 'Dalai Lama XIV, Howard Cutler', 1),
(23, 'Religion & Spirituality', 'Tao Te Ching (A New English Version)', 2006, 'Lao Tzu (translated by Stephen Mitchell)', 1),
(24, 'Drama', 'Hamlet', 1601, 'William Shakespeare', 1),
(25, 'Graphic Novel', 'Hellboy: The Chained Coffin and Others', 1998, 'Mike Mignola', 1),
(31, 'AA', 'Başlık', 2022, 'Seda', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`pk_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `pk_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
