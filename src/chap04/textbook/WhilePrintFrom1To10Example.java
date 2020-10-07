package chap04.textbook;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("-----------------");
		
		//11~20
		int a = 11;
		while (a <= 20) {
			System.out.println(a);
			a++;
		}
		
		System.out.println("-----------------");
		
		//1~9 홀수만
		int b = 1;
		while (b < 10) {
			System.out.println(b);
			b+=2;
		}
		
		System.out.println("-----------------");
		
		//10~1
		int c = 10;
		while (c >= 1) {
			System.out.println(c);
			c--;
		}
		
		System.out.println("-----------------");
		
		//10~2 짝수만
		int d = 10;
		while (d > 1) {
			System.out.println(d);
			d-=2;
		}
		
		
		
		
	}
}
