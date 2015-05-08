package exam.dao;

import java.sql.*;

import exam.dto.Member;

public class MemberDAO {
	
	//생성자
	public MemberDAO() {
		// TODO Auto-generated constructor stub
		System.out.println("생성자");
		
		//1. JDBC 드라아버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//예외 처리 해줘야함, jsp는 자동으로 해줌

		//2. 데이터베이스와 연결 - connect 연결 해주는 것과 같음
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jspuserc", "jsp1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	//회원가입
	public void insertMember(Member member){
		System.out.println("회원가입");
		String sql = "insert into member values(?, ?, ?, ?, ?, ?, default)";
	}
	//회원 삭제
	public void deleteMember(){
		System.out.println("회원삭제");
	}
}
