package chap15.textbook.exercise.p08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import chap06.textbook.s060401.Student;

public class HashSetExample {
	static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(3, "조민우"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}
}
