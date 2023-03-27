package lecture.p1901network;

import java.io.*;
import java.net.*;
import java.util.*;

import ex.standardofjava.collection.*;

public class C06Server {
	public static void main(String[] args) {
		int port = 50500;
		String ip = "172.30.1.81";
		while (true) {
			System.out.println("연결 기다리는 중...");
			try (ServerSocket serverSocket = new ServerSocket(port);
					Socket socket = serverSocket.accept();) {
				Thread t1 = new Thread(() -> {
					try (InputStream is = socket.getInputStream();
							BufferedInputStream bis = new BufferedInputStream(is);
							InputStreamReader isr = new InputStreamReader(bis)) {
						char[] data = new char[1024];
						int len = 0;
						System.out.println("입력 받는 중...");
						while ((len = isr.read(data)) != -1) {
							String input = new String(data, 0, len);
							System.out.println("상대방>" + input);
						}
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
				Thread t2 =new Thread(()->{
					try (	Socket socket2 = new Socket(ip, port);
							OutputStream fos = socket.getOutputStream();
							BufferedOutputStream bos = new BufferedOutputStream(fos);
							PrintStream ps = new PrintStream(bos);
							Scanner sc = new Scanner(System.in)) {
							String name= "국진>";
							String input = sc.nextLine();
							ps.println(name + input);
							ps.flush();
							socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
				t1.start();
				t2.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println();
		}
	}
}
