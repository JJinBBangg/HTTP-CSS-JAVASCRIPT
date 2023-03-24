package lecture.p0306string;

public class C04CharAt {
	public static void main(String[] args) {
		// charAt
		// 특정 위치(index)에 있는 문자 확인

		String str1 = "spring";

		System.out.println("길이:" + str1.length());

		System.out.println(str1.charAt(4));

		System.out.println(str1.charAt(1));
		char res1 = str1.charAt(str1.length() - 1);
		
		char res2 = str1.charAt(str1.length() - 2);
		
		System.out.println(String.valueOf(res1 + res2));

		System.out.println(str1.charAt(str1.length() - 1));
		String res = String.valueOf(str1.charAt(3));
		System.out.println(res);
		
		
		
		String str = "aaaggrr";
		String res3 = "";
		  for(int i = 0; i < str.length(); i++){
		    res3 += str.charAt(i)+str.charAt(i);
		  } 
		  str = res3;
		  System.out.println(str);
		
		}
	}
