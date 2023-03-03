
create table member2(
	idx		number		primary key,
	name	varchar2(15)	not null,
	phone	varchar2(15)
);

create sequence mp_idx increment by 1 start with 1 nocycle nocache;

insert into member2 values (mp_idx.nextval, '강호동', '010-123-4567');
insert into member2 values (mp_idx.nextval, '홍길동', '011-789-4561');

select * from member2