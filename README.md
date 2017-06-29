# RESTFulAPI
Content

Technologies -
(1) Language - JAVA 8
(2) Framework - Jersey Jax-rs for creating RESTful APIs in Java
(3) Editor – Eclipse neon.3
(4) Database – mysql
(5) Server – tomcat-7
(6) Maven
(7) Rest API client - Postman(for making REST API calls)
(8) Hibernate to interact with database. 

Here, Some details about databse as bellow:

-- phpMyAdmin SQL Dump
-- version 4.6.6deb4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 29, 2017 at 12:27 PM
-- Server version: 5.7.18-0ubuntu0.17.04.1
-- PHP Version: 7.0.18-0ubuntu0.17.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `HibernateDatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `EMPLOYEE`
--

CREATE TABLE `EMPLOYEE` (
  `ID` bigint(20) NOT NULL,
  `FIRST_NAME` varchar(255) DEFAULT NULL,
  `LAST_NAME` varchar(255) DEFAULT NULL,
  `SALARY` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `EMPLOYEE`
--
ALTER TABLE `EMPLOYEE`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `EMPLOYEE`
--
ALTER TABLE `EMPLOYEE`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT;

There are some RESTful API as bellow:

(1) GET -
OUTPUT - Lists all Entity Class object in Json Format
Link:- http://localhost:8080/glaucusapi/webapi/employees 
(2) GET -
INPUT - {entityid} as path parameter
OUTPUT - Returns the Entity instance associated with the given entityid in 
JSON format.
Link:- http://localhost:8080/glaucusapi/webapi/employees/{employeeId} 
(3) GET -
OUTPUT - Returns the total count of Entity instances
Link:- http://localhost:8080/glaucusapi/webapi/totalemployee 
(4) POST -
INPUT - Entity object in JSON format
OUTPUT - Creates a new Entity instance and return it in JSON format
Input:
{
    "first_name": "Anil",
    "last_name": "Singh",
    "salary": 30000
}
Link:- http://localhost:8080/glaucusapi/webapi/employees 
(5) PUT -
INPUT - {entityid} as path parameter
OUTPUT -Update an existing Entity instance associated with the given id and 
return the updated entity in JSON format
Input:
{
    "first_name": "Anil",
    "last_name": "Gandhar",
    "salary": 30000
}
Link:- http://localhost:8080/glaucusapi/webapi/employees/1 
(6) DELETE -
INPUT - {entityid} as path parameter
OUTPUT -Deletes the Entity instance associated with the given id and return 
(true/false) confirmation
Link:- http://localhost:8080/glaucusapi/webapi/employees/1
output:- true


Thanks,
B.Singh
