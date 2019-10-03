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
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS "public"."customer";
CREATE TABLE "public"."customer" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar(100) COLLATE "pg_catalog"."default",
  "category" varchar(100) COLLATE "pg_catalog"."default",
  "description" varchar(100) COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."customer" OWNER TO "postgres";

-- ----------------------------
-- Table structure for customerlocation
-- ----------------------------
DROP TABLE IF EXISTS "public"."customerlocation";
CREATE TABLE "public"."customerlocation" (
  "id" int4 NOT NULL,
  "locationId" int4 NOT NULL
)
;
ALTER TABLE "public"."customerlocation" OWNER TO "postgres";

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS "public"."employee";
CREATE TABLE "public"."employee" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar(100) COLLATE "pg_catalog"."default",
  "lastname" varchar(100) COLLATE "pg_catalog"."default",
  "type" varchar(100) COLLATE "pg_catalog"."default",
  "birthyear" int4,
  "languages" varchar COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."employee" OWNER TO "postgres";

-- ----------------------------
-- Table structure for employeeoffice
-- ----------------------------
DROP TABLE IF EXISTS "public"."employeeoffice";
CREATE TABLE "public"."employeeoffice" (
  "id" SERIAL PRIMARY KEY,
  "officeId" int4
)
;
ALTER TABLE "public"."employeeoffice" OWNER TO "postgres";

-- ----------------------------
-- Table structure for employeetech
-- ----------------------------
DROP TABLE IF EXISTS "public"."employeetech";
CREATE TABLE "public"."employeetech" (
  "employeeId" int4,
  "tech" varchar COLLATE "pg_catalog"."default",
  "technologyId" int4
)
;
ALTER TABLE "public"."employeetech" OWNER TO "postgres";

-- ----------------------------
-- Table structure for employeetime
-- ----------------------------
DROP TABLE IF EXISTS "public"."employeetime";
CREATE TABLE "public"."employeetime" (
  "employeeId" int4 NOT NULL,
  "year_in" varchar COLLATE "pg_catalog"."default" NOT NULL,
  "year_out" varchar COLLATE "pg_catalog"."default" NOT NULL
)
;
ALTER TABLE "public"."employeetime" OWNER TO "postgres";

-- ----------------------------
-- Table structure for location
-- ----------------------------
DROP TABLE IF EXISTS "public"."location";
CREATE TABLE "public"."location" (
  "id" SERIAL PRIMARY KEY,
  "location" varchar(255) COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."location" OWNER TO "postgres";

-- ----------------------------
-- Table structure for office
-- ----------------------------
DROP TABLE IF EXISTS "public"."office";
CREATE TABLE "public"."office" (
  "id" SERIAL PRIMARY KEY,
  "office" varchar(255) COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."office" OWNER TO "postgres";

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS "public"."project";
CREATE TABLE "public"."project" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar COLLATE "pg_catalog"."default",
  "project_type" varchar COLLATE "pg_catalog"."default",
  "start_dates" varchar COLLATE "pg_catalog"."default",
  "end_dates" varchar COLLATE "pg_catalog"."default",
  "description" varchar COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."project" OWNER TO "postgres";

-- ----------------------------
-- Table structure for projectcustomer
-- ----------------------------
DROP TABLE IF EXISTS "public"."projectcustomer";
CREATE TABLE "public"."projectcustomer" (
  "id" SERIAL PRIMARY KEY,
  "customerId" int4,
  "customer" varchar COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."projectcustomer" OWNER TO "postgres";

-- ----------------------------
-- Table structure for projectechnology
-- ----------------------------
DROP TABLE IF EXISTS "public"."projectechnology";
CREATE TABLE "public"."projectechnology" (
  "projectId" int4 NOT NULL,
  "technologyId" int4 NOT NULL
)
;
ALTER TABLE "public"."projectechnology" OWNER TO "postgres";

-- ----------------------------
-- Table structure for projectemployee
-- ----------------------------
DROP TABLE IF EXISTS "public"."projectemployee";
CREATE TABLE "public"."projectemployee" (
  "projectId" int4 NOT NULL,
  "employeeId" int4 NOT NULL
)
;
ALTER TABLE "public"."projectemployee" OWNER TO "postgres";

-- ----------------------------
-- Table structure for projecttime
-- ----------------------------
DROP TABLE IF EXISTS "public"."projecttime";
CREATE TABLE "public"."projecttime" (
  "id" int4 not null,
  "start_dates" varchar COLLATE "pg_catalog"."default",
  "end_dates" varchar COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."projecttime" OWNER TO "postgres";

-- ----------------------------
-- Table structure for technology
-- ----------------------------
DROP TABLE IF EXISTS "public"."technology";
CREATE TABLE "public"."technology" (
  "id" SERIAL PRIMARY KEY,
  "technology" varchar COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."technology" OWNER TO "postgres";

/*
-- ----------------------------
-- Primary Key structure for table customer
-- ----------------------------
ALTER TABLE "public"."customer" ADD CONSTRAINT "customer_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table customerlocation
-- ----------------------------
ALTER TABLE "public"."customerlocation" ADD CONSTRAINT "customerlocation_pkey" PRIMARY KEY ("id", "locationId");

-- ----------------------------
-- Primary Key structure for table employee
-- ----------------------------
ALTER TABLE "public"."employee" ADD CONSTRAINT "employee_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table employeeoffice
-- ----------------------------
ALTER TABLE "public"."employeeoffice" ADD CONSTRAINT "employeeoffice_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table employeetime
-- ----------------------------
ALTER TABLE "public"."employeetime" ADD CONSTRAINT "employeetime_pkey" PRIMARY KEY ("year_in", "employeeId", "year_out");

-- ----------------------------
-- Primary Key structure for table location
-- ----------------------------
ALTER TABLE "public"."location" ADD CONSTRAINT "location_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table office
-- ----------------------------
ALTER TABLE "public"."office" ADD CONSTRAINT "office_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table project
-- ----------------------------
ALTER TABLE "public"."project" ADD CONSTRAINT "projects_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table projectechnology
-- ----------------------------
ALTER TABLE "public"."projectechnology" ADD CONSTRAINT "projectechnology_pkey" PRIMARY KEY ("projectId", "technologyId");

-- ----------------------------
-- Primary Key structure for table projectemployee
-- ----------------------------
ALTER TABLE "public"."projectemployee" ADD CONSTRAINT "projectemployee_pkey" PRIMARY KEY ("projectId", "employeeId");

-- ----------------------------
-- Primary Key structure for table technology
-- ----------------------------
ALTER TABLE "public"."technology" ADD CONSTRAINT "technology_pkey" PRIMARY KEY ("id");*/
