package com.newlecture.app.console;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.newlecture.app.entity.Notice;
import com.newlecture.app.service.NoticeService;

public class NoticeConsole {

	private NoticeService service;
	private int page;
	private int count;
	private String searchField;
	private String searchWord;

	public NoticeConsole() {
		service = new NoticeService();
		page = 1;
		count = 0;
		searchField = "TITLE";
		searchWord = "";
	}

	public void printNoticeList() throws ClassNotFoundException, SQLException {
		List<Notice> list = service.getList(page, searchField, searchWord);
//		count = service.getCount();
		System.out.println("-----------------------------------------------");
		System.out.printf("<공지사항> 총 %d 게시글\n", count);
		System.out.println("-----------------------------------------------");
		for (Notice n : list) {
			System.out.printf("%d. %s / %s  / %s\n",
					n.getId(), n.getTitle(), n.getWriterId(), n.getRegDate());
		}
		System.out.println("-----------------------------------------------");
		System.out.printf("             %d/%d pages\n", page, (int)Math.ceil(count/10.0));
		System.out.println("-----------------------------------------------");
	}

	public int inputNoticeMenu() {
		Scanner scanner = new Scanner(System.in);
		// 상세조회
		System.out.printf("1.상세조회 / 2.이전/ 3.다음/ 4.글쓰기/ 5.검색/ 6.종료 >");
		int menu_ = Integer.valueOf(scanner.nextLine());
		return menu_;
	}

	public void movePrevList() {
		if (page == 1) {
			System.out.println("이전페이지가 없습니다.");
			return;
		}
		page--;

	}

	public void moveNextList() throws ClassNotFoundException, SQLException {
//		count = service.getCount();
		if(page ==  (int)Math.ceil(count/10.0)) {
		System.out.println("마지막페이지입니다.");
		return;
	}
		page++;
	}

	public void inputSearchWord() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색 범주(title/content/writerId)중에 하나를 입력하세요");
		System.out.println(">");
		searchField =scanner.nextLine();
		System.out.println("검색어>");
		searchWord = scanner.nextLine();
	}
}
