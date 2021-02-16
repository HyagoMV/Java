package pkg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DateTimeFormatter_1 {

	public static void main(String[] args) {
		var formatters = new ArrayList<DateTimeFormatter>();
		
	 // formatters.add(DateTimeFormatter.ofPattern("uuuuuuuuuuu"));		// expect: ArrayIndexOutOfBoundsException
		formatters.add(DateTimeFormatter.ofPattern("uuuuuuuuuu"));		// expect: 0000002021
		formatters.add(DateTimeFormatter.ofPattern("uuuuuuuuu"));		// expect: 000002021
		formatters.add(DateTimeFormatter.ofPattern("uuuuuuuu"));		// expect: 00002021
		formatters.add(DateTimeFormatter.ofPattern("uuuuuuu"));			// expect: 0002021
		formatters.add(DateTimeFormatter.ofPattern("uuuuuu"));			// expect: 002021
		formatters.add(DateTimeFormatter.ofPattern("uuuuu"));			// expect: 02021
		formatters.add(DateTimeFormatter.ofPattern("uuuu"));			// expect: 2021
		formatters.add(DateTimeFormatter.ofPattern("uuu"));				// expect: 2021
		formatters.add(DateTimeFormatter.ofPattern("uu"));				// expect: 21
		formatters.add(DateTimeFormatter.ofPattern("u"));				// expect: 2021
		
		formatters.stream()
		.map(formatter -> formatter.format(LocalDate.now()))
		.forEach(System.out::println);;
	}

}
