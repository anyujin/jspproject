-- 테이블 생성
create table board
(
	num			number			primary key,		-- 글번호	
	name 		varchar2(10),						-- 작성자
	title		varchar2(100),						-- 제목
	content		varchar2(1000),						-- 내용
	hits		number			default 0,			-- 조회수
	wdate		date			default sysdate,	-- 작성일
	attachment	varchar2(50)						-- 첨부파일
)

-- 시퀀스 생성
create sequence board_seq

insert into board
values(board_seq.nextval, 'yujin', 'hi', 'hello', default, default, 'j')

select * from board

delete board
where title = 'hi'

