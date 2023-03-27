package lecture.p1901network;

import java.io.*;
import java.net.*;
import java.util.*;

public class C05Client {
	public static void main(String[] args) {
		String ip = "172.30.1.81";
		int port = 50500;
		while (true) {
			try (Socket socket = new Socket(ip, port);
					OutputStream fos = socket.getOutputStream();
					BufferedOutputStream bos = new BufferedOutputStream(fos);
					PrintStream ps = new PrintStream(bos);
					Scanner sc = new Scanner(System.in)) {
				while (true) {
					String name= "국진>";
					String input = sc.nextLine();
					ps.println(name + input);
					ps.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("클라이언트 종료");
		}
	}
}
