DROP SCHEMA IF EXISTS Fast_Good_Kitchen;
CREATE SCHEMA IF NOT EXISTS Fast_Good_Kitchen DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE Fast_Good_Kitchen;
 
CREATE TABLE CATEGORIE(
        idCat   Int  Auto_increment  NOT NULL ,
        libelle Varchar (9) NOT NULL
	,CONSTRAINT CATEGORIE_PK PRIMARY KEY (idCat)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: plat
#------------------------------------------------------------

CREATE TABLE plat(
        idPlat   Int  Auto_increment  NOT NULL ,
        libelle  Varchar (22) NOT NULL ,
        prixPlat Float NOT NULL ,
        idCat    Int NOT NULL
	,CONSTRAINT plat_PK PRIMARY KEY (idPlat)

	,CONSTRAINT plat_CATEGORIE_FK FOREIGN KEY (idCat) REFERENCES CATEGORIE(idCat)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: FORMULE
#------------------------------------------------------------

CREATE TABLE FORMULE(
        idFormule   Int  Auto_increment  NOT NULL ,
        libelle     Varchar (22) NOT NULL ,
        prixFormule Float NOT NULL
	,CONSTRAINT FORMULE_PK PRIMARY KEY (idFormule)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: CLIENT
#------------------------------------------------------------

CREATE TABLE CLIENT(
        idClient Int  Auto_increment  NOT NULL ,
        nom      Varchar (30) NOT NULL
	,CONSTRAINT CLIENT_PK PRIMARY KEY (idClient)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: RESERVATION
#------------------------------------------------------------

CREATE TABLE RESERVATION(
        idReservation Int  Auto_increment  NOT NULL ,
        nbPersonnes   Int NOT NULL ,
        etat          Int NOT NULL ,
        idClient      Int NOT NULL
	,CONSTRAINT RESERVATION_PK PRIMARY KEY (idReservation)

	,CONSTRAINT RESERVATION_CLIENT_FK FOREIGN KEY (idClient) REFERENCES CLIENT(idClient)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: facture
#------------------------------------------------------------

CREATE TABLE facture(
        idReservation    Int NOT NULL ,
        montant          Float NOT NULL ,
        dateFact         Date NOT NULL ,
        etat             Int NOT NULL ,
        nbPersonnes      Int NOT NULL ,
        etat_RESERVATION Int NOT NULL ,
        idClient         Int NOT NULL
	,CONSTRAINT facture_PK PRIMARY KEY (idReservation)

	,CONSTRAINT facture_RESERVATION_FK FOREIGN KEY (idReservation) REFERENCES RESERVATION(idReservation)
	,CONSTRAINT facture_CLIENT0_FK FOREIGN KEY (idClient) REFERENCES CLIENT(idClient)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: platsChoisis
#------------------------------------------------------------

CREATE TABLE platsChoisis(
        idFormule Int NOT NULL ,
        idPlat    Int NOT NULL
	,CONSTRAINT platsChoisis_PK PRIMARY KEY (idFormule,idPlat)

	,CONSTRAINT platsChoisis_FORMULE_FK FOREIGN KEY (idFormule) REFERENCES FORMULE(idFormule)
	,CONSTRAINT platsChoisis_plat0_FK FOREIGN KEY (idPlat) REFERENCES plat(idPlat)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: COMMANDE
#------------------------------------------------------------

CREATE TABLE COMMANDE(
        idReservation Int NOT NULL ,
        idFormule     Int NOT NULL ,
        quantite      Int NOT NULL
	,CONSTRAINT COMMANDE_PK PRIMARY KEY (idReservation,idFormule)

	,CONSTRAINT COMMANDE_RESERVATION_FK FOREIGN KEY (idReservation) REFERENCES RESERVATION(idReservation)
	,CONSTRAINT COMMANDE_FORMULE0_FK FOREIGN KEY (idFormule) REFERENCES FORMULE(idFormule)
)ENGINE=InnoDB;



INSERT INTO `fast_good_kitchen`.`categorie` (`idCat`, `libelle`) VALUES ('1', 'BURGERS');
INSERT INTO `fast_good_kitchen`.`categorie` (`idCat`, `libelle`) VALUES ('2', 'BOISSONS');
INSERT INTO `fast_good_kitchen`.`categorie` (`idCat`, `libelle`) VALUES ('3', 'DESSERTS');

INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('1', 'CHEESBURGER + FRITES', '15', '1');
INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('2', 'CREME BRULEE', '8', '3');
INSERT INTO `fast_good_kitchen`.`plat` (`idPlat`, `libelle`, `prixPlat`, `idCat`) VALUES ('3', 'COCA', '8', '2');

INSERT INTO `fast_good_kitchen`.`formule` (`idFormule`, `libelle`, `prixFormule`) VALUES ('1', 'KITCHEN', '5');
INSERT INTO `fast_good_kitchen`.`formule` (`idFormule`, `libelle`, `prixFormule`) VALUES ('2', 'BIGKITCHEN', '350');
INSERT INTO `fast_good_kitchen`.`formule` (`idFormule`, `libelle`, `prixFormule`) VALUES ('3', 'KIDCHEN', '20');

INSERT INTO `fast_good_kitchen`.`client` (`idClient`, `nom`) VALUES ('1', 'DUPONT');
INSERT INTO `fast_good_kitchen`.`client` (`idClient`, `nom`) VALUES ('2', 'BENZEMA');
INSERT INTO `fast_good_kitchen`.`client` (`idClient`, `nom`) VALUES ('3', 'GIROUD');

INSERT INTO `fast_good_kitchen`.`platschoisis` (`idFormule`, `idPlat`) VALUES ('2', '1');
INSERT INTO `fast_good_kitchen`.`platschoisis` (`idFormule`, `idPlat`) VALUES ('3', '2');

INSERT INTO `fast_good_kitchen`.`reservation` (`idReservation`, `nbPersonnes`, `etat`, `idClient`) VALUES ('1', '6', '0', '2');
INSERT INTO `fast_good_kitchen`.`reservation` (`idReservation`, `nbPersonnes`, `etat`, `idClient`) VALUES ('2', '8', '1', '3');
INSERT INTO `fast_good_kitchen`.`reservation` (`idReservation`, `nbPersonnes`, `etat`, `idClient`) VALUES ('3', '4', '0', '1');

INSERT INTO `fast_good_kitchen`.`commande` (`idReservation`, `idFormule`, `quantite`) VALUES ('2', '1', '3');
INSERT INTO `fast_good_kitchen`.`commande` (`idReservation`, `idFormule`, `quantite`) VALUES ('3', '3', '2');




