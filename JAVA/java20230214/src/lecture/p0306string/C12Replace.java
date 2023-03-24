package lecture.p0306string;

public class C12Replace {
	public static void main(String[] args) {
		//replace
		//특정문자열을 바꿀 때 사용
		// return type : String
		
		String str1 = "설악산, 백두산, 한라산";
		String str2 = str1.replace("산", "mountain");
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1.replace("설악", "지리");
		System.out.println(str3);
	}
}
