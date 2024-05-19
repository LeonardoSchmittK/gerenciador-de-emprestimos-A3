# criar as 3 tabelas do projeto

# criar tabela tb_ferramenta
CREATE TABLE IF NOT EXISTS tb_ferramenta (
    id INT PRIMARY KEY,
    nome VARCHAR(255),
    marca VARCHAR(255),
    custo DOUBLE
);

# criar tabela tb_amigo
CREATE TABLE IF NOT EXISTS tb_ferramenta (
    id INT PRIMARY KEY,
    nome VARCHAR(255),
    telefone VARCHAR(255)
);

# criar tabela tb_emprestimo
CREATE TABLE IF NOT EXISTS tb_ferramenta (
    id INT PRIMARY KEY,
    amigoId INT,
    ferramentaId INT
);


# imprimir os dados das 3 tabelas
SELECT * FROM tb_ferramenta;
SELECT * FROM tb_amigo;
SELECT * FROM tb_emprestimo;

# reordenar ids ao remover ferramenta, não obrigatório
SET @new_id = 0;
UPDATE tb_ferramenta
SET id = (@new_id := @new_id + 1)
ORDER BY id;

# deletar tabela tb_ferramenta
DROP TABLE tb_ferramenta;

# deletar tabela tb_amigo
DROP TABLE tb_amigo;

# deletar tabela tb_emprestimo
DROP TABLE tb_emprestimo;

# habilitar safe mode no workbench para deletes e updates
SET SQL_SAFE_UPDATES = 0;
