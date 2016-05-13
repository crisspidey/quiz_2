-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Student` (
  `idStudent` INT NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  `department` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `hiringdate` DATE NOT NULL,
  `Studentcol` VARCHAR(45) NOT NULL,
  `courses` INT NOT NULL,
  `weekHours` INT NOT NULL,
  `salary` DOUBLE NOT NULL,
  PRIMARY KEY (`idStudent`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Professor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Professor` (
  `idProfessor` INT NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `hiringDate` DATE NOT NULL,
  `school` VARCHAR(45) NOT NULL,
  `department` VARCHAR(45) NOT NULL,
  `salary` DOUBLE NOT NULL,
  `category` VARCHAR(45) NOT NULL,
  `classHours` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idProfessor`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
