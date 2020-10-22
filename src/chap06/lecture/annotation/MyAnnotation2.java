package chap06.lecture.annotation;

import java.lang.reflect.Method;

public class MyAnnotation2 {
	public static void main(String[] args) {
		Class clazz= MyClass.class;
		Method method = clazz.getMethod("method1");
		boolean anno = method.isAnnotationPresent(MyAnnotation.class);
		System.out.println(anno);
	}
}
