-- ----------------------------
-- Table structure for categorytechnology
-- ----------------------------
BEGIN;
DROP TABLE IF EXISTS "categorytechnology";
CREATE TABLE "categorytechnology" (
	"id" serial NOT NULL,
	"category" varchar NULL,
	CONSTRAINT categorytechnology_pk PRIMARY KEY (id)
);
COMMIT;

-- ----------------------------
-- Records of categorytechnology
-- ----------------------------
BEGIN;
INSERT INTO "categorytechnology" (id, category) VALUES (1, 'Other'); --1
INSERT INTO "categorytechnology" (id, category) VALUES (2, 'Database'); --2
INSERT INTO "categorytechnology" (id, category) VALUES (3, 'Graphical'); --3
INSERT INTO "categorytechnology" (id, category) VALUES (4, 'Tools'); --4
INSERT INTO "categorytechnology" (id, category) VALUES (5, 'Programming/Skills'); --5
INSERT INTO "categorytechnology" (id, category) VALUES (6, 'Framework'); --6
INSERT INTO "categorytechnology" (id, category) VALUES (7, 'Methodology'); --7
INSERT INTO "categorytechnology" (id, category) VALUES (8, 'Web'); --8
INSERT INTO "categorytechnology" (id, category) VALUES (9, 'Productivity'); --9
INSERT INTO "categorytechnology" (id, category) VALUES (10, 'Environment'); --10
COMMIT;