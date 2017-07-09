/* BASE DE DADOS */
CREATE DATABASE trabpoo1;

/* DESCOMENTAR ESTE CÓDIGO PRA RESETAR O BANCO DEPOIS DE CRIADO (comentar o comando anterior) */
/*
DROP SCHEMA PUBLIC CASCADE;
CREATE SCHEMA PUBLIC;
*/

/* TABELAS */
CREATE TABLE Modelo (
    ID_Modelo serial PRIMARY KEY,
    Nome varchar(20)
);

CREATE TABLE Tipo_Atividade (
    ID_TipoAtividade serial PRIMARY KEY,
    Nome varchar(20)    
);

CREATE TABLE Atividade (
    ID_Atividade serial PRIMARY KEY,
    Nome varchar(20),
    ID_Modelo int,
    ID_TipoAtividade int,
    FOREIGN KEY(ID_Modelo) REFERENCES Modelo (ID_Modelo),
    FOREIGN KEY(ID_TipoAtividade) REFERENCES Tipo_Atividade (ID_TipoAtividade)
);

CREATE TABLE Categoria_Recurso (
    ID_Categoria serial PRIMARY KEY,
    Descricao varchar(20)
);

CREATE TABLE Atividade_Recurso (
    PRIMARY KEY(ID_Categoria,ID_Atividade),
    ID_Categoria int,
    ID_Atividade int,
    FOREIGN KEY(ID_Categoria) REFERENCES Categoria_Recurso (ID_Categoria),
    FOREIGN KEY(ID_Atividade) REFERENCES Atividade (ID_Atividade)
);

CREATE TABLE Processo (
    ID_Processo serial PRIMARY KEY,
    Nome varchar(20),
    ID_Modelo int,
    FOREIGN KEY(ID_Modelo) REFERENCES Modelo (ID_Modelo)
);

CREATE TABLE AtvProcesso (
    ID_AtvProcesso serial PRIMARY KEY,
    Terminado varchar(20),
    DataInicio Timestamp,
    DataFim Timestamp,
    ID_Atividade int,
    ID_Processo int,
    FOREIGN KEY(ID_Atividade) REFERENCES Atividade (ID_Atividade),
    FOREIGN KEY(ID_Processo) REFERENCES Processo (ID_Processo)
);

CREATE TABLE Tipo_Recurso (
    ID_TipoRecurso serial PRIMARY KEY,
    Nome varchar(20)
);

CREATE TABLE Recurso (
    ID_Recurso serial PRIMARY KEY,
    Nome varchar(20),
    ID_TipoRecurso int,
    ID_Categoria int,
    FOREIGN KEY(ID_TipoRecurso) REFERENCES Tipo_Recurso (ID_TipoRecurso),
    FOREIGN KEY(ID_Categoria) REFERENCES Categoria_Recurso (ID_Categoria)
);

CREATE TABLE AtvProcesso_Recurso (
    PRIMARY KEY(ID_Recurso,ID_AtvProcesso),
    ID_Recurso int,
    ID_AtvProcesso int,
    FOREIGN KEY(ID_Recurso) REFERENCES Recurso (ID_Recurso),
    FOREIGN KEY(ID_AtvProcesso) REFERENCES AtvProcesso (ID_AtvProcesso)
);