--create table <nome da tabela> ( coluna tipo(tamanho) [Regras - Constrains], colunatipo(tamanho) [Regras - Constrains], 
--coluna tipo(tamanho) [Regras - Constrains])

create table BANCO_UM (codigo number(3) primary key,
                    nome varchar(30) not null unique,
                    dt_adm date not null,
                    salario number(8,2),
                    uf varchar(2));
                        
                        
-- Um para muitos 
-- Tipo de Produto
-- ID Produto -- Number -- 2 -- PK
-- Numero tipo -- Varchar -- 30 -- Not null

-- Para consultar se uma tabela existe
desc TIPO_PRODUTO

create table TIPO_PRODUTO
(ID_PRODUTO number(2) constraint tipo_id_pk primary key, -- Constraint para eu definir a regra e não deixar para o Sistema.
NUMERO_TIPO varchar(30) not null);

-- Muitos para Um. Não tem muitos para muitos.
-- PRODUTO
-- ID_PRODUTO -- Number -- 3 -- PK
-- DESC_PRODUTO -- Varchar -- 30 -- NN

desc PRODUTO

create table PRODUTO
(ID_PRODUTO number(3) primary key,
DESC_PRODUTO varchar(30) not null unique,
FK_TIPO references TIPO_PRODUTO); -- Reference mostra o relacionamento e temos que informar a tabela.
-- Só preciso informar a coluna se eu tiver duas colunas que montem a chave primaria.


-- desc user_constraints: Para saber as chaves primárias e os nomes dessas chaves.

select constraint_name, constraint_type, table_name from user_constraints
where table_name in ('TIPO_PRODUTO', 'PRODUTO'); -- PARA OS DADOS, ELE SEGUE A REGRA DO CASE SENSITIVE, OU SEJA, SE EU
-- ESCREVER ERRADO, NÃO VAI LOCALIZAR.








