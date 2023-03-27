package lecture.p1901network;

import java.io.*;
import java.net.*;

public class C02NetworkClient {
	public static void main(String[] args) {
		String ip = "172.30.1.5";
		int port = 55555;
//		223.130.200.107 80
		try (Socket socket = new Socket(ip, port);
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {
			char[] buf = new char[1024];
			int len = 0;
			while ((len = br.read(buf)) != -1) {
				System.out.println(new String(buf, 0, len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
