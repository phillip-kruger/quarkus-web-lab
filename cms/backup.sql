-- H2 2.2.224; 
SET DB_CLOSE_DELAY -1;         
;              
CREATE USER IF NOT EXISTS "QUARKUS" SALT '6bf179a52ee11ec1' HASH '966f9ab90b8f98d63cd9dae19d79b843ca24c02fb1aa102962ce792908e2d1d4' ADMIN;     
CREATE SEQUENCE "PUBLIC"."ENTRY_SEQ" START WITH 1 RESTART WITH 51 INCREMENT BY 50;             
CREATE MEMORY TABLE "PUBLIC"."ENTRY"(
    "CREATED" TIMESTAMP(6),
    "ID" BIGINT NOT NULL,
    "UPDATED" TIMESTAMP(6),
    "CONTENT" CHARACTER VARYING,
    "TITLE" CHARACTER VARYING(255)
); 
ALTER TABLE "PUBLIC"."ENTRY" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_3" PRIMARY KEY("ID");         
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.ENTRY;    
