package ch12;

public class User2 extends Thread{
	private Calculator cal;
	public void setCalculator(Calculator cal) {
		this.setName("user2");
		this.cal=cal;
	}
	public void run() {
		cal.setMomory(50);
	}

}
