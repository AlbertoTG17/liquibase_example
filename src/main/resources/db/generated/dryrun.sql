--  *********************************************************************
--  Update Database Script
--  *********************************************************************
--  Change Log: src/main/resources/db/generated/changelog_diff.yml
--  Ran at: 4/09/18 16:02
--  Against: root@172.21.0.1@jdbc:mysql://172.21.0.3:3306/entity_db?useSSL=false
--  Liquibase version: 3.4.1
--  *********************************************************************

--  Create Database Lock Table
CREATE TABLE DATABASECHANGELOGLOCK (ID INT NOT NULL, LOCKED BIT(1) NOT NULL, LOCKGRANTED datetime NULL, LOCKEDBY VARCHAR(255) NULL, CONSTRAINT PK_DATABASECHANGELOGLOCK PRIMARY KEY (ID));

--  Initialize Database Lock Table
DELETE FROM DATABASECHANGELOGLOCK;

INSERT INTO DATABASECHANGELOGLOCK (ID, LOCKED) VALUES (1, 0);

--  Lock Database
UPDATE DATABASECHANGELOGLOCK SET LOCKED = 1, LOCKEDBY = 'fe80:0:0:0:1cef:62ff:fea9:88fb%veth2ffda45 (fe80:0:0:0:1cef:62ff:fea9:88fb%veth2ffda45)', LOCKGRANTED = '2018-09-04 16:02:39.352' WHERE ID = 1 AND LOCKED = 0;

--  Create Database Change Log Table
CREATE TABLE DATABASECHANGELOG (ID VARCHAR(255) NOT NULL, AUTHOR VARCHAR(255) NOT NULL, FILENAME VARCHAR(255) NOT NULL, DATEEXECUTED datetime NOT NULL, ORDEREXECUTED INT NOT NULL, EXECTYPE VARCHAR(10) NOT NULL, MD5SUM VARCHAR(35) NULL, DESCRIPTION VARCHAR(255) NULL, COMMENTS VARCHAR(255) NULL, TAG VARCHAR(255) NULL, LIQUIBASE VARCHAR(20) NULL, CONTEXTS VARCHAR(255) NULL, LABELS VARCHAR(255) NULL);

--  Changeset src/main/resources/db/generated/changelog_diff.yml::1536069758387-1::atostado (generated)
CREATE TABLE cabessas (id BIGINT AUTO_INCREMENT NULL, email VARCHAR(255) NULL, name VARCHAR(255) NULL);

INSERT INTO DATABASECHANGELOG (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, DESCRIPTION, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE) VALUES ('1536069758387-1', 'atostado (generated)', 'src/main/resources/db/generated/changelog_diff.yml', NOW(), 1, '7:a49f2f7173d4932f079add6a36420556', 'createTable', '', 'EXECUTED', NULL, NULL, '3.4.1');

--  Changeset src/main/resources/db/generated/changelog_diff.yml::1536069758387-2::atostado (generated)
CREATE TABLE clientes (id BIGINT AUTO_INCREMENT NULL, email VARCHAR(255) NULL, name VARCHAR(255) NULL);

INSERT INTO DATABASECHANGELOG (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, DESCRIPTION, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE) VALUES ('1536069758387-2', 'atostado (generated)', 'src/main/resources/db/generated/changelog_diff.yml', NOW(), 2, '7:2c1f0465248936692cf89b2ffa1ccb83', 'createTable', '', 'EXECUTED', NULL, NULL, '3.4.1');

--  Release Database Lock
UPDATE DATABASECHANGELOGLOCK SET LOCKED = 0, LOCKEDBY = NULL, LOCKGRANTED = NULL WHERE ID = 1;

