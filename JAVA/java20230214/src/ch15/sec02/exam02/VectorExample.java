package ch15.sec02.exam02;

import java.util.*;

import ch15.sec02.exam01.*;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector();
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 2000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		threadA.start();
		threadB.start();

		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
	}
}
