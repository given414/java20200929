package chap06.lecture.staticKeyword;

public class MyClass {
	static int var2;
	int var1;
	
	static {
		System.out.println("static block");
		var2 = 3000;
	}
	
	
	void method1() {
		method2();
		System.out.println(var1);
	}
	
	static void method2() {
//		method1();
//		System.out.println(var1); static 에서 instance 필드에 접근 불가
		System.out.println(var2);
	}

}
