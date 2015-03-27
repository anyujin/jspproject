package exam.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet") //URL Mapping
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stubs
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//한글처리
		request.setCharacterEncoding("UTF-8"); //request를 UTF-8 방식으로 설정해줌 
		response.setContentType("text/html; charset=UTF-8");//response에 설정해줌, html로 내려받음, get방식으로 할때는 server.xml에 URLEncoding 해줌
				
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		out.print("Hello - GET<br>");     
		out.print("이름 : " + name + "<br>");
		out.print("아이디 : " + id + "<br>");
		out.print("비밀번호 : " + pwd + "<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//한글처리
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String j = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//out.print("<html>");
		out.print("Hello - POST<br>");     
		out.print("이름 : " + j + "<br>");
		out.print("아이디 : " + id + "<br>");
		out.print("비밀번호 : " + pwd + "<br>");
	}

}
