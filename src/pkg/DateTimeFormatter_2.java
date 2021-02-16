package pkg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DateTimeFormatter_2 {

	public static void main(String[] args) {
		var formatters = new ArrayList<DateTimeFormatter>();
		
	 // formatters.add(DateTimeFormatter.ofPattern("yyyyyyyyyyy"));		// expect: ArrayIndexOutOfBoundsException
		formatters.add(DateTimeFormatter.ofPattern("yyyyyyyyyy"));		// expect: 0000002021
		formatters.add(DateTimeFormatter.ofPattern("yyyyyyyyy"));		// expect: 000002021
		formatters.add(DateTimeFormatter.ofPattern("yyyyyyyy"));		// expect: 00002021
		formatters.add(DateTimeFormatter.ofPattern("yyyyyyy"));			// expect: 0002021
		formatters.add(DateTimeFormatter.ofPattern("yyyyyy"));			// expect: 002021
		formatters.add(DateTimeFormatter.ofPattern("yyyyy"));			// expect: 02021
		formatters.add(DateTimeFormatter.ofPattern("yyyy"));			// expect: 2021
		formatters.add(DateTimeFormatter.ofPattern("yyyy"));			// expect: 2021
		formatters.add(DateTimeFormatter.ofPattern("yyy"));				// expect: 2021
		formatters.add(DateTimeFormatter.ofPattern("yy"));				// expect: 21
		formatters.add(DateTimeFormatter.ofPattern("y"));				// expect: 2021
	
		formatters.stream()
		.map(formatter -> formatter.format(LocalDate.now()))
		.forEach(System.out::println);;
	}

}
