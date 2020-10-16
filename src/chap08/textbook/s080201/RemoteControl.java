package chap08.textbook.s080201;

public interface RemoteControl {
	public int MAX_VOLUME = 10; //public static final 생략됨 
	public int MIN_VOLUME = 0;  //public static final 생략됨
	
	
	//추상 메소드
	void turnOn(); //public abstract 생략가능
	public void tuernOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) { //public 생략
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() { //public 생략가능
		System.out.println("건전지를 교환합니다.");
	}
}