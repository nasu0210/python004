package ch12;

public class User1 extends Thread{
	private Calculator cal;
	public void setCalculator(Calculator cal) {
		this.setName("user1");
		this.cal=cal;
	}
	public void run() {
		cal.setMomory(100);
	}

}
