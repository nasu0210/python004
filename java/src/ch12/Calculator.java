package ch12;

public class Calculator {
	private int memory;
	public int getMomory() {
		return memory;
	}
	public synchronized void setMomory(int memory) {
		this.memory=memory;
		try {
			Thread.sleep(2000);
		}catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+this.memory);
	}
}
