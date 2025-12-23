package kr.or.hi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
  2025-12-23 LEE
  기존 index서블릿에서 구현되었던 입력값을 받는 과정과 
  jps에 존재하던 내부값 유무 확인 과정을 따로 분리하여 구현 하였다.
 */

@WebServlet("/submit.do")
public class NameServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String name = (String) req.getParameter("name"); // 여기가 기존엔 getAttribute여서 값이 안넘어갔는데 parameter로 고쳤다.
		if (name == null || name == "") {/* 화이트 스페이스 처리 "" || = or연산자 */
			name = "없음";

		}
		req.setAttribute("name", name);
		req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
	}
}