package ex.thisisjava.exam1510;

public class Student implements Comparable<Student> {
	public String id;
	public int score;

	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return this.score - o.score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", score=" + score + "]";
	}
}
