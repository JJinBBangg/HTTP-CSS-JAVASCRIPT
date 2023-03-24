package com.newlecture.web.controller;


import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.newlecture.web.entity.Notice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/notice/detail")
public class NoticeDetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf(request.getParameter("id"));

		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String sql = """
				"SELECT * "
				"FROM NEWLEC.NOTICE "
				"WHERE ID=? ";
				""";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "NEWLEC", "1234");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			rs.next();
			
			String title=rs.getString("title");
			String writerId=rs.getString("writer_id");
			Date regdate= rs.getDate("regdate");
			int hit=rs.getInt("hit");
			String files=rs.getString("files");
			String content=rs.getString("content");
			
			Notice notice = new Notice(
					id,
					title,
					writerId,
					regdate,
					content,
					hit,
					files
					);	
			
			request.setAttribute("n", notice);

//			request.setAttribute("title", title);
//			request.setAttribute("writerId", writerId);
//			request.setAttribute("regdate", regdate);
//			request.setAttribute("hit", hit);
//			request.setAttribute("files", files);
//			request.setAttribute("content", content);
			
			
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//redirect : 되돌려보내는것
		//forward : 이어받아서 사용
		request
			.getRequestDispatcher("/notice/detail.jsp")
			.forward(request, response);
		
	}
}
