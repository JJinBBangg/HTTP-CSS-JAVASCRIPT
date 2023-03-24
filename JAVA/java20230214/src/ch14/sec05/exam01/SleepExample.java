package ch14.sec05.exam01;

import java.awt.*;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			tk.beep();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}
}