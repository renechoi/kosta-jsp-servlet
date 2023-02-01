package com.example.jspservlet.practicejsp.ch08;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch08/exampleServlet02")
public class ExampleServlet02 extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init ȣ��");
	}
	@Override
	public void destroy() {
		System.out.println("destroy ȣ��");
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("service ȣ��");
	}
}
