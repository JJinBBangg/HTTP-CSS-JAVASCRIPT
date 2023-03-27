package lecture.p1901network;

import java.io.*;
import java.net.*;

public class C03Server {
	public static void main(String[] args) {
		int port = 50500;
		while (true) {
			System.out.println("연결 기다리는 중...");
			try (ServerSocket ss = new ServerSocket(port);
					Socket socket = ss.accept();
					InputStream is = socket.getInputStream();
					BufferedInputStream bis = new BufferedInputStream(is);
					InputStreamReader isr = new InputStreamReader(bis)) {

				char[] buf = new char[1024];
				int len = 0;
				while ((len = isr.read(buf)) != -1) {
					String data = new String(buf, 0, len);
					System.out.println("상대방>"+data);

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println();

			System.out.println("프로그램 종료");
		}
	}
}
