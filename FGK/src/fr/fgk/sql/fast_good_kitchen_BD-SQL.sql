#------------------------------------------------------------
# Script MySQL.
#------------------------------------------------------------
DROP SCHEMA IF EXISTS Fast_Good_Kitchen;
CREATE SCHEMA IF NOT EXISTS Fast_Good_Kitchen DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE Fast_Good_Kitchen;

#------------------------------------------------------------
# Table: CATEGORIE
#------------------------------------------------------------
CREATE TABLE CATEGORIE(
idCat Int Auto_increment NOT NULL ,
libelle Varchar (50) NOT NULL
,CONSTRAINT CATEGORIE_PK PRIMARY KEY (idCat)
)ENGINE=InnoDB;

#------------------------------------------------------------
# Table: PLAT
#------------------------------------------------------------
CREATE TABLE PLAT(
idPlat Varchar (50) NOT NULL ,
libelle Varchar (50) NOT NULL ,
prixPlat Float NOT NULL ,
idCat Int NOT NULL
,CONSTRAINT PLAT_PK PRIMARY KEY (idPlat)
,CONSTRAINT PLAT_CATEGORIE_FK FOREIGN KEY (idCat) REFERENCES CATEGORIE(idCat)
)ENGINE=InnoDB;

#------------------------------------------------------------
# Table: CLIENT
#------------------------------------------------------------
CREATE TABLE CLIENT(
idClient Int Auto_increment NOT NULL ,
nom Varchar (50) NOT NULL
,CONSTRAINT CLIENT_PK PRIMARY KEY (idClient)
)ENGINE=InnoDB;

#------------------------------------------------------------
# Table: FACTURE
#------------------------------------------------------------
CREATE TABLE FACTURE(
idFacture Int Auto_increment NOT NULL ,
montant Float NOT NULL ,
dateFacturation Date NOT NULL ,
etat Int NOT NULL ,
idClient Int NOT NULL
,CONSTRAINT FACTURE_PK PRIMARY KEY (idFacture)
,CONSTRAINT FACTURE_CLIENT_FK FOREIGN KEY (idClient) REFERENCES CLIENT(idClient)
)ENGINE=InnoDB;

#------------------------------------------------------------
# Table: platsChoisis
#------------------------------------------------------------
CREATE TABLE platsChoisis(
idPlatsChoisis Int Auto_increment NOT NULL ,
quantite Int NOT NULL ,
idPlat Varchar (50) NOT NULL
,CONSTRAINT platsChoisis_PK PRIMARY KEY (idPlatsChoisis)
,CONSTRAINT platsChoisis_PLAT_FK FOREIGN KEY (idPlat) REFERENCES PLAT(idPlat)
)ENGINE=InnoDB;

#------------------------------------------------------------
# Table: commande
#------------------------------------------------------------
CREATE TABLE commande(
idPlatsChoisis Int NOT NULL ,
idClient Int NOT NULL
,CONSTRAINT commande_PK PRIMARY KEY (idPlatsChoisis,idClient)
,CONSTRAINT commande_platsChoisis_FK FOREIGN KEY (idPlatsChoisis) REFERENCES platsChoisis(idPlatsChoisis)
,CONSTRAINT commande_CLIENT0_FK FOREIGN KEY (idClient) REFERENCES CLIENT(idClient)
)ENGINE=InnoDB;

INSERT INTO `fast_good_kitchen`.`categorie` (`idCat`, `libelle`) VALUES ('1', 'Burgers');
INSERT INTO `fast_good_kitchen`.`categorie` (`idCat`, `libelle`) VALUES ('2', 'Boissons');
INSERT INTO `fast_good_kitchen`.`categorie` (`idCat`, `libelle`) VALUES ('3', 'Desserts');

INSERT INTO `fast_good_kitchen`.`client` (`idClient`, `nom`) VALUES ('1', 'Eren');
INSERT INTO `fast_good_kitchen`.`client` (`idClient`, `nom`) VALUES ('2', 'Mikasa');

INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('1', 'Chicken', '5', '1');
INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('2', 'Fish', '4', '1');
INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('3', 'Coca', '2', '2');
INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('4', 'Fanta', '2', '2');
INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('5', 'Glace', '2', '3');
INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('6', 'Double-Egg', '18', '1');
INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('7', 'Double', '15', '1');
INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('8', 'Whooper', '14', '1');
INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('9', 'Egg-Burger', '15', '1');
INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('10', 'King', '20', '1');
INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('11', 'Steak-House', '19', '1');




INSERT INTO `fast_good_kitchen`.`platschoisis` (`idPlatsChoisis`, `quantite`, `idPlat`) VALUES ('1', '2', '1');
INSERT INTO `fast_good_kitchen`.`platschoisis` (`idPlatsChoisis`, `quantite`, `idPlat`) VALUES ('2', '1', '4');

INSERT INTO `fast_good_kitchen`.`commande` (`idPlatsChoisis`, `idClient`) VALUES ('1', '1');
INSERT INTO `fast_good_kitchen`.`commande` (`idPlatsChoisis`, `idClient`) VALUES ('2', '1');

INSERT INTO `fast_good_kitchen`.`facture` (`idFacture`, `montant`, `dateFacturation`, `etat`, `idClient`) VALUES ('1', '12', '2021-12-10', '1', '1');

