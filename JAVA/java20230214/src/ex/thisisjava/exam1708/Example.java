package ex.thisisjava.exam1708;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
		Map<String, List<Member>> map = new HashMap<>();
		for (Member member : list) {
			List<Member> val = map.get(member.getJob());
			if (val == null) {
				val = new ArrayList<>();
				map.put(member.getJob(), val);
			}
			val.add(member);
		}
		System.out.println(map);
		Map<String, List<Member>> groupingMap = list.stream()
				.collect(Collectors.groupingBy(Member::getJob));
		System.out.println(groupingMap);
		
		
	}
}

class Member {
	private String name;
	private String job;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Member(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", job=" + job + "]";
	}

}
