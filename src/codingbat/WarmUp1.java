package codingbat;

public class WarmUp1 {
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		
		return !weekday || vacation;
		
	}
	
	public boolean monkeyTrouble (boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}
	
	public int sumDouble(int a, int b) {
		int sum = a + b;
		
		sum = (a == b) ? sum * 2 : sum;
		
		return sum;
	}
	
	public int diff21 ( int n) {
		int diff = 21 - n;
		diff = ( n > 21) ? diff * 2 : diff;
		diff = ( diff < 0 ) ? -diff : diff;
		return diff;
	}
	
	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && ( hour < 7 || hour >20);
	}
	
	public boolean makes10(int a, int b) {
		int sum = a + b;
		
		return (sum == 10) || (a == 10) || (b == 10);		
	}
	
	public boolean nearHundred(int n)  {
		boolean d100 = (n >= 90) && (n <= 110);
		boolean d200 = (n >= 190) && (n <= 210);
		
		return d100 || d200;
	}
	
	public boolean posNeg(int a, int b, boolean negative) {
		boolean aneg = a < 0;
		boolean bneg = b < 0;
		
		return negative ? (aneg && bneg) : (aneg ^ bneg);
	}
	
	
	public String notString(String str) {
		int ind = str.indexOf("not"); //indexOf는 문자열에서 위치를 찾아주는 역할
		
		if (ind !=0) {  // not이 존재하지 않으면
			String res = "not" + str;
			return res;
		}
		
		return str;
	}
	
	public String missingChar (String str, int n) {
		String left = str.substring(0, n);
		String right = str.substring(n + 1);
		
		return left + right;
	}
	
	public String forntBack(String str) {
		int len = str.length();
		
		if (len > 1) {
			char front = str.charAt(0);
			char back = str.charAt(len-1);
			
			String mid = str.substring(1, len-1);
			
			return back + mid + front;
		} else {
			return str;
		}
	}
	
	public String front3(String str) {
		int len = str.length();
		
		String front = str;
		
		if (len >= 3) {
			front = str.substring(0,3);
		}
		
		String res = ""; // 비어있는 텍스트에 front 스트링을 붙임
		int i = 0;
		while (i < 3) {
			res += front;
			i++;
		}
		
		return res;
	}
	
	public boolean or35(int n) {
		boolean div3 = (n % 3) == 0;
		boolean div5 = (n % 5) == 0;
		
		return div3 || div5;
	}
	
	public String front22(String str) {
		String front = str;
		
		if(str.length() >= 2) {
			front = str.substring(0, 2);
		}
		
		return front+str+front;
	}
	
	public boolean startHi(String str) {
		return str.startWith("hi");
		
//			 if (str.length() >=2) {
//			 String front = str.substring(0,2);
//			 return front.equals("hi");
//			 }else {
//			 return false;
//			 } 
		
	}
	
	public boolean icyHot(int temp1, int temp2) {
		boolean t1 = temp1 < 0 && temp2 >100;
		boolean t2 = temp1 >100 && temp2 < 0;
		return t1 || t2;
	}
	
}
