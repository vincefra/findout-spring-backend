-- ----------------------------
-- Table structure for technology
-- ----------------------------
BEGIN;
ALTER TABLE "technology" ADD categoryid int NULL DEFAULT 1;
COMMIT;

-- ----------------------------
-- Records of technology
-- ----------------------------
BEGIN;
UPDATE technology SET categoryid=3 WHERE id=74;
UPDATE technology SET categoryid=3 WHERE id=75;
UPDATE technology SET categoryid=3 WHERE id=76;
UPDATE technology SET categoryid=3 WHERE id=77;
UPDATE technology SET categoryid=3 WHERE id=78;
UPDATE technology SET categoryid=3 WHERE id=694;
UPDATE technology SET categoryid=3 WHERE id=659;
UPDATE technology SET categoryid=3 WHERE id=693;
UPDATE technology SET categoryid=3 WHERE id=79;
UPDATE technology SET categoryid=3 WHERE id=270;
UPDATE technology SET categoryid=3 WHERE id=271;
UPDATE technology SET categoryid=3 WHERE id=269;
UPDATE technology SET categoryid=3 WHERE id=276;
UPDATE technology SET categoryid=3 WHERE id=3;
UPDATE technology SET categoryid=3 WHERE id=787;
UPDATE technology SET categoryid=3 WHERE id=272;
UPDATE technology SET categoryid=2 WHERE id=708;
UPDATE technology SET categoryid=2 WHERE id=709;
UPDATE technology SET categoryid=2 WHERE id=716;
UPDATE technology SET categoryid=2 WHERE id=114;
UPDATE technology SET categoryid=2 WHERE id=226;
UPDATE technology SET categoryid=2 WHERE id=499;
UPDATE technology SET categoryid=2 WHERE id=33;
UPDATE technology SET categoryid=2 WHERE id=890;
UPDATE technology SET categoryid=2 WHERE id=788;
UPDATE technology SET categoryid=2 WHERE id=794;
UPDATE technology SET categoryid=2 WHERE id=307;
UPDATE technology SET categoryid=2 WHERE id=308;
UPDATE technology SET categoryid=2 WHERE id=328;
UPDATE technology SET categoryid=2 WHERE id=329;
UPDATE technology SET categoryid=2 WHERE id=115;
UPDATE technology SET categoryid=2 WHERE id=119;
UPDATE technology SET categoryid=2 WHERE id=167;
UPDATE technology SET categoryid=2 WHERE id=168;
UPDATE technology SET categoryid=2 WHERE id=169;
UPDATE technology SET categoryid=2 WHERE id=224;
UPDATE technology SET categoryid=2 WHERE id=225;
UPDATE technology SET categoryid=2 WHERE id=227;
UPDATE technology SET categoryid=2 WHERE id=702;
COMMIT;