/** */
-- Database: {{DBNAME}}

DROP DATABASE IF EXISTS "{{DBNAME}}";

CREATE DATABASE "{{DBNAME}}"
    WITH
    OWNER = {{USERNAME}}
    ENCODING = 'UTF8'
    LC_COLLATE = 'pt_BR.UTF-8'
    LC_CTYPE = 'pt_BR.UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

COMMENT ON DATABASE "{{DBNAME}}"
    IS 'Bando de dados padrão para qualquer desafio ténico {{TITULO_DESAFIO}} do processo seletivo da emprea {{NOME_EMPRESA}}!';

