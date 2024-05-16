-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema db_ferramentas
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_ferramentas
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_ferramentas` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `db_ferramentas` ;

-- -----------------------------------------------------
-- Table `db_ferramentas`.`tb_amigos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferramentas`.`tb_amigos` (
  `nome` VARCHAR(100) NOT NULL,
  `telefone` INT NULL,
  PRIMARY KEY (`nome`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `db_ferramentas`.`tb_ferramentas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferramentas`.`tb_ferramentas` (
  `id` INT NOT NULL,
  `nome` VARCHAR(100) NULL DEFAULT NULL,
  `marca` VARCHAR(50) NULL DEFAULT NULL,
  `custo` INT NULL DEFAULT NULL,
  `tb_amigos_nome` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tb_ferramentas_tb_amigos_idx` (`tb_amigos_nome` ASC) VISIBLE,
  CONSTRAINT `fk_tb_ferramentas_tb_amigos`
    FOREIGN KEY (`tb_amigos_nome`)
    REFERENCES `db_ferramentas`.`tb_amigos` (`nome`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `db_ferramentas`.`tb_emprestimos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ferramentas`.`tb_emprestimos` (
  `tb_amigos_nome` VARCHAR(100) NOT NULL,
  INDEX `fk_tb_emprestimos_tb_amigos1_idx` (`tb_amigos_nome` ASC) VISIBLE,
  CONSTRAINT `fk_tb_emprestimos_tb_amigos1`
    FOREIGN KEY (`tb_amigos_nome`)
    REFERENCES `db_ferramentas`.`tb_amigos` (`nome`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;