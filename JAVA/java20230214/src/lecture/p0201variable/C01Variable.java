package lecture.p0201variable;

public class C01Variable {
	public static void main(String[] args) {
		//변수
		//값을 담을 수 있는 이름있는 공간
		
		//변수 선언
		//타입 변수명;
		
		int age;
		double average;
		
		//변수명
		//영문 대소문자, _, $, 숫자 조합으로 작성 가능
		//변수명은 lowerCamelCase
		//숫자로 시작하면 안됨
		//
		
		int $;
		int a_a; // int _; 단독으로 사용불가
		int hello;
		int yourAge; //int your_age; *사용은 가능하나 관습에 어긋남
		int h3; // int 3h; 숫자로 시작불가
		int 나이; // 한글사용가능하나 영문으로 사용할 것
		
		//변수를 여러개 선언가능
		int myAge, hisAge, herAge;
		
		//같은 이름의 변수 선언 불가
		// int myAge; // X
		
		//변수의 값 대입(할당) : =
		myAge = 3;
		
		//변수 선언, 값대입 가능
		int var1 = 99;
		
		//여러개 가능
		int var2 = 20, var3 = 30;
		
		//값을 할당하지 않은 변수는 사용불가
		//초기화하지 않은 변수 사용 불가
		int var4;
		//System.out.println(var4);  // 초기화 되지 않아서 사용불가
		
		//변수명 작성 시 언떤 값을 갖는지 알아볼 수 있게작성
		int koreanScore;
		int ks; // 약어 사용금지
		int englishScore;
		
	}
}
