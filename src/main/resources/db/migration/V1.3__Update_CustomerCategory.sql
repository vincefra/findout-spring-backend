BEGIN;
DROP TABLE IF EXISTS "customercategory";
CREATE TABLE "customercategory" (
  "id" SERIAL PRIMARY KEY,
  "customerid" int4,
  "categoryid" int4
)
;
COMMIT;

-- ----------------------------
-- Records of customercategory
-- ----------------------------
BEGIN;
INSERT INTO "customercategory" VALUES (1, 1, 1);
INSERT INTO "customercategory" VALUES (2, 2, 2);
INSERT INTO "customercategory" VALUES (3, 3, 3);
INSERT INTO "customercategory" VALUES (4, 4, 4);
INSERT INTO "customercategory" VALUES (5, 5, 5);
INSERT INTO "customercategory" VALUES (6, 6, 3);
INSERT INTO "customercategory" VALUES (7, 7, 6);
INSERT INTO "customercategory" VALUES (8, 8, 1);
INSERT INTO "customercategory" VALUES (9, 9, 5);
INSERT INTO "customercategory" VALUES (10, 10, 7);
INSERT INTO "customercategory" VALUES (11, 11, 8);
INSERT INTO "customercategory" VALUES (12, 12, 7);
INSERT INTO "customercategory" VALUES (13, 13, 5);
INSERT INTO "customercategory" VALUES (14, 14, 9);
INSERT INTO "customercategory" VALUES (15, 15, 10);
INSERT INTO "customercategory" VALUES (16, 16, 7);
INSERT INTO "customercategory" VALUES (17, 17, 3);
INSERT INTO "customercategory" VALUES (18, 18, 2);
INSERT INTO "customercategory" VALUES (19, 19, 11);
INSERT INTO "customercategory" VALUES (20, 20, 7);
INSERT INTO "customercategory" VALUES (21, 21, 11);
INSERT INTO "customercategory" VALUES (22, 22, 12);
INSERT INTO "customercategory" VALUES (23, 23, 3);
INSERT INTO "customercategory" VALUES (24, 24, 3);
INSERT INTO "customercategory" VALUES (25, 25, 13);
INSERT INTO "customercategory" VALUES (26, 26, 4);
INSERT INTO "customercategory" VALUES (27, 27, 7);
INSERT INTO "customercategory" VALUES (28, 28, 4);
INSERT INTO "customercategory" VALUES (29, 29, 7);
INSERT INTO "customercategory" VALUES (30, 30, 4);
INSERT INTO "customercategory" VALUES (31, 31, 7);
INSERT INTO "customercategory" VALUES (32, 32, 11);
INSERT INTO "customercategory" VALUES (33, 33, 11);
INSERT INTO "customercategory" VALUES (34, 34, 15);
INSERT INTO "customercategory" VALUES (35, 35, 7);
INSERT INTO "customercategory" VALUES (36, 36, 4);
INSERT INTO "customercategory" VALUES (37, 37, 2);
INSERT INTO "customercategory" VALUES (38, 38, 4);
INSERT INTO "customercategory" VALUES (39, 39, 5);
INSERT INTO "customercategory" VALUES (40, 40, 2);
INSERT INTO "customercategory" VALUES (41, 41, 7);
INSERT INTO "customercategory" VALUES (42, 42, 2);
INSERT INTO "customercategory" VALUES (43, 43, 4);
INSERT INTO "customercategory" VALUES (44, 44, 7);
INSERT INTO "customercategory" VALUES (45, 45, 15);
INSERT INTO "customercategory" VALUES (46, 46, 16);
INSERT INTO "customercategory" VALUES (47, 47, 4);
INSERT INTO "customercategory" VALUES (48, 48, 5);
INSERT INTO "customercategory" VALUES (49, 49, 9);
INSERT INTO "customercategory" VALUES (50, 50, 9);
INSERT INTO "customercategory" VALUES (51, 51, 11);
INSERT INTO "customercategory" VALUES (52, 52, 11);
INSERT INTO "customercategory" VALUES (53, 53, 7);
INSERT INTO "customercategory" VALUES (54, 54, 7);
INSERT INTO "customercategory" VALUES (55, 55, 5);
INSERT INTO "customercategory" VALUES (56, 56, 16);
INSERT INTO "customercategory" VALUES (57, 57, 9);
INSERT INTO "customercategory" VALUES (58, 58, 4);
INSERT INTO "customercategory" VALUES (59, 59, 3);
INSERT INTO "customercategory" VALUES (60, 60, 5);
COMMIT;