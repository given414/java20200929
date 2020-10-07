package chap04.exercises;

public class Exercise04 {
	public static void main(String[] args) {
		while(true) {
			int 눈1 = (int)(Math.random()*6)+1;
			int 눈2 = (int)(Math.random()*6)+1;
			int sum = 눈1 + 눈2;
			System.out.println("("+눈1 +","+눈2+")");
			
			if(sum == 5) {
				break;
			}
		
		}
		
	}

}
