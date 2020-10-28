package chap18.textbook.exercises.p11;

import java.io.File;
import java.io.OutputStream;
import java.net.Socket;


public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 5001);	
		OutputStream os = socket.getOutputStream();
		
		String filePath = "bts.jpg";
		File file = new File(filePath);
		byte[] bytes = null;
		bytes = file.getBytes("UTP-8");
		os.write(file);
		
		
		os.write(bytes);
		os.flush();
		
		InputStream is = socket.getInputStream();
		bytes = new byte[100];
		int readByteCount = is.read(bytes);
		
		
	}
}
