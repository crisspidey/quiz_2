-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
drop database mydb2;
-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb2` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb2`.`person` (
  `idEmployee` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `hiringDate` DATE NOT NULL,
  `type` VARCHAR(45) NULL,
  PRIMARY KEY (`idEmployee`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb2`.`Student` (
  `type` VARCHAR(45) NOT NULL,
  `department` VARCHAR(45) NOT NULL,
  `courses` INT NULL,
  `weekHours` INT NULL,
  `Employee_idEmployee` INT NOT NULL,
  INDEX `fk_Student_Employee1_idx` (`Employee_idEmployee` ASC),
  CONSTRAINT `fk_Student_Employee1`
    FOREIGN KEY (`Employee_idEmployee`)
    REFERENCES `mydb`.`person` (`idEmployee`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Professor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb2`.`Professor` (
  `type` VARCHAR(45) NOT NULL,
  `school` VARCHAR(45) NOT NULL,
  `department` VARCHAR(45) NOT NULL,
  `salary` FLOAT NULL,
  `category` VARCHAR(45) NULL,
  `classHours` VARCHAR(45) NULL,
  `Employee_idEmployee` INT NOT NULL,
  INDEX `fk_Professor_Employee_idx` (`Employee_idEmployee` ASC),
  CONSTRAINT `fk_Professor_Employee`
    FOREIGN KEY (`Employee_idEmployee`)
    REFERENCES `mydb`.`person` (`idEmployee`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
