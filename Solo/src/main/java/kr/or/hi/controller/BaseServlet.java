package kr.or.hi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.hi.service.Service;
import kr.or.hi.service.ServiceImpl;

/*
	2025-12-26 LEE
	서비스 인터페이스 생성후 Impl상속받고 사용
	이렇게 사용해서 나중에 구현체(Impl)가 바뀌어도 컨트롤러에서는 값을 바꿀 필요가 없다.
 */

@WebServlet("/index.do")
public class BaseServlet extends HttpServlet{

	Service serivce = new ServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		System.out.println(name);
		
		String addname = serivce.addNumber(name);
		
		req.setAttribute("name", addname);
		req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
	}
}
