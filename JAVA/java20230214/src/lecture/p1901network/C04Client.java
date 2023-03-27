package lecture.p1901network;

import java.io.*;
import java.net.*;

public class C04Client {
	public static void main(String[] args) {
		String ip = "172.30.1.81";
		int port = 50500;
		
		try (Socket socket = new Socket(ip, port);
				OutputStream fos = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				PrintStream ps = new PrintStream(bos)) {
			ps.println("hello, i am kookjin ^^;;");
			ps.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("클라이언트 종료");
		
	}
}
