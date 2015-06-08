package board.action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.dto.Board;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		ServletContext context = request.getServletContext();	
		String uploadPath = context.getRealPath("upload");
		//System.out.println(uploadPath);
		
		MultipartRequest multi = new MultipartRequest(request, uploadPath, 5 * 1024 * 1024, "UTF-8", new DefaultFileRenamePolicy());
		
		String num = multi.getParameter("num");
		String name = multi.getParameter("name");
		String subject = multi.getParameter("subject");
		String content = multi.getParameter("content");
		String fileName = multi.getFilesystemName("file");
		
		//System.out.println(fileName);
		
		Board board = new Board();
		
		board.setNum(Integer.parseInt(num));
		board.setName(name);
		board.setTitle(subject);
		board.setContent(content);
		board.setAttachment(fileName);
		
		BoardDAO dao = new BoardDAO();
		
		int result = dao.updateBoard(board);
		
		if(result != 0){
			String url = "list.board";
			response.sendRedirect(url);
		}


	}

}
