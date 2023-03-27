package com.newlecture.web.etc;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/hello")
public class Nana extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		String temp= req.getParameter("title");
		int cnt = 100;
		PrintWriter out = resp.getWriter();
		if(temp != null && !temp.equals("")) {
			cnt = Integer.parseInt(temp);
		}
		for (int i = 0; i < cnt; i++) {
			out.println((i + 1) + " : 안녕 servlet!! <br>");
		}
	}
}
