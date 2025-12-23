package kr.or.hi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
  2025-12-23 LEE
  금일 학습내용 GET방식으로 jsp에 입력한 값 출력하기
  지금 코드는 index.jsp에서 form태그 안에 있는 input태그를 이용하여 값을 입력한뒤
  index서블릿에서 입력한 값을 받아서 다시 jsp로 보내는 방식을 사용하였다.
*/

@WebServlet("/index.do")
public class IndexServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String name = req.getParameter("name");
		req.setAttribute("name", name);
		
		req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp); // 현 지식 수준에선 포워드 잊지말것
		// 포워드 없으면 값이 안넘어간다. 포워드를 입력하므로써 요청 응답 싹다 들고 jsp로 가는거다.
	}
}
