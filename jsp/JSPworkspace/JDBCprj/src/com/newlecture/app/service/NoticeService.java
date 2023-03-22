package com.newlecture.app.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.newlecture.app.entity.Notice;

public class NoticeService {
	public List<Notice> getList(){
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String sql = "SELECT * FROM NEWLEC.NOTICE";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "NEWLEC", "1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		List<Notice> list = new ArrayList<>();
		
		while (rs.next()) {
			int id = rs.getInt("id");
			String title = rs.getString("title");
			String writerId = rs.getString("writer_id");
			Date regDate = rs.getDate("regdate");
			String content = rs.getString("content");
			int hit = rs.getInt("hit");
			
			Notice notice = new Notice(
					id,
					title,
					writerId,
					regDate
					Content,
					hit
					);
			System.out.printf("id:%d, title:%s, writer_id:%s, regDate:%s, content:%s, hit:%d \n",
					id, title, writerId, regDate, content, hit);
		}

		rs.close();
		st.close();
		con.close();
		
		return ?;
	}
}
