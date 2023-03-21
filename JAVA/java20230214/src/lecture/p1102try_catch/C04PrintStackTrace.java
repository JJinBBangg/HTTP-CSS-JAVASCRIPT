package lecture.p1102try_catch;

public class C04PrintStackTrace {
	public static void main(String[] args) {
		String a = "java";
		try {
			System.out.println(a.charAt(4));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
