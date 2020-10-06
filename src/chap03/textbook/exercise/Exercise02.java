package chap03.textbook.exercise;

public class Exercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); // 증감 연산자가 변수 뒤에 있으면 다른 연산자를 먼저 처리한 후 1증가 또는 1감소시킨다
		System.out.println(z);
	}

}
