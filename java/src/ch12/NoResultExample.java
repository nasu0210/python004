package ch12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		ExecutorService ep=Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		int a=Runtime.getRuntime().availableProcessors();
		System.out.println(a);
		Runnable runnable=new Runnable() {

			@Override
			public void run() {
				int sum=0;
				for(int i=1;i<=10;i++) {sum+=i;}
				System.out.println(sum);
				
			}
			
		};
		Future future=ep.submit(runnable);
		try {
			future.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ep.shutdown();
	}

}
