#criar o database chamado db_ferramentas
create database if not exists db_ferramentas;

#entrar no database db_ferramentas
use db_ferramentas;

#remove a tabela para recriá-la
drop table if exists tb_ferramentas;

#  a tabela de tb_ferramentas
CREATE TABLE tb_ferramentas ( 
    id      INTEGER NOT NULL, 
    nome    VARCHAR(100), 
    marca   VARCHAR(50),
    custo   INTEGER,
    PRIMARY KEY(id)
);

#remove a tabela para recriá-la
drop table if exists tb_amigos;

#cria a tabela de tb_amigos
CREATE TABLE tb_amigos {
    nome VARCHAR(100),
    telefone INTEGER
    PRIMARY KEY(nome)
}

#remove a tabela para recriá-la
drop table if exists tb_emprestimos;

#cria a tabela de tb_emprestimos
CREATE TABLE tb_emprestimos {
    #TODO
}

#lista a tabela criada
show tables;