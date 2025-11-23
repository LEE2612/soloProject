package fristProject;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/main.do")
public class startProjcet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		RequestDispatcher rd = req.getRequestDispatcher("number1Pro.html");
		rd.forward(req, resp);
		
		String name = req.getParameter("name");
		
		PrintWriter pw = resp.getWriter();
		
		
		
		
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<a>"+name+"</a>");
		pw.print("</body>");
		pw.print("</html>");
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}
	
}
