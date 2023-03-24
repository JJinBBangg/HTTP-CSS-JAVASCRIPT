package ch14.sec03.exam03;

import java.awt.*;

public class BeepPrintExample {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					try {
						toolkit.beep();
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			};

		};
		t1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}
