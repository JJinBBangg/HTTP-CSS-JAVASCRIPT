package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/add")
public class AddCalculator extends HttpServlet {
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		response.setCharacterEncoding("UTF-8"); // 인코딩 설정
//		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		int x= Integer.valueOf(request.getParameter("x"));
		int y= Integer.valueOf(request.getParameter("y"));
		
		out.println(x+y);
		
	}
}
