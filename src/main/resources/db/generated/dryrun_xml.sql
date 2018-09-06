--  *********************************************************************
--  Update Database Script
--  *********************************************************************
--  Change Log: src/main/resources/db/generated/changelog_diff.xml
--  Ran at: 4/09/18 13:02
--  Against: root@172.21.0.1@jdbc:mysql://172.21.0.3:3306/entity_db?useSSL=false
--  Liquibase version: 3.4.1
--  *********************************************************************

--  Create Database Lock Table
CREATE TABLE DATABASECHANGELOGLOCK (ID INT NOT NULL, LOCKED BIT(1) NOT NULL, LOCKGRANTED datetime NULL, LOCKEDBY VARCHAR(255) NULL, CONSTRAINT PK_DATABASECHANGELOGLOCK PRIMARY KEY (ID));

--  Initialize Database Lock Table
DELETE FROM DATABASECHANGELOGLOCK;

INSERT INTO DATABASECHANGELOGLOCK (ID, LOCKED) VALUES (1, 0);

--  Lock Database
UPDATE DATABASECHANGELOGLOCK SET LOCKED = 1, LOCKEDBY = 'fe80:0:0:0:1cef:62ff:fea9:88fb%veth2ffda45 (fe80:0:0:0:1cef:62ff:fea9:88fb%veth2ffda45)', LOCKGRANTED = '2018-09-04 13:02:48.868' WHERE ID = 1 AND LOCKED = 0;

--  Create Database Change Log Table
CREATE TABLE DATABASECHANGELOG (ID VARCHAR(255) NOT NULL, AUTHOR VARCHAR(255) NOT NULL, FILENAME VARCHAR(255) NOT NULL, DATEEXECUTED datetime NOT NULL, ORDEREXECUTED INT NOT NULL, EXECTYPE VARCHAR(10) NOT NULL, MD5SUM VARCHAR(35) NULL, DESCRIPTION VARCHAR(255) NULL, COMMENTS VARCHAR(255) NULL, TAG VARCHAR(255) NULL, LIQUIBASE VARCHAR(20) NULL, CONTEXTS VARCHAR(255) NULL, LABELS VARCHAR(255) NULL);

--  Changeset src/main/resources/db/generated/changelog_diff.xml::1536058967905-1::atostado (generated)
CREATE TABLE cabessas (id BIGINT AUTO_INCREMENT NOT NULL, email VARCHAR(255) NULL, name VARCHAR(255) NULL, CONSTRAINT cabessasPK PRIMARY KEY (id));

INSERT INTO DATABASECHANGELOG (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, DESCRIPTION, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE) VALUES ('1536058967905-1', 'atostado (generated)', 'src/main/resources/db/generated/changelog_diff.xml', NOW(), 1, '7:4e5b92bb274ff1c91d458d62c1c2c739', 'createTable', '', 'EXECUTED', NULL, NULL, '3.4.1');

--  Changeset src/main/resources/db/generated/changelog_diff.xml::1536058967905-2::atostado (generated)
CREATE TABLE clientes (id BIGINT AUTO_INCREMENT NOT NULL, email VARCHAR(255) NULL, name VARCHAR(255) NULL, CONSTRAINT clientesPK PRIMARY KEY (id));

INSERT INTO DATABASECHANGELOG (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, MD5SUM, DESCRIPTION, COMMENTS, EXECTYPE, CONTEXTS, LABELS, LIQUIBASE) VALUES ('1536058967905-2', 'atostado (generated)', 'src/main/resources/db/generated/changelog_diff.xml', NOW(), 2, '7:6972364078acce28dc0f52c2828dfcef', 'createTable', '', 'EXECUTED', NULL, NULL, '3.4.1');

--  Release Database Lock
UPDATE DATABASECHANGELOGLOCK SET LOCKED = 0, LOCKEDBY = NULL, LOCKGRANTED = NULL WHERE ID = 1;

