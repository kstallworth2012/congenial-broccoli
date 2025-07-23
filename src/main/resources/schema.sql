
DROP TABLE IF EXISTS "jobs";



CREATE TABLE "jobs"(
job_id not null varchar2(10),
job_title not null varchar2(35),
min_salary number(6),
max_salary number(6)
);