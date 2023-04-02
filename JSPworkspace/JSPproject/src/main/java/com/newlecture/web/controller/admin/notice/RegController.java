package com.newlecture.web.controller.admin.notice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 50, maxRequestSize = 1024 * 1024 * 50 * 5)
@WebServlet("/admin/board/notice/reg")
public class RegController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String isOpen = request.getParameter("open");

		Collection<Part> parts = request.getParts();
		StringBuilder builder = new StringBuilder();
		int fileNum= 1;
		for (Part p : parts) {
			if (!p.getName().equals("file"))
				continue;
			if (p.getSize() == 0)
				continue;

			Part filePart = p;
			String fileName_ = filePart.getSubmittedFileName();
			int x = fileName_.indexOf(".");
			String ex = fileName_.substring(x, fileName_.length());
			String fileName = fileName_.substring(0,x);
			builder.append(fileName_);
			builder.append(", ");
			InputStream fis = filePart.getInputStream();

			String realPath = request.getServletContext().getRealPath("/upload");
			String filePath = realPath + File.separator + fileName_;
			System.out.println(realPath);
			
			File path = new File(realPath);
			if (!path.exists()) path.mkdirs();  
			while(path.exists()){
				filePath=realPath + File.separator + fileName+"("+fileNum+")"+ex;
				path = new File(filePath);
				fileNum++;
			}
			FileOutputStream fos = new FileOutputStream(filePath);
			byte[] buf = new byte[1024];
			int size = 0;
			while ((size = fis.read(buf)) != -1)
				fos.write(buf, 0, size);

			fos.close();
			fis.close();
		}
		builder.delete(builder.length() - 1, builder.length());
		boolean pub = false;
		if (isOpen != null)
			pub = true;

		Notice notice = new Notice();
		notice.setContent(content);
		notice.setTitle(title);
		notice.setPub(pub);
		notice.setWriterId("newlec");
		notice.setFiles(builder.toString());

		NoticeService service = new NoticeService();
		service.insertNotice(notice);

		PrintWriter out = response.getWriter();
		out.printf("title : %s", title);
		out.printf("content : %s", content);
		out.printf("open : %s", isOpen);

		response.sendRedirect("list");

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request
				.getRequestDispatcher("/WEB-INF/view/admin/board/notice/reg.jsp")
				.forward(request, response);
	}
}
