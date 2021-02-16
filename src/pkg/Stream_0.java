package pkg;

import java.util.Random;


public class Stream_0 {
	public static void main(String[] args) {
		new Random()
			.ints(args[0].charAt(0), args[1].charAt(0)+1)
			.limit(5)
			.boxed()
			.map(e-> String.valueOf((char)e.intValue()))
			.distinct()
			.sorted()
			.forEach(System.out::println);;
			
	}
}
