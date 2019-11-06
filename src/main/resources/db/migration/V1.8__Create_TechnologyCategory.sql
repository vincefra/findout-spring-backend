BEGIN;
CREATE TABLE "technologycategory" (
	id serial NOT NULL,
	technologyid int4 NULL REFERENCES technology(id),
	categoryid int4 NULL REFERENCES categorytechnology(id),
	CONSTRAINT technologycategory_pk PRIMARY KEY (id)
);
COMMIT;
-- ----------------------------
-- Records of technology
-- ----------------------------
