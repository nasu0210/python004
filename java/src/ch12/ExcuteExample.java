package ch12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteExample {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es=Executors.newFixedThreadPool(2);
		for(int i=0;i<=10;++i) {
			Runnable runnable=new Runnable() {
				
				@Override
				public void run() {
					ThreadPoolExecutor tpe=	(ThreadPoolExecutor)es;
					int poolsize=tpe.getPoolSize();
					String threadName=Thread.currentThread().getName();
					System.out.println(poolsize+";"+threadName);
					int value=Integer.parseInt("»ï");
					
				}
			};
			
			//es.execute(runnable);
			es.submit(runnable);
			Thread.sleep(10);
			
		}
		es.shutdown();

	}

}
