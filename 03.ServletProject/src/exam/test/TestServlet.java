package exam.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		
		String name = request.getParameter("name");
		String password = request.getParameter("pwd");
		String gender = request.getParameter("gender");
		String color = request.getParameter("mycolor");
		String email = request.getParameter("email");
		String text = request.getParameter("txt");
		
		String[] sport = request.getParameterValues("sport");
		String[] subject = request.getParameterValues("subject");
		PrintWriter out = response.getWriter(); //java에는 out이 내장객체라서 써줄필요가 없는데, 여기서는 받아줘야함
		
		out.print(name + "<br>");
		out.print(password + "<br>");
		out.print(gender + "<br>");
		
		out.print("<font color='" + color +"'>" + color + "</font><br>");
		out.print(email + "<br>");
		
		if(sport == null)
			out.print("선택하세요");
		else{	
			out.print(sport.length + "개 선택!<br>");
			
			for(int i=0; i< sport.length; i++)
				out.print(sport[i] + "<br>");	
		}
		
		out.print(text);
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
