package com.newlecture.web.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

public class NoticeService {
	public int removeNoticeAll(int[] ids) {
		return 0;
	}

	public int pubNoticeAll(int[] ids) {
		Notice notice = null;
		int result = 0;
		String params = "";
		for (int i = 0; i < ids.length; i++) {
			params += ids[i];
			if (i < ids.length - 1) {
				params += ",";
			}
		}
		String sql = "UPDATE NOTICE SET PUB=1 WHERE ID IN (" + params + ")";
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					url, "NEWLEC", "1234");
			Statement st = con.createStatement();
			result= st.executeUpdate(sql);
			
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int insertNotice(Notice notice) {
		
		int result = 0;

		String sql = "INSERT INTO NOTICE(TITLE, CONTENT, WRITER_ID, PUB, FILES) VALUES(?, ?, ?, ?, ?)";
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					url, "NEWLEC", "1234");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, notice.getTitle());
			st.setString(2, notice.getContent());
			st.setString(3, notice.getWriterId());
			st.setBoolean(4, notice.getPub());
			st.setString(5, notice.getFiles());
			result= st.executeUpdate();
			
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int deleteNotice(int id) {
		return 0;
	}

	public int updateNotice(Notice notice) {
		return 0;
	}

	List<Notice> getNoticeNewestList() {
		return null;
	}

	public List<NoticeView> getNoticeViewList() {

		return getNoticeViewList("title", "", 1);
	}

	public List<NoticeView> getNoticeViewList(int page) {

		return getNoticeViewList("title", "", page);
	}

	public List<NoticeView> getNoticeViewList(String field, String query, int page) {
		List<NoticeView> list = new ArrayList<>();
		String sql = "SELECT * FROM ("
				+ "    SELECT ROWNUM NUM, N.* "
				+ "    FROM(SELECT * FROM NOTICE_VIEW WHERE " + field + " LIKE ? ORDER BY REGDATE DESC) N) "
				+ "WHERE NUM BETWEEN ? AND ?";
		int start = 1 + (page - 1) * 10;
		int end = page * 10;
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					url, "NEWLEC", "1234");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, "%" + query + "%");
			st.setInt(2, start);
			st.setInt(3, end);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String writerId = rs.getString("writer_id");
				Date regdate = rs.getDate("regdate");
				int hit = rs.getInt("hit");
				String files = rs.getString("files");
//				String content = rs.getString("content");
				int cmtCount = rs.getInt("cmt_count");
				boolean pub = rs.getBoolean("pub");
				NoticeView notice = new NoticeView(
						id,
						title,
						writerId,
						regdate,
//						content,
						hit,
						files,
						pub,
						cmtCount);
				list.add(notice);
			}
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<NoticeView> getNoticeViewPubList(String field, String query, int page) {
		List<NoticeView> list = new ArrayList<>();
		String sql = "SELECT * FROM ("
				+ "    SELECT ROWNUM NUM, N.* "
				+ "    FROM(SELECT * FROM NOTICE_VIEW WHERE " + field + " LIKE ? AND PUB=1 ORDER BY REGDATE DESC) N) "
				+ "WHERE NUM BETWEEN ? AND ?";
		int start = 1 + (page - 1) * 10;
		int end = page * 10;
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					url, "NEWLEC", "1234");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, "%" + query + "%");
			st.setInt(2, start);
			st.setInt(3, end);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String writerId = rs.getString("writer_id");
				Date regdate = rs.getDate("regdate");
				int hit = rs.getInt("hit");
				String files = rs.getString("files");
//				String content = rs.getString("content");
				int cmtCount = rs.getInt("cmt_count");
				boolean pub = rs.getBoolean("pub");
				NoticeView notice = new NoticeView(
						id,
						title,
						writerId,
						regdate,
//						content,
						hit,
						files,
						pub,
						cmtCount);
				list.add(notice);
			}
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int getNoticeCount() {

		return getNoticeCount("title", "");
	}

	public int getNoticeCount(String field, String query) {
		int count = 0;
		String sql = "SELECT COUNT(ID) COUNT FROM ("
				+ "    SELECT ROWNUM NUM, N.* "
				+ "    FROM(SELECT * FROM NOTICE WHERE " + field + " LIKE ? ORDER BY REGDATE DESC) N) ";

		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					url, "NEWLEC", "1234");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, "%" + query + "%");
			ResultSet rs = st.executeQuery();
			if (rs.next())
				count = rs.getInt("count");

			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}
	
	public int getNoticePubCount(String field, String query) {
		int count = 0;
		String sql = "SELECT COUNT(ID) COUNT FROM ("
				+ "    SELECT ROWNUM NUM, N.* "
				+ "    FROM(SELECT * FROM NOTICE WHERE " + field + " LIKE ? AND PUB=1 ORDER BY REGDATE DESC) N) ";

		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					url, "NEWLEC", "1234");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, "%" + query + "%");
			ResultSet rs = st.executeQuery();
			if (rs.next())
				count = rs.getInt("count");

			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}

	public Notice getNotice(int id) {
		Notice notice = null;
		String sql = "SELECT * FROM NOTICE WHERE ID=?";

		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					url, "NEWLEC", "1234");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				int nid = rs.getInt("id");
				String title = rs.getString("title");
				String writerId = rs.getString("writer_id");
				Date regdate = rs.getDate("regdate");
				int hit = rs.getInt("hit");
				String files = rs.getString("files");
				String content = rs.getString("content");
				boolean pub = rs.getBoolean("pub");

				notice = new Notice(
						nid,
						title,
						writerId,
						regdate,
						content,
						hit,
						files,
						pub);
			}
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notice;
	}

	public Notice getPrevNotice(int id) {
		Notice notice = null;
		String sql = "SELECT * FROM NOTICE "
				+ "WHERE ID =(SELECT ID FROM NOTICE "
				+ "WHERE REGDATE > (SELECT REGDATE FROM NOTICE WHERE ID=?) "
				+ "AND ROWNUM = 1)";
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					url, "NEWLEC", "1234");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				int nid = rs.getInt("id");
				String title = rs.getString("title");
				String writerId = rs.getString("writer_id");
				Date regdate = rs.getDate("regdate");
				int hit = rs.getInt("hit");
				String files = rs.getString("files");
				String content = rs.getString("content");
				boolean pub = rs.getBoolean("pub");

				notice = new Notice(
						nid,
						title,
						writerId,
						regdate,
						content,
						hit,
						files,
						pub);
			}
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notice;
	}

	public Notice getNextNotice(int id) {
		Notice notice = null;
		String sql = "SELECT ID "
				+ "FROM (SELECT * FROM NOTICE ORDER BY REGDATE DESC) "
				+ "WHERE REGDATE < (SELECT REGDATE FROM NOTICE WHERE ID=?) "
				+ "AND ROWNUM = 1";
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					url, "NEWLEC", "1234");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				int nid = rs.getInt("id");
				String title = rs.getString("title");
				String writerId = rs.getString("writer_id");
				Date regdate = rs.getDate("regdate");
				int hit = rs.getInt("hit");
				String files = rs.getString("files");
				String content = rs.getString("content");
				boolean pub = rs.getBoolean("pub");

				notice = new Notice(
						nid,
						title,
						writerId,
						regdate,
						content,
						hit,
						files,
						pub);
			}
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notice;
	}

	public int deleteNoticeAll(int[] ids) {
		Notice notice = null;
		int result = 0;
		String params = "";
		for (int i = 0; i < ids.length; i++) {
			params += ids[i];
			if (i < ids.length - 1) {
				params += ",";
			}
		}
		String sql = "DELETE NOTICE WHERE ID IN (" + params + ")";
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					url, "NEWLEC", "1234");
			Statement st = con.createStatement();
			result= st.executeUpdate(sql);
			
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}



}
