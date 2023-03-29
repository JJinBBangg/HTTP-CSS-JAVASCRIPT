package com.newlecture.web.controller.admin.notice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/admin/board/notice/reg")
public class RegController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String isOpen = request.getParameter("open");
		PrintWriter out = response.getWriter();
		out.printf("title : %s",title);
		out.printf("content : %s",content);
		out.printf("open : %s",isOpen);
		
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request
				.getRequestDispatcher("/WEB-INF/view/admin/board/notice/reg.jsp")
				.forward(request, response);
	}
}
