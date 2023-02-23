package ex.standardofjava;

abstract class Player { // 추상 클래스
	abstract void play(int pos); // 추상 메서드
	abstract void stop();
}

class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println("재생");
	}
	void stop() { 
		System.out.println("정지");
		
	}
}

public class ExAbstract {
	public static void main(String[] args) {
//		Player p = new Player(); // 추상클래스의 객체를 생성 시 미완성이기때문에 에러
		AudioPlayer ap = new AudioPlayer();
		Player ap1 = new AudioPlayer();
		ap.play(100);
		ap.stop();
		ap1.play(0);
		ap1.stop();
		
	}
}
