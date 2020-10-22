package chap06.lecture.annotation;

@MyAnnotation
public class AnnotationEx1 {
	@MyAnnotation("abc")
	private int i;
	// 주석들......
	
	// annotation 
	
	
	@MyAnnotation(value = "abc", number=5)
	public static void mymethod() {
		
	}
}
