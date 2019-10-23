/*
 Navicat PostgreSQL Data Transfer

 Source Server         : localhost
 Source Server Type    : PostgreSQL
 Source Server Version : 100010
 Source Host           : localhost:5432
 Source Catalog        : findout-migrate
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 100010
 File Encoding         : 65001

 Date: 24/09/2019 11:43:51
*/


-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS "employee";
CREATE TABLE "employee" (
 "id" SERIAL PRIMARY KEY,
 "name" varchar(100) COLLATE "pg_catalog"."default",
 "lastname" varchar(100) COLLATE "pg_catalog"."default",
 "birthyear" int4,
 "description" varchar(1000) COLLATE "pg_catalog"."default",
 "visible" int4 --if the employee wants to be visible (1) or not (0)
)
;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS "customer";
CREATE TABLE "customer" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar(100) COLLATE "pg_catalog"."default",
  "description" varchar(100) COLLATE "pg_catalog"."default",
  "visible" int4 NOT NULL
)
;

-- ----------------------------
-- Table structure for location
-- ----------------------------
DROP TABLE IF EXISTS "location";
CREATE TABLE "location" (
  "id" SERIAL PRIMARY KEY,
  "location" varchar(255) COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "location" OWNER TO "postgres";

-- ----------------------------
-- Table structure for customerlocation
-- ----------------------------
DROP TABLE IF EXISTS "customerlocation";
CREATE TABLE "customerlocation" (
  "customerid" int4 REFERENCES customer(id),
  "locationid" int4 REFERENCES location(id)
)
;
ALTER TABLE "customerlocation" OWNER TO "postgres";

-- ----------------------------
-- Table structure for office
-- ----------------------------
DROP TABLE IF EXISTS "office";
CREATE TABLE "office" (
  "id" SERIAL PRIMARY KEY,
  "office" varchar(255) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Table structure for employeeoffice
-- ----------------------------
DROP TABLE IF EXISTS "employeeoffice";
CREATE TABLE "employeeoffice" (
 "employeeid" int4 REFERENCES employee(id) , 
 "officeid" int4 REFERENCES office(id)
)
;

-- ----------------------------
-- Table structure for technology
-- ----------------------------
DROP TABLE IF EXISTS "technology";
CREATE TABLE "technology" (
  "id" SERIAL PRIMARY KEY,
  "technology" varchar COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Table structure for employeetech
-- ----------------------------
DROP TABLE IF EXISTS "employeetechnology";
CREATE TABLE "employeetechnology" (
  "id" SERIAL PRIMARY KEY,
  "employeeid" int4,
  "technologyid" int4
)
;

-- ----------------------------
-- Table structure for employeetime
-- ----------------------------
DROP TABLE IF EXISTS "employeetime";
CREATE TABLE "employeetime" (
 "id" SERIAL PRIMARY KEY,
 "employeeid" int4 REFERENCES employee(id),
 "yearin" int4 NOT NULL,
 "yearout" int4 NOT NULL
)
;

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS "project";
CREATE TABLE "project" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar COLLATE "pg_catalog"."default",
  "type" varchar COLLATE "pg_catalog"."default",
  "description" varchar COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Table structure for projectcustomer
-- ----------------------------
DROP TABLE IF EXISTS "projectcustomer";
CREATE TABLE "projectcustomer" (
  "projectid" int4 REFERENCES project(id),
  "customerid" int4
)
;

-- ----------------------------
-- Table structure for projecttechnology
-- ----------------------------
DROP TABLE IF EXISTS "projecttechnology";
CREATE TABLE "projecttechnology" (
  "id" SERIAL PRIMARY KEY,
  "projectid" int4,
  "technologyid" int4
)
;

-- ----------------------------
-- Table structure for projectemployee
-- ----------------------------
DROP TABLE IF EXISTS "projectemployee";
CREATE TABLE "projectemployee" (
  "projectid" int4 REFERENCES project(id),
  "employeeid" int4 REFERENCES employee(id)
)
;

-- ----------------------------
-- Table structure for projecttime
-- ----------------------------
DROP TABLE IF EXISTS "projecttime";
CREATE TABLE "projecttime" (
  "id" SERIAL PRIMARY KEY,
  "projectid" int4 REFERENCES project(id),
  "startdate" varchar COLLATE "pg_catalog"."default",
  "enddate" varchar COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS "role";
CREATE TABLE "role" (
  "id" SERIAL PRIMARY KEY,
  "role" varchar COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Table structure for employeerole
-- ----------------------------
DROP TABLE IF EXISTS "employeerole";
CREATE TABLE "employeerole" (
 "employeeid" int4 REFERENCES employee(id),
 "roleid" int4 REFERENCES role(id)
)
;

-- ----------------------------
-- Table structure for Category
-- ----------------------------
DROP TABLE IF EXISTS "category";
CREATE TABLE "category" (
 "id" SERIAL PRIMARY KEY,
 "category" varchar COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Table structure for CustomerCategory
-- ----------------------------
DROP TABLE IF EXISTS "customercategory";
CREATE TABLE "customercategory" (
 "customerid" int4 REFERENCES customer(id),
 "categoryid" int4 REFERENCES category(id)
)
;

/*ALTER TABLE "customercategory" OWNER TO "postgres"; 
/*
-- ----------------------------
-- Primary Key structure for table customer
-- ----------------------------
ALTER TABLE "customer" ADD CONSTRAINT "customer_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table customerlocation
-- ----------------------------
ALTER TABLE "customerlocation" ADD CONSTRAINT "customerlocation_pkey" PRIMARY KEY ("id", "locationId");

-- ----------------------------
-- Primary Key structure for table employee
-- ----------------------------
ALTER TABLE "employee" ADD CONSTRAINT "employee_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table employeeoffice
-- ----------------------------
ALTER TABLE "employeeoffice" ADD CONSTRAINT "employeeoffice_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table employeetime
-- ----------------------------
ALTER TABLE "employeetime" ADD CONSTRAINT "employeetime_pkey" PRIMARY KEY ("year_in", "employeeId", "year_out");

-- ----------------------------
-- Primary Key structure for table location
-- ----------------------------
ALTER TABLE "location" ADD CONSTRAINT "location_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table office
-- ----------------------------
ALTER TABLE "office" ADD CONSTRAINT "office_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table project
-- ----------------------------
ALTER TABLE "project" ADD CONSTRAINT "projects_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table projectechnology
-- ----------------------------
ALTER TABLE "projectechnology" ADD CONSTRAINT "projectechnology_pkey" PRIMARY KEY ("projectId", "technologyId");

-- ----------------------------
-- Primary Key structure for table projectemployee
-- ----------------------------
ALTER TABLE "projectemployee" ADD CONSTRAINT "projectemployee_pkey" PRIMARY KEY ("projectId", "employeeId");

-- ----------------------------
-- Primary Key structure for table technology
-- ----------------------------
ALTER TABLE "technology" ADD CONSTRAINT "technology_pkey" PRIMARY KEY ("id");*/
