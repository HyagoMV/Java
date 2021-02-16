package pkg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DateTimeFormatter_5 {

	public static void main(String[] args) {
		var formatters = new ArrayList<DateTimeFormatter>();
		
	 // formatters.add(DateTimeFormatter.ofPattern("LLLLLL"));			// expect: IllegalArgumentException
		formatters.add(DateTimeFormatter.ofPattern("LLLLL"));			// expect: F
		formatters.add(DateTimeFormatter.ofPattern("LLLL"));			// expect: February
		formatters.add(DateTimeFormatter.ofPattern("LLL"));				// expect: Feb
		formatters.add(DateTimeFormatter.ofPattern("LL"));				// expect: 02
		formatters.add(DateTimeFormatter.ofPattern("L"));				// expect: 2
	
		
		formatters.stream()
			.map(formatter -> formatter.format(LocalDate.now()))
			.forEach(System.out::println);;
	}

}
