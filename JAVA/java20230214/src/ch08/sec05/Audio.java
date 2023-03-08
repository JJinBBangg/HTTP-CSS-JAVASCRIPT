package ch08.sec05;

public class Audio implements RemoteControl {
	
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turenOff() {
		System.out.println("Tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VILUME){
			this.volume = RemoteControl.MIN_VILUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : "+ volume);
	}
	private int memoryVolume;
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VILUME);
		} else {
			System.out.println("무음 헤제합니다.");
			setVolume(this.memoryVolume);
		}
	}
}
