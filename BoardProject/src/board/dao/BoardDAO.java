package board.dao;

import java.sql.*;
import java.util.*;

import board.dto.Board;

public class BoardDAO {
	private Connection con;
	private PreparedStatement pstmt = null;

	public BoardDAO() {
		// TODO Auto-generated constructor stub
		
		try {
			//1. JDBC 드라아버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스와 연결 - connect 연결 해주는 것과 같음
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jspuserc", "jsp1234");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}
	
	//글쓰기
	public int insertBoard(Board board){
		String sql = "insert into board values(board_seq.nextval, ?, ?, ?, default, default, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, board.getName());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
			pstmt.setString(4, board.getAttachment());
			
			int result = pstmt.executeUpdate();
			
			return result;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	//리스트
	public List<Board> selectAllBoards(){
		String sql = "select * from board order by num desc";
		
		List<Board> list = new ArrayList<Board>();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				Board board = new Board();
				
				board.setNum(rs.getInt("num"));
				board.setName(rs.getString("name"));
				board.setTitle(rs.getString("title"));
				board.setWdate(rs.getDate("wdate"));
				board.setHits(rs.getInt("hits"));
				
				list.add(board);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	//상세보기
	public Board seletOnBoardByNum(int num){
		String sql = "select * from board where num=?";
		Board board = new Board();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				
				board.setNum(rs.getInt("num"));
				board.setName(rs.getString("name"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setAttachment(rs.getString("attachment"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return board;
	}
	
	//조회수 증가
	public void updateHits(int num){
		String sql = "update board set hits = hits + 1 where num=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	//수정하기
	public int updateBoard(Board board){
		String sql = "update board set name=?, title=?, content=?, attachment=? where num=?";

		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, board.getName());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
			pstmt.setString(4, board.getAttachment());
			pstmt.setInt(5, board.getNum());

			int result = pstmt.executeUpdate();

			return result;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	//삭제
	public int deleteBoard(int num){
		String sql = "delete board where num=?";

		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);

			int result = pstmt.executeUpdate();
			
			return result;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
