package com.newlecture.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cal")
public class CalCulator extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String x1 = request.getParameter("x");
		String y1 = request.getParameter("y");
		String op = request.getParameter("operator");
		
		int x = 0;
		int y = 0;
		int result = 0;
		if (!x1.equals(""))
			x = Integer.valueOf(x1);
		if (!y1.equals(""))
			y = Integer.valueOf(y1);
		System.out.println();
		if(op.equals("plus")) {
			result = x+y;
		} 
		if(op.equals("minus")) {
			result = x-y;
		}
		
		response.getWriter().printf("result is %d\n", result);

	}

}
