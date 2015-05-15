package exam.dao;

import java.sql.*;
import java.util.*;

import exam.dto.Member;

public class MemberDAO {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
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
		
		String id = member.getId();
		String pass = member.getPass();
		String name = member.getName();
		int age = member.getAge();
		String gender = member.getGender();
		String addr = member.getAddr();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			pstmt.setString(3, name);
			pstmt.setInt(4, age);
			pstmt.setString(5, gender);
			pstmt.setString(6, addr);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//로그인
	//1) DTO 미사용 
	public int loginMember(String id, String pwd){
		String sql = "select * from member where id=? and password=?";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){	//로그인 성공
				result = 1;
			}else{			//로그인 실패
				result = 0;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	//2) DTO 사용
	/*public void loginMember(Member member){
		String sql = "select * from member where id=? and password=?";			
	}*/
	
	//회원 리스트
	public List<Member> listMember(){
		String sql = "select * from member order by id"; //오름차순으로 정리
		List<Member> list = new ArrayList<Member>();	//List대신 ArrayList도가능 
			
		try {
			pstmt = con.prepareStatement(sql);	
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Member m = new Member();
				
				m.setId(rs.getString("id"));
				m.setName(rs.getString("name"));
				m.setAge(rs.getInt("age"));
				m.setGender(rs.getString("gender"));
				m.setAddr(rs.getString("addr"));
			
				list.add(m);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	//회원 삭제
	public void deleteMember(){
		System.out.println("회원삭제");
	}
	
	//회원 상세보기
	public void detailMember(){
		
	}
}
