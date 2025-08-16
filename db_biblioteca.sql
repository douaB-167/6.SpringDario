DROP DATABASE biblioteca;

CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE autori (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL,
cognome VARCHAR(50) NOT NULL,
nazionalita VARCHAR(30)
);

CREATE TABLE libri (
id INT PRIMARY KEY AUTO_INCREMENT,
titolo VARCHAR(100) NOT NULL,
autore_id INT,
anno_pubblicazione INT,
disponibile BOOLEAN DEFAULT true,
FOREIGN KEY (autore_id) REFERENCES autori(id)
);

CREATE TABLE prestiti (
id INT PRIMARY KEY AUTO_INCREMENT,
libro_id INT,
data_prestito DATE NOT NULL,
data_restituzione DATE,

nome_utente VARCHAR(100) NOT NULL,
FOREIGN KEY (libro_id) REFERENCES libri(id));