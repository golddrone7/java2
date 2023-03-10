[테이블생성]
create table 테이블명(컬럼명1   컬럼타입  [제약조건],컬럼명2  컬럼타입  [제약조건],.....);

 -  문자로시작(30자이내) : 영문 대소문자,숫자,특수문자( _ , $ , # ),한글
 -  중복되는 이름은 사용안됨
 -  예약어(create, table, column등)은 사용할수 없다
 -  자료형
    number :  number(전체자리,소수이하), number  ==> 숫자형(가변형)
    int    :  정수형 숫자(고정형)
    float / double : 실수형 숫자(고정형)
    varchar/varchar2 :  문자,문자열(가변형) ==> 최대 4000byte
    char :                    문자,문자열(고정형) ==> 2000byte
    date :                    날짜형
    clob :                    문자열 ===> 최대4GB
    blob:                    바이너리형(그림,음악,동영상..)  ===> 최대4GB  

  - 제약조건
     not null :  해당컬럼에 NULL을 포함되지 않도록 함        (컬럼)
     unique  :  해당컬럼 또는 컬럼 조합값이 유일하도록 함   (컬럼,테이블)
     primary key : 각 행을 유일하게 식별할수 있도록함        (컬럼,테이블)
     references  table(column)                                               
             : 해당 컬럼이 참조하고 있는 (부모)테이블의 특정   (컬럼,테이블)
               컬럼값들과 일치하거나 또는 NULL이 되도록
               보장함
     check : 해당컬럼에 특정 조건을 항상 만족시키도록함    (컬럼, 테이블)
     [참고]  primary key = unique + not null

     ex)      idx                   일련번호            primary key   
               id                     아이디              unique 
               name                이름                 not null 
               phone               전화번호          
               address              주소      
               score                 점수                check
               subject_code        과목코드         
               hire_date             입학일            (기본값:오늘날짜)
               marriage             결혼                check  (기본값 : N)  
             ---------------------------------------------------------------------
    - 제약조건확인
      constraint_name:이름
      constraint_type:유형
                p:primary key 
                u:unique 
                r:reference 
                c:check, not null

      search_condition :  check조건 내용
      r_constraint_name : 참조테이블의 primary key 이름
      delete_rule : 참조테이블의 primary key 컬럼이 삭제될때 적용되는 규칙
                           (no action, set null, cascade등)


     - 삭제 RULE
       on delete cascade:대상 데이터를 삭제하고,해당 데이터를 참조하는 데이터도 삭제
       on delete set null:대상 데이터를 삭제하고,해당 데이터를 참조하는 데이터는 NULL로 바꿈
       on delete restricted:삭제대상 데이터를 참조하는 데이터가 존재하면 삭제할수 없음(기본값)

     - 수정 RULE
       on update cascade:대상 데이터를 수정하면,해당 데이터를 참조하는 데이터도 수정
---------------------------------------------------------------------------------
[테이블수정]
-구문-
alter  table 테이블명 
add    컬럼명  데이터타입 [제약조건]
add    constraint  제약조건명  제약조건타입(컬럼명)
modify 컬럼명 데이터타입 
drop   column  컬럼명 [cascade constraints]
drop   primary key [cascade] | union (컬럼명,.....) [cascade] .... | constraint 
제약조건명 [cascade]

-이름변경-
alter table  기존테이블명  rename to  새테이블명
rename  기존테이블명  to 새테이블명

alter table 테이블명 rename column  기존컬럼명 to 새컬럼명
alter table 테이블명 rename constraint 기존제약조건명 to 새제약조건명
---------------------------------------------------------------------------------
[테이블복사]
  - 서브쿼리를 이용한 테이블생성및 행(레코드)복사
  - 서브쿼리를 이용해서 복사한경우 not null을 제외한 제약조건은 복사안됨
    (not null제약조건도  sys_*****로 복사됨)

- 구문 - 
create table 테이블명([컬럼명1,컬럼명2.....]) as 서브쿼리  

- 구조만복사 - 
create table 테이블명1 
as  select  *  from 테이블명2  where 1=0
---------------------------------------------------------------------------------
[시퀀스]
 : 순차적으로 정수값을 자동으로 생성하는 객체

create  sequence  시퀀스명
[increment by 증가값] [start with 시작값]
[maxvalue  최대값 | minvalue  최소값]
[cycle | nocycle]
[cache | nocache]

  - increment  by  증가값 : 증가/감소 간격(기본값 : 1)
  - start with : 시작번호(기본값 : 1)
  - maxvalue / minvalue : 시퀀스의 최대/최소값지정
  - cycle/nocycle : 최대/최소값에 도달시 반복여부결정
  - cache / nocache : 지정한수량만큼 메모리 생성여부결정 (최소값 : 2, 기본값 : 20)

---------------------------------------------------------------------------------
[ insert ]
 : 테이블에 데이터(새로운행)추가 -- 행의 수가 변경

insert into 테이블명 [ (column1, column2, .....)]   values (value1,value2,.....)
 -  column과 values의 순서일치
 -  column과 values의  개수 일치

---------------------------------------------------------------------------------
[ update ]
 : 테이블에 포함된 기존 데이터수정 -- 행의 수가 변경되지 않음
   전체 데이터 건수(행수)는 달라지지 않음
   조건에 맞는 행(또는 열)의 컬럼값을 갱신할수 있다

update 테이블명  set  컬럼명1=value1, 컬럼명2=value2 ..... [where  조건절]
   - where 이 생략이 되면 전체행이 갱신
   - set절은 서브쿼리사용가능, default옵션 사용가능 
---------------------------------------------------------------------------------
[ delete ]
 : 테이블에 포함된 기존데이터를 삭제  -- 행의 수가 변경
   행 단위로 삭제되므로 전체행수가 달라짐
   
delete [from] 테이블명 [where  조건절];
 - where을 생략하면 전체행이 삭제됨
 - 데이터는 삭제되고 테이블 구조는 유지됨

---------------------------------------------------------------------------------
[ tracnsation처리 ]
  : 일의 시작과 끝이 완벽하게 마무리(commit)
    처리도중 인터럽트(interrupt:장애)가 발생하면 되돌아옴(rollback)
==================================================================================================
--계정을 바꾸시오 : edu/1234
select * from tab;

--ex1) 테이블 : test 
--id   number(5), name char(10),  address varchar2(50);
create table test(
id number(5),
name char(10),
address varchar2(50));

desc test;   --테이블의 구조확인

--ex2) 테이블명 : user1		열, 자료형, 제약조건
create table user1(
idx     number  primary key,	-- unique와 not null이 포함
id      varchar2(10) unique,	-- null값이 들어오면 안됨
name    varchar2(10) not null,	-- 
phone   varchar2(15),
address varchar2(50),
score   number(6,2)  check(score >=0 and score <= 100), -- check 제약 조건은 범위내 값만 가능
subject_code  number(5),
hire_date  date default sysdate,	-- 기본값 현재 시간
marriage   char(1)  default 'N'  check(marriage in('Y','N'))); -- 문자열이 1개, 기본값 'N', Y / N 가능


create table user1(
idx     number  primary key,	
id      varchar2(10) unique,	
name    varchar2(10) not null,	
phone   varchar2(15),
address varchar2(50),
score   number(6,2)  check(score >=0 and score <= 100), 
subject_code  number(5),
hire_date  date default sysdate,	
marriage   char(1)  default 'N'  check(marriage in('Y','N')));

select *
from user1

--ex3) 제약조건확인
--1	SYS_C004081 	C
--2	SYS_C004082	  C			-- check 제약조건이거나 not null
--3	SYS_C004083 	C
--4	SYS_C004084	  P			Primary
--5	SYS_C004085	  U			Unique

show tables;

select constraint_name, constraint_type
from user_constraints
where table_name='USER1';



--ex4) 테이블명 : user2
create table user2(
idx     number        constraint PKIDX primary key,
id      varchar2(10)  constraint UNID unique,
name    varchar2(10)  constraint NOTNAME not null,
phone   varchar2(15),
address varchar2(50),
score   number(6,2)   constraint CKSCORE check(score >=0 and score <= 100),
subject_code  number(5),
hire_date  date default sysdate,
marriage   char(1)  default 'N' constraint CKMARR check(marriage in('Y','N')));


--ex5) 제약조건확인

--1	NOTNAME       C
--2	CKSCORE	        C
--3	CKMARR	        C
--4	PKIDX	        P
--5	UNID	        U



select constraint_name, constraint_type
from user_constraints
where table_name = 'USER2';

select * 
from user_constraints

select * 
from all_tab_columns
where table_name = 'USER2'

--ex6) 추가

insert into user1(idx, id, name, phone, address, score, subject_code, hire_date, marriage)
values(1, 'aaa', 'kim', '010-000-0000', '서울', 75, 100, '2010-08-01', 'Y');


insert into user1(idx, id, name, phone, address, score, subject_code, hire_date, marriage)
values(1, 'aaa', 'kim', '010-000-0000', '서울', 75, 100, '2010-08-01', 'Y'); -- 유니크 제약조건 위배 idx:1 중복

insert into user1(idx, id, name, phone, address, score, subject_code, hire_date, marriage)
values(2, 'aaa', 'kim', '010-000-0000', '서울', 75, 100, '2010-08-01', 'Y'); -- 유니크 제약조건 위배 id:aaa 중복

insert into user1(idx, id, name, phone, address, score, subject_code, hire_date, marriage)
values(2, 'bbb',  '010-000-0000', '서울', 75, 100, '2010-08-01', 'Y'); -- 데이터의 개수가 컬럼의 개수와 일치하지 않음


insert into user1(idx, id, name, phone, address, score, subject_code, hire_date, marriage)
values(2, 'bbb', 'lee', '010-000-0000', '서울',75, 100, '2010-08-01', 'A'); -- 체크제약조건 위배 값의 범위

insert into user1(idx, id, name, phone, address, score, subject_code, hire_date, marriage)
values(2, 'bbb', 'lee', '010-000-0000', '서울',75, 100, '2010-08-01', 'N'); 


--ex7) 테이블목록확인
select * from tab;

--ex8) user1, user2 테이블의 내용을 각각 확인
select * from user1;
select * from user2;


--ex9) user1 테이블의 구조확인
desc user1;

--ex10) 제약조건확인(제약조건의 이름을 생성하지 않은경우-user1)

select constraint_name, constraint_type
from user_constraints
where table_name='USER1';




--ex11) 제약조건확인(제약조건의 이름을 생성한 경우-user2)
select constraint_name, constraint_type, search_condition
from user_constraints
where table_name='USER2';




===============================================================
[컬럼레벨 / 테이블레벨]
drop table exam1 -- 잘못만들었을 경우

--컬렘레벨 제약조건 지정
create table exam1(
	num		number		constraint PNUM primary key,
	id		varchar2(10)	constraint UNIID unique,
	name	varchar2(10)	constraint NONAME not null	
);	

--테이블레벨 제약조건 지정
--not null은 컬럼레벨에서 지정 가능
create table exam2(
	num		number,
	id		varchar2(10),
	name	varchar2(10)	constraint NONAME2 not null,
	constraint PNUM2 primary key(num),
	constraint UNID2 unique(id)
);	

--제약 조건 삭제
alter table exam2 drop constraints noname2 cascade; -- 참조하고 있는 애가 있다면 삭제(cascade)
alter table exam2 drop constraints pnum2 cascade; 
alter table exam2 drop constraints unid2 cascade; 



select constraint_name, constraint_type, search_condition
from user_constraints
where table_name='EXAM2'
-- 제약 조건의 이름은 중복하지 않도록 주의!!!






================================================================
--ex12) 테이블명 변경 : test ==> user3

alter table test 
rename to user3;

select * from tab

--ex13) 컬럼추가 :  user3  == > phone  varchar2(15)
alter table user3
add phone varchar2(15);

select * from user3
--ex14) 제약조건추가 : user3  ==>  id에  unique ,제약조건명 UID2
alter table user3 
add constraint UID2 unique(id);

select * 
from user_constraints

--ex15)  컬럼추가 : user3 ==> no  number  (PK설정)

alter table user3
add no number primary key;


--ex16) 구조변경 : user3 ==> name  char(10) 를 varchar2(10)로 바꿈
alter table user3
modify name char(5) -- 데이터가 없는경우 축소도 가능

alter table user3
modify name varchar2(10);




--ex17) 컬럼삭제 : user3 ==> address
alter table user3
drop column address;


--ex18) 테이블삭제 / 휴지통비우기: user3

drop table user3 -- 휴지통에 들어가 있는 상태
drop table user3 purge; -- 휴지통에 넣지 않고 곧바로 삭제
select * from tab

flashback table user3
to before drop; -- 휴지통에서 되살리기



--ex19) user1의 구조만 복사하여 user4로 생성할것  
-- 이때, idx-> bunho,  id->sid,  name-> irum, address-> juso로 변경

create table user4(bunho, sid, irum, juso)
as 
select idx, id, name, address from user1
where 1=0; 

select * from user4

select constraint_name, constraint_type, search_condition
from user_constraints			-- check, primary , unique
where table_name='USER4'
--ex19_1) insert, update, delete 테스트
insert into user4(bunho, sid, irum, juso) values(1, 'aaa','lee','진주');
insert into user4 values(2,'bbb','lee','광주');
insert into user4 values(3,'ccc','park','부산');
insert into user4(bunho, sid, irum) values(4,'ddd','hong');
insert into user4(bunho, sid, irum) values(5,'eee','kang');
insert into user4 values(6,'fff','jeung','제주');
insert into user4(irum) values('min');
commit;
select * from user4;

--[문제1]user4의 'hong'의 주소를 '강원'으로 바꾸고 ID를 'abc'로 바꾸기
update user4 set juso='강원', sid = 'abc'
where irum='hong';



--[문제2]user4의 주소가  '주'로 끝나는 데이터만 제외하고 모두 삭제하시오
delete from user4 where juso not like '%주'


--[문제3] juso가 null인 데이터를 모두 삭제하시오

delete from user4 where juso is null;

--[문제4]user4의 구조는 남기고 모든행을 삭제하시오

delete from user4
rollback
select * from user4
---------------------------------------------------------------------------
--ex20) 시퀀스생성 / 삭제
create sequence idx_num increment by 2
start with 1 maxvalue 9 cycle nocache

select idx_num.nextval,  idx_num.currval  from dual;
select idx_num.currval from dual;

drop sequence idx_num
--ex21) 테이블생성과 시퀀스적용

create table book(
	num			number			primary key,
	subject		varchar2(50)	,
	price		number,
	year		date
);


create sequence num_seq start with 1 increment by 1 nocycle nocache

insert into book(num,subject,price, year)
values(num_seq.nextval,'오라클 무적정따라하기',10000,sysdate);

insert into book(num,subject,price, year)
values(num_seq.nextval,'자바3일완성',15000,'2015-12-12');

insert into book values(num_seq.nextval,'JSP 달인되기',18000,to_char(sysdate,'YYYY-MM-DD'));

select * from book;

--ex22) user2를 user3로 테이블 구조만 복사하시오
--      (컬럼명은 그대로 복사)

select * from tab

create table user3
as 
select * from user2
where 1=0; 				-- not null 제약조건만 복사됨


select *
from user2

select *
from user_constraints



--ex23) 테이블(idx->bunho,  name -> irum,  address -> juso) 을 복사하고  
--id가  bbb인 레코드를 복사하시오
--원본테이블 : user1   / 사본테이블 : user5



drop table user5

create table user5(bunho, irum, juso)
as 
select idx,  name, address from user1
where id = 'bbb'; 


select * from user5




================================================================================================
--ex24) 테이블생성후 행추가
--테이블명 : dept
--deptno    number         ==> 기본키, 제약조건명(DNO)
--dname     varcahr2(30)   ==> 널 허용안됨, 제약조건명(DNAME)

--테이블명 : emp
--empno   number       ==> 기본키,제약조건명(ENO)
--ename   varchar2(30) ==> 널허용안됨, 제약조건명(ENAME)
--deptno  number       ==> 외래키, 제약조건명(FKNO),
--                                    대상데이터를 삭제하고 참조하는데이터는 NULL로 바꿈

create table dept(
	deptno	number constraint DNO primary key,			-- 컬럼 레벨 제약조건
	dname	varchar2(30) constraint DNAME not null
)


create table emp(
	empno	number constraint ENO primary key,
	ename	varchar2(30) constraint ENAME not null,
	deptno	number,
	constraint FKNO foreign key (deptno) references dept on delete set null
)

--create table emp(
--	empno	number constraint ENO primary key,
--	ename	varchar2(30) constraint ENAME not null,
--	deptno	number constraint FKNO references dept on delete set null	
--)




insert into dept(deptno,dname) values(10,'개발부');
insert into dept(deptno,dname) values(20,'영업부');
insert into dept(deptno,dname) values(30,'관리부');
insert into dept(dname) values(40,'경리부');      --오류(컬럼갯수가 안맞음)
insert into dept values(40,'경리부');
select * from dept;



insert into emp(empno,ename,deptno) values(100,'강호동',10);
insert into emp(empno,ename,deptno) values(101,'아이유',20);
insert into emp(empno,ename,deptno) values(102,'유재석',50);
           -- 50번부서 없음(무결성제약조건위배)-부모키가 없습니다
insert into emp(empno,ename,deptno) values(103,'이효리',40);
insert into emp(empno,ename) values(105,'장동건');


select * from emp;




select * from dept;
select * from emp;
--ex25) 삭제
--dept테이블에서 20번 부서를 삭제하시오 

delete from dept where deptno=20

--삭제된 행을 되돌리시오
rollback


--ex26) 삭제(delete)
--40번부서를 삭제하시오

delete from dept where deptno =40


--삭제된 행을 되돌리시오
rollback


--참고)  
--dept테이블의  deptno=40과  emp테이블의 deptno=40이 releation 이 형성된경우 
--  ==> 삭제안됨(자식레코드가 발견되었습니다)
--on delete cascade를 설정하면 부모테이블과 자식테이블의 레코드가 함께 삭제됨
--on delete set null를 설정하면 부모테이블은 삭제되고 자식테이블은 null로 바뀜

--ex27) 수정(update)
--장동건의 부서를 30으로 수정하시오
update emp set deptno=30 where ename = '장동건'
--================================================================================================
--[문제5]
--테이블명 : member
-- idx, 숫자(5), 기본키 / name, 문자(10), 널허용X / kor, 숫자(5) / eng, 숫자(5) / mat, 숫자(5)

-- 시퀀스명 : m_seq, 1부터 1씩증가, nocycle, nocache

--데이타 : 둘리, 90, 80,95
--         또치, 75, 90,65
--         고길동, 100,95,90
--         마이콜, 60,60,60
--         도우넛, 75,80,75
--         희동이, 80,78,90
-- idx는 자동으로 1씩증가값을 넣으시오

--select문으로 다음과 같이 출력하시오
--조건1)평균별 내림차순 정렬하시오
--조건2)평균은 소수점이하 2째자리까지 출력하시오
--조건3)타이틀은 아래와 같이 처리해 주시오

--학번     이름    국어   영어   수학    총점   평균
-- -----------------------------------------------------
--  1      둘리    90     80     96       266    88.66

drop table member

create table member(
	idx		number(5)		primary key,
	name	varchar2(10)	not null,
	kor		number(5),
	eng		number(5),
	mat		number(5)
)

create sequence m_seq start with 1 increment by 1 nocycle nocache
insert into member(idx, name, kor, eng, mat) values(m_seq.nextval, '둘리', 90, 80,95);
insert into member(idx, name, kor, eng, mat) values(m_seq.nextval, '또치', 75, 90,65);
insert into member(idx, name, kor, eng, mat) values(m_seq.nextval, '고길동', 100,95,90);
insert into member(idx, name, kor, eng, mat) values(m_seq.nextval, '마이콜', 60,60,60);
insert into member(idx, name, kor, eng, mat) values(m_seq.nextval, '도우넛', 75,80,75);
insert into member(idx, name, kor, eng, mat) values(m_seq.nextval, '희동이', 80,78,90);

select * from member


select idx 학번, name 이름, kor 국어, eng 영어, mat 수학, (kor+eng+mat) 총점,	trunc((kor+eng+mat)/3, 2) 평균
from member
order by 7 desc






