package lecture.p1902http;

import java.io.*;
import java.net.*;

public class C01Server {
	public static void main(String[] args) {
		int port = 80;

		System.out.println("응답을 기다리는 중");

		try (ServerSocket serverSocket = new ServerSocket(port);
				Socket socket = serverSocket.accept();
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);) {

			String line = "";
			while((line = br.readLine())!= null) {
				System.out.println(line);
			};

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("서버 종료");

	}
}
