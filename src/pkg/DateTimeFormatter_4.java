package pkg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DateTimeFormatter_4 {

	public static void main(String[] args) {
		var formatters = new ArrayList<DateTimeFormatter>();
		
	 // formatters.add(DateTimeFormatter.ofPattern("MMMMMM"));			// expect: IllegalArgumentException
		formatters.add(DateTimeFormatter.ofPattern("MMMMM"));			// expect: F
		formatters.add(DateTimeFormatter.ofPattern("MMMM"));			// expect: February
		formatters.add(DateTimeFormatter.ofPattern("MMM"));				// expect: Feb
		formatters.add(DateTimeFormatter.ofPattern("MM"));				// expect: 02
		formatters.add(DateTimeFormatter.ofPattern("M"));				// expect: 2

		formatters.stream()
			.map(formatter -> formatter.format(LocalDate.now()))
			.forEach(System.out::println);;
	}

}
