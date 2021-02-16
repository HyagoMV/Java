package pkg;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Object_wait_notify {

	public static void main(String[] args){
		ExecutorService executor = Executors.newCachedThreadPool();
		
		Runnable task = () -> foo();
		
		executor.submit(task);
		executor.submit(task);
		executor.submit(task);
		
		executor.shutdown();
		
	}

	static synchronized void foo() {
		System.out.println("A\r");
		System.out.println("B");
		System.out.println("C");
	}

}
