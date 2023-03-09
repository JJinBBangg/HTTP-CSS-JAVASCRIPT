package com.newlecture.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add2")
public class Add2 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String[] num = request.getParameterValues("num");
		String op = request.getParameter("operator");

		int result = 0;
		if (op.equals("puls")) {
			for (int i = 0; i < num.length; i++) {
				if (!num[i].equals("")) {
					int num1 = Integer.valueOf(num[i]);
					result += num1;
				}

			}
		}
		if (op.equals("minus")) {
			for (int i = 0; i < num.length; i++) {
				if (!num[i].equals("")) {
					int num1 = Integer.valueOf(num[i]);
					result -= num1;
				}
			}
		}

		response.getWriter().printf("result is %d\n", result);

	}
}
