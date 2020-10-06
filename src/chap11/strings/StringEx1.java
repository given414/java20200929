package chap11.strings;

public class StringEx1 {
	public static void main(String[] args) {
		String str1 = "java";
		char c1 = str1.charAt(0);
		System.out.println(c1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		System.out.println(str1.charAt(4));
		
		// equals
		String str2 = "python";
		String str3 = "python";
		String str4 = "py";
		String str5 = "thon";
		
		System.out.println(str2);
		System.out.println(str6);
		
		System.out.println(str2 == str6);
		System.out.println(str2.equals(str6));
		
		
		//indexOf
		String str7 = "자바 프로그래밍";
		str7.indexOf("프로");
		System.out.println(a);
	}

}
