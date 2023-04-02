package com.newlecture.web.controller.notice;

import java.io.IOException;
import java.util.List;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/notice/list")
public class ListController extends HttpServlet {
	@Override	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String field_ = request.getParameter("f");
		String query_ = request.getParameter("q");
		String page_ = request.getParameter("p");
		
		String field = "title";
		if (field_ != null && !field_.equals(""))
			field = field_;
		String query = "";
		if (query_ != null && !query_.equals(""))
			query = query_;
		int page = 1;
		if (page_ != null)
			page = Integer.valueOf(page_);
		NoticeService service = new NoticeService();
		
		List<NoticeView> list = service.getNoticeViewPubList(field, query, page);
		int count = service.getNoticePubCount(field, query);
		request.setAttribute("count", count);
		request.setAttribute("list", list);
		request
				.getRequestDispatcher("/WEB-INF/view/notice/list.jsp")
				.forward(request, response);

	}
}
