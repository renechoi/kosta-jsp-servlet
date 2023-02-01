package com.example.jspservlet.practicejsp.ch08;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/ch08/loginServlet")
public class LoginServlet extends HttpServlet {
//
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String id = request.getParameter("id");
//		String pwd = request.getParameter("pwd");
//
//		if(id!=null&&pwd!=null) {
//			HttpSession session = request.getSession();
//			session.setAttribute("idKey", id);
//		}
//		response.sendRedirect("login.jsp");
//	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(id!=null&&pwd!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("idKey", id);
		}
		response.sendRedirect("/ch08/login.jsp");
	}
}