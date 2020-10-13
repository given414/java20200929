package chap06.textbook.s060802;

public class Car {
	// 필드
	int gas;
	
	// 생성자
	
	// 메소드
	void setGas(int gas) {
		this.gas = gas; //this 키워드는 이 클래스에서 아직 만들어지지 않은 int값를 대체하는 키워드
		}
	
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false; //false를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true; //true를 리턴    
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량:"+gas+ ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" +gas+")");
				return; //메소드 종료라는 용도
			}
		}
	}
}



