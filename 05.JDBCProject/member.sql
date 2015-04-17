create user jspuserc identified by jsp1234;

-- SQL
-- 1) 데이터 정의 언어(DDL) : create, alter, drop --> 스키마처리, 테이블을 만들때 사용하는것(create), 스키마 구조를 바꿀때 쓰는것 (alter), 테이블을 삭제하는 것(drop)
-- 2) 데이터 조작 언어(DML) : insert, update, delete, select --> 인스턴스 변화시킬때 , 행이 추가(insert), 행내에서 데이터 변화(update), 행삭제(delete), 검색하는 것(select)
-- 3) 데이터 제어 언어(DCL) : grant, revoke --> 권한을 주는 것(grant), 줬던 권한을 다시 뺏는것(revoke)

-- 테이블 생성
create table member 
(
	id			varchar2(15)		primary key, -- 가변길이, 길이를 쓰고 남은 데이터 반납	기본키(중복된 값이 없게하는 것) 
	password	varchar2(10),
	name		varchar2(20),
	age			number,
	gender		char(1), -- 고정길이, 속도가 빠름
	addr		varchar2(100),
	regdate		date				default sysdate -- 날짜형		오늘 날짜로 자동으로 들어가게 하는 것  
)

select * from member -- *에 컬럼을 쓰는 것 

insert into member
values('test1', '1234', '홍길동', 20, '1', '서울시', '2015-04-17')

drop table member

update member
set addr = '경기도'	--그냥 해 버리면 모든 주소가 바뀌므로 where 조건을 써줌
where id = 'test1'	

delete member
where id = 'test1'