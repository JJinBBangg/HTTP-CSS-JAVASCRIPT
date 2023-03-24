package ch14.sec06.exam01;

import static org.hamcrest.CoreMatchers.*;

public class Calculator {
	private int memory;

	public int getMoney() {
		return memory;
	}
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
		
	}
	public synchronized void setMemory2(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
		
	}
}
