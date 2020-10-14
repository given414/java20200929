package chap06.textbook.s061005;

public class Singleton {
	private static Singleton sigleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}

}
