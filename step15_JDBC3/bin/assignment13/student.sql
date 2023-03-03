create table student2(
mid		number	primary key,
name	varchar2(15)	not null,
kor		number,
eng		number,
mat		number
)

select * from student2

select mid, name, kor, eng, mat, rank() over(order by (kor+eng+mat) desc) rank from student2


drop table student2

create sequence m_mid start with 1 increment by 1 nocycle nocache;
insert into student2 values (m_mid.nextval, '민들래',90, 88, 75);
insert into student2 values (m_mid.nextval, '진달래',65, 55, 43);
delete from student2 where name = '진달래';