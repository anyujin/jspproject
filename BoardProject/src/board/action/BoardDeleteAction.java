package board.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.dto.Board;

public class BoardDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num = request.getParameter("num");

		BoardDAO dao = new BoardDAO();
		
		int result = dao.deleteBoard(Integer.parseInt(num));
		
		if(result != 0){
			String url = "list.board";
			response.sendRedirect(url);
		}
	}

}
