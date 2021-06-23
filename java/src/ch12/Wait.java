package ch12;

public class Wait {

	public static void main(String[] args) {
		DataBox dataBox=new DataBox();
		ProducerThread pr=new ProducerThread(dataBox);
		ConsumerThread co=new ConsumerThread(dataBox);
		pr.start();
		co.start();

	}

}
