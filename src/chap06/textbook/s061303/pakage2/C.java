package chap06.textbook.s061303.pakage2;

import chap06.textbook.s061303.pakage1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1; //(o)
		a.field2 = 1; //(x)
		a.field3 = 1; //(x)
		
		a.method1(); //(o)
		a.method2(); //(x)
		a.method3(); //(x)
	}
}
