-- ----------------------------
-- Table structure for categorytechnology
-- ----------------------------
BEGIN;
DROP TABLE IF EXISTS "categorytechnology";
CREATE TABLE "categorytechnology" (
	"id" serial NOT NULL,
	"category" varchar NULL
);
COMMIT;

-- ----------------------------
-- Records of categorytechnology
-- ----------------------------
BEGIN;
INSERT INTO "categorytechnology" (category) VALUES ('Other');
INSERT INTO "categorytechnology" (category) VALUES ('Backend');
INSERT INTO "categorytechnology" (category) VALUES ('Frontend');
COMMIT;