package chap18.lecture.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class inputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/inputstream/InputStreamEx1.java";
		InputStream is = new FileInputStream(path);
		
		int cnt = 0;
		int r = 0;
		//1byte씩 읽다가 더이상 읽을게 없어지면 -1 리턴
		while((r = is.read()) != -1) {  
			System.out.print((char) r);
			cnt++;
		}
		System.out.println(cnt);
		
		is.close();
		
	}
}
