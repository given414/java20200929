package chap04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		
		// 1 -> 2 -> code -> 3 -> 2
		
		// 1~10
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 11~20
		// 1~9 홀수만
		// 10~1
		// 10~2 짝수만
		
		for(int a = 11; a <= 20; a++) {
			System.out.println(a);
		}
		
		for(int b = 1; b <= 9; b+=2) {
			System.out.println(b);
		}
		
		for (int c = 10; c>=1; c--) {
			System.out.println(c);
		}
		
		for (int d = 10; d>=1; d-=2) {
			System.out.println(d);
		}
		
	}

}
