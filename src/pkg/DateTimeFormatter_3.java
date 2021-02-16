package pkg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DateTimeFormatter_3 {

	public static void main(String[] args) {
		var formatters = new ArrayList<DateTimeFormatter>();
		
	 // formatters.add(DateTimeFormatter.ofPattern("DDDD"));			// expect: IllegalArgumentException
		formatters.add(DateTimeFormatter.ofPattern("DDD"));				// expect: 044
		formatters.add(DateTimeFormatter.ofPattern("DD"));				// expect: 44
		formatters.add(DateTimeFormatter.ofPattern("D"));				// expect: 44
				
		formatters.stream()
			.map(formatter -> formatter.format(LocalDate.now()))
			.forEach(System.out::println);;
	}

}
