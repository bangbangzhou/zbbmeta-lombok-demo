create table user
(
    id     bigint      null comment '主键',
    name   varchar(20) null,
    age    int         null,
    s_name varchar(20) null
);
-- 插入数据
INSERT INTO backend_db.user (id, name, age, s_name) VALUES (1740047068249387009, 'zbbmeta', 18, 'test1');
INSERT INTO backend_db.user (id, name, age, s_name) VALUES (1740047068350050306, 'springboot葵花宝典', 20, 'test2');
INSERT INTO backend_db.user (id, name, age, s_name) VALUES (1740047068350050307, 'springboot葵花宝典2', 22, null);