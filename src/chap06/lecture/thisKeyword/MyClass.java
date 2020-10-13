package chap06.lecture.thisKeyword;

public class MyClass {
	int var;
	
	MyClass(int var) {
		this.var = var;
	}
	
	void method1() {
		int var = 5;
		System.out.println(this.var); //this var는 필드의 var를 의미
		System.out.println(var); //그냥 사용하는 변수는 5를 의미
	}
	
	void method2() {
		this.method1();
	}

}
