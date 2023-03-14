package ex.thisisjava.exam1507;

import java.util.*;

public class BoardDao {

	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		list.add(new Board("제목1", "내용1"));
		return list;
	}

}
