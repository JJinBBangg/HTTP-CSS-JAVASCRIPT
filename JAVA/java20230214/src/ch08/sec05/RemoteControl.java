package ch08.sec05;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VILUME = 0;
	
	void turnOn();
	void turenOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VILUME);
		} else {
			System.out.println("무음 헤제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
