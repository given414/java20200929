package chap07.lecture.accessModifier.other;

import chap06.lecture.accessModifier.MyClass;

public class SubClass extends MyClass {
	void method1() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
//		System.out.println(defaultVar);
	}
}
