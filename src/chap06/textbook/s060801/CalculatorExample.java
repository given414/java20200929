package chap06.textbook.s060801;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("resul1: " + result1);
		
		
		byte x = 10; //바이트 타입은 int 타입으로 자동 형변환 가능
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
	}
}
