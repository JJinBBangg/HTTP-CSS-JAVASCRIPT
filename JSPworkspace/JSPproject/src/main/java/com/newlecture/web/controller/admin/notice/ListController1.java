package com.newlecture.web.controller.admin.notice;

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
@WebServlet("/admin/board/notice/list")
public class ListController1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] openIds = request.getParameterValues("open-id");
		String[] delIds = request.getParameterValues("del-id");
		String cmd = request.getParameter("cmd");
		switch (cmd) {
		case "일괄공개":
			for (String openId : openIds) {
				System.out.printf("open id : %s\n", openId);
			}
			break;
		case "일괄삭제":
			NoticeService service = new NoticeService();
			int[] ids = new int[delIds.length];
			for(int i = 0;i<ids.length; i++) {
				ids[i]=Integer.valueOf(delIds[i]);
			}
			int result = service.deleteNoticeAll(ids);
			break;
		}
		response.sendRedirect("list");
	}
	
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

		List<NoticeView> list = service.getNoticeViewList(field, query, page);
		int count = service.getNoticeCount(field, query);
		request.setAttribute("count", count);
		request.setAttribute("list", list);
		request
				.getRequestDispatcher("/WEB-INF/view/admin/board/notice/list.jsp")
				.forward(request, response);

	}

}
