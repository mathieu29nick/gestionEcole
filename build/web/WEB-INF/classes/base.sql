create user ecole with password 'ecole';

create database ecole;

alter database ecole owner to ecole;

-- Create a new relational table
CREATE TABLE Secretaire(
    id SERIAL NOT NULL PRIMARY KEY,
    nom VARCHAR(250) NOT NULL,
    numSecretaire VARCHAR(250)NOT NULL,
    mdp VARCHAR(250) NOT NULL
);

CREATE TABLE Admin (
    id SERIAL NOT NULL PRIMARY KEY,
    nom VARCHAR(250) NOT NULL,
    numAdmin VARCHAR(250) NOT NULL,
    mdp VARCHAR(250) NOT NULL
);


CREATE TABLE Promotion(
    id SERIAL NOT NULL PRIMARY KEY,
    nom VARCHAR(250) NOT NULL,
    actuel int NOT NULL
);
 
CREATE TABLE Niveau(
    id SERIAL NOT NULL PRIMARY KEY,
    nom VARCHAR(250) NOT NULL,
    ecolage FLOAT NOT NULL
);

CREATE TABLE Etudiants(
    id SERIAL NOT NULL PRIMARY KEY,
    nom VARCHAR(250) NOT NULL,
    idProm int,
    idNiveau int,
    date_naissance DATE NOT NULL,
    numETU VARCHAR(250) NOT NULL,
    dateInscription DATE DEFAULT CURRENT_DATE NOT NULL,
    sexe int NOT NULL,
    adresse VARCHAR(250) NOT NULL
);

CREATE TABLE Ecolage(
    id SERIAL NOT NULL PRIMARY KEY,
    idEtudiant int,
    montant FLOAT NOT NULL,
    mois int NOT NULL,
    annee int NOT NULL,
    date DATE DEFAULT CURRENT_DATE NOT NULL,
    idNiveau int 
);

CREATE TABLE Matiere(
    id SERIAL NOT NULL PRIMARY KEY,
    nom VARCHAR(250) NOT NULL,
    coeff int NOT NULL,
    idNiveau int,
    idProf int,
    nombreExamen int NOT NULL
);

CREATE TABLE Notes(
    id SERIAL NOT NULL PRIMARY KEY,
    idEtudiant int,
    idMatiere int,
    Note FLOAT NOT NULL,
    date DATE NOT NULL,
    numeroExamen int NOT NULL
);

CREATE TABLE NotesValide(
    id SERIAL NOT NULL PRIMARY KEY,
    idNote int
);

CREATE TABLE Professeur(
    id SERIAL NOT NULL PRIMARY KEY,
    nom VARCHAR(250) NOT NULL,
    numProf VARCHAR(250) NOT NULL,
    mdp VARCHAR(250) NOT NULL
);

CREATE TABLE Classement(
    id SERIAL NOT NULL PRIMARY KEY,
    nom VARCHAR(250) NOT NULL,
    numETU VARCHAR(250) NOT NULL,
    moyenne FLOAT NOT NULL,
    merite VARCHAR(250) NOT NULL,
    prom VARCHAR(250) NOT NULL,
    niveau VARCHAR(250) NOT NULL
);

CREATE TABLE EtatPayementEcolage(
    id SERIAL NOT NULL PRIMARY KEY,
    niveau VARCHAR(250) NOT NULL,
    paye REAL NOT NULL,
    reste REAL NOT NULL,
    ecolage REAL NOT NULL
);

ALTER TABLE Etudiants
ADD FOREIGN KEY(idProm)
REFERENCES Promotion(id);

ALTER TABLE Etudiants
ADD FOREIGN KEY(idNiveau)
REFERENCES Niveau(id);

ALTER TABLE Ecolage
ADD FOREIGN KEY(idEtudiant)
REFERENCES Etudiants(id);

ALTER TABLE Ecolage
ADD FOREIGN KEY(idNiveau)
REFERENCES Niveau(id);

ALTER TABLE Matiere
ADD FOREIGN KEY(idNiveau)
REFERENCES Niveau(id);

ALTER TABLE Matiere
ADD FOREIGN KEY(idProf)
REFERENCES Professeur(id);

ALTER TABLE Notes
ADD FOREIGN KEY(idEtudiant)
REFERENCES Etudiants(id);

ALTER TABLE Notes
ADD FOREIGN KEY(idMatiere)
REFERENCES Matiere(id);

ALTER TABLE NotesValide
ADD FOREIGN KEY(idNote)
REFERENCES Notes(id);

--Create a new Relational View

CREATE VIEW DetailEtudiant 
AS
SELECT n.id as idNiv, n.nom as nomNiv, n.ecolage,
p.id as idProm, p.nom as prom,
e.id, e.nom, e.date_naissance, e.numETU, e.dateInscription, e.sexe, e.adresse
FROM Etudiants as e 
JOIN Niveau as n
ON n.id = e.idNiveau
JOIN Promotion as p
ON p.id = e.idProm;

CREATE VIEW EcolageEtudiant
AS 
SELECT n.id as idNiv, n.nom as nomNiv, (n.ecolage * 6) as ecolageNiv,
p.id as idProm, p.nom as prom, p.actuel,
e.id, e.nom, e.date_naissance, e.numETU, e.dateInscription, e.sexe, e.adresse,
sum(ec.montant) as sommeDate
FROM Etudiants as e
JOIN Promotion as p
ON p.id = e.idProm
LEFT JOIN Ecolage as ec
ON ec.idEtudiant = e.id
JOIN Niveau as n
ON n.id = ec.idNiveau
GROUP BY e.id, e.nom, e.date_naissance, e.numETU, e.dateInscription, e.sexe, e.adresse,
n.id,n.nom,p.id, p.nom, p.actuel, ec.date;


--Insertion des données

INSERT INTO Niveau(nom, ecolage) VALUES ('L1', 2400000);
INSERT INTO Niveau(nom, ecolage) VALUES ('L2', 3000000);
INSERT INTO Niveau(nom, ecolage) VALUES ('L3', 3600000);

INSERT INTO Promotion(nom, actuel) VALUES ('P13A',0);
INSERT INTO Promotion(nom, actuel) VALUES ('P13B',0);
INSERT INTO Promotion(nom, actuel) VALUES ('P14A',0);
INSERT INTO Promotion(nom, actuel) VALUES ('P14B',0);
INSERT INTO Promotion(nom, actuel) VALUES ('P15A',1);
INSERT INTO Promotion(nom, actuel) VALUES ('P15B',1);

INSERT INTO Etudiants(nom, idProm, idNiveau, date_naissance, numETU, sexe, adresse) VALUES ('Rakoto Mamy', 1, 3, '1999-09-01','ETU001317', 0, 'Lot V54 Ambohimangakely');
INSERT INTO Etudiants(nom, idProm, idNiveau, date_naissance, numETU, sexe, adresse) VALUES ('Rabe Mialy', 2, 3, '1998-12-22','ETU001320', 1, 'Lot A23 Ivato');
INSERT INTO Etudiants(nom, idProm, idNiveau, date_naissance, numETU, sexe, adresse) VALUES ('Razafy Daniel', 2, 3, '2000-10-14','ETU001344', 0, 'Lot B54 Ambohibao');
INSERT INTO Etudiants(nom, idProm, idNiveau, date_naissance, numETU, sexe, adresse) VALUES ('Andrianjafy Fano', 3, 2, '2001-01-23','ETU001410', 1, 'Lot W14 Andohalo');
INSERT INTO Etudiants(nom, idProm, idNiveau, date_naissance, numETU, sexe, adresse) VALUES ('Andria Mino', 4, 2, '2002-08-14','ETU001405', 1, 'Lot Z34 Antanimena');
INSERT INTO Etudiants(nom, idProm, idNiveau, date_naissance, numETU, sexe, adresse) VALUES ('Randria Faly', 3, 2, '2003-11-03','ETU001400', 0, 'Lot V54 Ankadifotsy');
INSERT INTO Etudiants(nom, idProm, idNiveau, date_naissance, numETU, sexe, adresse) VALUES ('Ramanana Stella', 5, 1, '2000-08-23','ETU001521', 1, 'Lot B54 Alasora');
INSERT INTO Etudiants(nom, idProm, idNiveau, date_naissance, numETU, sexe, adresse) VALUES ('Ravelo Loic', 6, 1, '2004-03-25','ETU001571', 0, 'Lot VW Ankatso');
INSERT INTO Etudiants(nom, idProm, idNiveau, date_naissance, numETU, sexe, adresse) VALUES ('Manana Nomena', 6, 1, '1998-09-03','ETU001509', 1, 'Lot AB Anosy');
INSERT INTO Etudiants(nom, idProm, idNiveau, date_naissance, numETU, sexe, adresse) VALUES ('Razafy Manantsoa', 5, 1, '2000-05-29','ETU001577', 0, 'Lot B68 Itaosy');


INSERT INTO Secretaire(nom, numSecretaire, mdp) VALUES ('Secretaire', '0340201174', 'Secretaire');

INSERT INTO Admin(nom, numAdmin, mdp) VALUES ('Admin', '0321429034', 'Admin');


INSERT INTO Ecolage(idEtudiant,montant, mois, annee, date, idNiveau) VALUES ( 4, 1000000, 4,2021, '2021-11-12',2);
INSERT INTO Ecolage(idEtudiant,montant, mois, annee, date, idNiveau) VALUES ( 10, 2200000, 1,2022, '2022-01-23',1);
INSERT INTO Ecolage(idEtudiant,montant, mois, annee, date, idNiveau) VALUES ( 5, 1750000, 7,2020, '2020-01-08',2);
INSERT INTO Ecolage(idEtudiant,montant, mois, annee, date, idNiveau) VALUES ( 2, 600000, 2,2021, '2021-02-05',3);

INSERT INTO Professeur(nom, numProf, mdp) VALUES ('Mr Math', '0330947821', 'Math');
INSERT INTO Professeur(nom, numProf, mdp) VALUES ('Mr Info', '0329483419', 'Info');
INSERT INTO Professeur(nom, numProf, mdp) VALUES ('Mr Comm', '0331274893', 'Comm');

INSERT INTO Matiere(nom, coeff, idNiveau, idProf, nombreExamen) VALUES ('Math', 7, 1, 1, 2);
INSERT INTO Matiere(nom, coeff, idNiveau, idProf, nombreExamen) VALUES ('Info', 9, 3, 2, 5);
INSERT INTO Matiere(nom, coeff, idNiveau, idProf, nombreExamen) VALUES ('Comm', 5, 2, 3, 3);

INSERT INTO Notes(idEtudiant, idMatiere, note, date, numeroExamen) VALUES (1, 2, 14, '2022-03-01', 5);
INSERT INTO Notes(idEtudiant, idMatiere, note, date, numeroExamen) VALUES (6, 3, 10, '2022-03-01', 3);

INSERT INTO NotesValide(idNote) VALUES(1);

INSERT INTO Classement(nom, numETU, moyenne, merite, prom, niveau) VALUES('Rakoto Mamy', 'ETU001317', 15.2, 'merite', 'Prom13', 3);

INSERT INTO EtatPayementEcolage(niveau, paye, reste, ecolage) VALUES(1,2000000, 200000, 2200000);

CREATE OR REPLACE VIEW NoteNonValide as 
SELECT niv.id as idNiv, niv.nom as nomNiv, p.id as idProm,
p.nom as prom, m.id as idMat, m.nom as nomMat, m.coeff as coeff,
n.id as idNote, n.note as note, n.date as date
FROM Notes as n
JOIN Etudiants as e
ON e.id = n.idEtudiant
JOIN Matiere as m
ON m.id = n.idMatiere
JOIN Promotion as p
ON p.id = e.idProm
JOIN Niveau as  niv
ON niv.id = m.idNiveau
WHERE n.id not in (SELECT idNote from NotesValide);

CREATE OR REPLACE VIEW NoteValideMatiere as
SELECT niv.id as idNiv, niv.nom as nomNiv, p.id as idProm,
p.nom as prom, e.id as id, e.nom as nom, e.numETU as numETU,
e.sexe as sexe, e.adresse as adresse, m.id as idMat, m.nom as nomMat,
m.coeff as coeff, n.id as idNote, sum(n.note)/m.nombreExamen as total,
n.date as date, nv.id as idNv
FROM NotesValide as nv
JOIN Notes as n
ON n.id = nv.idNote
JOIN Matiere as m
ON n.idMatiere = m.id
JOIN Etudiants as e
ON e.id = n.idEtudiant
JOIN Promotion as p
ON p.id = e.idProm
JOIN Niveau as niv
ON niv.id = m.idNiveau
GROUP BY e.id, e.nom, e.numETU, e.sexe, e.adresse, niv.id,
niv.nom, p.id, p.nom, m.id, m.nom, m.coeff, m.coeff, n.id, n.date, nv.id;