package chap05.exercise;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
//				int student = scanner.nextInt();
//				int number = Integer.valueOf(student);
//				studentNum = studentNum + number;
//				System.out.println("학생수>" + studentNum);
				
			} else if(selectNo  == 2) {
				
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}
//				System.out.println("scores["+i+"]>");
				
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
				System.out.println("scores[" +i+ "]: " + scores[i]);
				}
			} else if (selectNo == 4) {
				//작성위치
			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
