
DROP TABLE IF EXISTS "jobs";



CREATE TABLE "jobs"(
job_id  varchar(10) PRIMARY KEY,
job_title  varchar(35) NOT NULL,
min_salary number(6),
max_salary number(6)
);