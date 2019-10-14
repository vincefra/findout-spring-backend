-- ----------------------------
-- Table structure for projectcustomer
-- ----------------------------
BEGIN;
DROP TABLE IF EXISTS "projectcustomer";
CREATE TABLE "projectcustomer" (
  "id" SERIAL PRIMARY KEY,
  "projectid" int4,
  "customerid" int4
)
;
COMMIT;

-- ----------------------------
-- Records of projectcustomer
-- ----------------------------
BEGIN;
INSERT INTO "projectcustomer" VALUES (1, 1, 3);
INSERT INTO "projectcustomer" VALUES (2, 2, 1);
INSERT INTO "projectcustomer" VALUES (3, 3, 2);
INSERT INTO "projectcustomer" VALUES (4, 4, 3);
INSERT INTO "projectcustomer" VALUES (5, 5, 3);
INSERT INTO "projectcustomer" VALUES (6, 6, 4);
INSERT INTO "projectcustomer" VALUES (7, 7, 3);
INSERT INTO "projectcustomer" VALUES (8, 8, 5);
INSERT INTO "projectcustomer" VALUES (9, 9, 4);
INSERT INTO "projectcustomer" VALUES (10, 10, 6);
INSERT INTO "projectcustomer" VALUES (11, 11, 3);
INSERT INTO "projectcustomer" VALUES (12, 12, 7);
INSERT INTO "projectcustomer" VALUES (13, 13, 8);
INSERT INTO "projectcustomer" VALUES (14, 14, 3);
INSERT INTO "projectcustomer" VALUES (15, 15, 9);
INSERT INTO "projectcustomer" VALUES (17, 17, 10);
INSERT INTO "projectcustomer" VALUES (18, 18, 11);
INSERT INTO "projectcustomer" VALUES (19, 19, 3);
INSERT INTO "projectcustomer" VALUES (20, 20, 12);
INSERT INTO "projectcustomer" VALUES (21, 21, 8);
INSERT INTO "projectcustomer" VALUES (22, 22, 13);
INSERT INTO "projectcustomer" VALUES (23, 23, 14);
INSERT INTO "projectcustomer" VALUES (24, 24, 15);
INSERT INTO "projectcustomer" VALUES (25, 25, 16);
INSERT INTO "projectcustomer" VALUES (26, 26, 17);
INSERT INTO "projectcustomer" VALUES (27, 27, 18);
INSERT INTO "projectcustomer" VALUES (28, 28, 19);
INSERT INTO "projectcustomer" VALUES (29, 29, 20);
INSERT INTO "projectcustomer" VALUES (30, 30, 21);
INSERT INTO "projectcustomer" VALUES (31, 31, 22);
INSERT INTO "projectcustomer" VALUES (32, 32, 23);
INSERT INTO "projectcustomer" VALUES (33, 33, 24);
INSERT INTO "projectcustomer" VALUES (34, 34, 25);
INSERT INTO "projectcustomer" VALUES (35, 35, 3);
INSERT INTO "projectcustomer" VALUES (36, 36, 26);
INSERT INTO "projectcustomer" VALUES (37, 37, 27);
INSERT INTO "projectcustomer" VALUES (38, 38, 3);
INSERT INTO "projectcustomer" VALUES (39, 39, 10);
INSERT INTO "projectcustomer" VALUES (40, 40, 28);
INSERT INTO "projectcustomer" VALUES (41, 41, 29);
INSERT INTO "projectcustomer" VALUES (42, 42, 33);
INSERT INTO "projectcustomer" VALUES (45, 45, 30);
INSERT INTO "projectcustomer" VALUES (46, 46, 31);
INSERT INTO "projectcustomer" VALUES (47, 47, 4);
INSERT INTO "projectcustomer" VALUES (48, 48, 32);
INSERT INTO "projectcustomer" VALUES (49, 49, 33);
INSERT INTO "projectcustomer" VALUES (50, 50, 34);
INSERT INTO "projectcustomer" VALUES (51, 51, 35);
INSERT INTO "projectcustomer" VALUES (52, 52, 36);
INSERT INTO "projectcustomer" VALUES (53, 53, 37);
INSERT INTO "projectcustomer" VALUES (54, 54, 4);
INSERT INTO "projectcustomer" VALUES (55, 55, 4);
INSERT INTO "projectcustomer" VALUES (56, 56, 3);
INSERT INTO "projectcustomer" VALUES (57, 57, 38);
INSERT INTO "projectcustomer" VALUES (58, 58, 39);
INSERT INTO "projectcustomer" VALUES (60, 60, 3);
INSERT INTO "projectcustomer" VALUES (61, 61, 40);
INSERT INTO "projectcustomer" VALUES (62, 62, 41);
INSERT INTO "projectcustomer" VALUES (63, 63, 4);
INSERT INTO "projectcustomer" VALUES (65, 65, 42);
INSERT INTO "projectcustomer" VALUES (66, 66, 7);
INSERT INTO "projectcustomer" VALUES (67, 67, 3);
INSERT INTO "projectcustomer" VALUES (68, 68, 43);
INSERT INTO "projectcustomer" VALUES (69, 69, 4);
INSERT INTO "projectcustomer" VALUES (70, 70, 22);
INSERT INTO "projectcustomer" VALUES (71, 71, 3);
INSERT INTO "projectcustomer" VALUES (73, 73, 44);
INSERT INTO "projectcustomer" VALUES (74, 74, 24);
INSERT INTO "projectcustomer" VALUES (75, 75, 45);
INSERT INTO "projectcustomer" VALUES (76, 76, 46);
INSERT INTO "projectcustomer" VALUES (77, 77, 47);
INSERT INTO "projectcustomer" VALUES (78, 78, 4);
INSERT INTO "projectcustomer" VALUES (79, 79, 4);
INSERT INTO "projectcustomer" VALUES (80, 80, 48);
INSERT INTO "projectcustomer" VALUES (81, 81, 49);
INSERT INTO "projectcustomer" VALUES (82, 82, 50);
INSERT INTO "projectcustomer" VALUES (83, 83, 8);
INSERT INTO "projectcustomer" VALUES (84, 84, 51);
INSERT INTO "projectcustomer" VALUES (85, 85, 8);
INSERT INTO "projectcustomer" VALUES (86, 86, 8);
INSERT INTO "projectcustomer" VALUES (87, 87, 7);
INSERT INTO "projectcustomer" VALUES (88, 88, 7);
INSERT INTO "projectcustomer" VALUES (89, 89, 25);
INSERT INTO "projectcustomer" VALUES (90, 90, 3);
INSERT INTO "projectcustomer" VALUES (91, 91, 52);
INSERT INTO "projectcustomer" VALUES (92, 92, 3);
INSERT INTO "projectcustomer" VALUES (93, 93, 52);
INSERT INTO "projectcustomer" VALUES (94, 94, 9);
INSERT INTO "projectcustomer" VALUES (95, 95, 3);
INSERT INTO "projectcustomer" VALUES (96, 96, 8);
INSERT INTO "projectcustomer" VALUES (97, 97, 12);
INSERT INTO "projectcustomer" VALUES (98, 98, 12);
INSERT INTO "projectcustomer" VALUES (99, 99, 12);
INSERT INTO "projectcustomer" VALUES (100, 100, 12);
INSERT INTO "projectcustomer" VALUES (101, 101, 3);
INSERT INTO "projectcustomer" VALUES (102, 102, 3);
INSERT INTO "projectcustomer" VALUES (103, 103, 53);
INSERT INTO "projectcustomer" VALUES (104, 104, 54);
INSERT INTO "projectcustomer" VALUES (105, 105, 25);
INSERT INTO "projectcustomer" VALUES (106, 106, 25);
INSERT INTO "projectcustomer" VALUES (107, 107, 10);
INSERT INTO "projectcustomer" VALUES (108, 108, 55);
INSERT INTO "projectcustomer" VALUES (109, 109, 56);
INSERT INTO "projectcustomer" VALUES (110, 110, 2);
INSERT INTO "projectcustomer" VALUES (111, 111, 3);
INSERT INTO "projectcustomer" VALUES (112, 112, 57);
INSERT INTO "projectcustomer" VALUES (113, 113, 8);
INSERT INTO "projectcustomer" VALUES (114, 114, 52);
INSERT INTO "projectcustomer" VALUES (115, 115, 58);
INSERT INTO "projectcustomer" VALUES (116, 116, 58);
INSERT INTO "projectcustomer" VALUES (117, 117, 3);
INSERT INTO "projectcustomer" VALUES (118, 118, 59);
INSERT INTO "projectcustomer" VALUES (119, 119, 60);
INSERT INTO "projectcustomer" VALUES (120, 120, 48);
COMMIT;