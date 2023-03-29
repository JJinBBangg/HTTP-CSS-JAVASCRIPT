package com.newlecture.web.z_etc;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/cal")
public class CalCulator extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();
		ServletContext application = request.getServletContext();
		HttpSession session = request.getSession();
		String v_ = request.getParameter("v");
		String op = request.getParameter("operator");
		int v = 0;
		if (!v_.equals("")) {
			v = Integer.valueOf(v_);
		}
		// 계산
		if (op.equals("=")) {
//			int x = (Integer)(application.getAttribute("Value"));
//			int x = (Integer)(session.getAttribute("value"));
			int x = 0;
			for (Cookie c : cookies) {
				if (c.getName().equals("value")) {
					x = Integer.valueOf(c.getValue());
					break;
				}
			}
			int y = v; 
//			String operator = (String)application.getAttribute("op");
//			String operator = (String) session.getAttribute("op");
			String operator = "";
			for (Cookie c : cookies) {
				if (c.getName().equals("op")) {
					operator = c.getValue();
					break;
				}
			}
			int result = 0;
			if (operator.equals("+")) {
				result = x + y;
			} else {
				result = x - y;
			}
			response.getWriter().printf("result is %d\n", result);
		} // 값저장
		else {
//			application.setAttribute("Value", v);
//			application.setAttribute("op", op);

//			session.setAttribute("value", v);
//			session.setAttribute("op", op);

			Cookie valueCookie = new Cookie("value", String.valueOf(v));
			Cookie opCookie = new Cookie("op", op);
			valueCookie.setPath("/cal");
			valueCookie.setMaxAge(60*60*24);
			opCookie.setPath("/cal");
			response.addCookie(valueCookie);
			response.addCookie(opCookie);
			
			response.sendRedirect("cal.html");

		}

//		if (!x1.equals(""))
//			x = Integer.valueOf(x1);
//		if (!y1.equals(""))
//			y = Integer.valueOf(y1);
//		System.out.println();

	}

}
