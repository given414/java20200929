package chap06.textbook.exercises.p20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int size = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료" );
			System.out.println("----------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1 :
					createAccount();
					break;
			
			case 2 :
					accountList();
					break;
					
			case 3 :
					deposit();
					break;
					
			case 4 : 
					withdraw();
					break;
					
			case 5 :
					run = false;
					break;
			} 
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
		//작성위치
	}
	
	//계좌목록보기
	private static void accountList() {
		//작성위치
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		
		String ano;
		int money;
		
		System.out.println("계좌번호:");
		ano = scanner.next();
		System.out.println("예금액:");
		money = scanner.nextInt();
		
		Account cur = findAccount(ano);
		int sum = cur.getBalance() + money;
		cur.setBalance(sum);
		
		System.out.println("예금이 성공되었습니다.");
		
		
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		
		String ano;
		int money;
		
		System.out.println("계좌번호:");
		ano = scanner.next();
		System.out.println("출금액:");
		money = scanner.nextInt();
		
		Account cur = findAccount(ano);
		int sum = cur.getBalance() - money;
		cur.setBalance(sum);
		
		System.out.println("출금이 성공되었습니다.");
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		//작성위치
	}
}
