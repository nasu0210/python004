package ch12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample2 {

	public static void main(String[] args) {
		ExecutorService ep=Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		System.out.println("[------]");
		Callable<Integer> task=new Callable<Integer>() {

			@Override
			public Integer call() {
				int sum=0;
				for(int i=1;i<=10;i++) {sum+=i;}
				return sum;
				
			}
			
		};
		Future<Integer> future=ep.submit(task);
		try {
			int sum=future.get();
			System.out.println("[------]"+sum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ep.shutdown();
	}

}
