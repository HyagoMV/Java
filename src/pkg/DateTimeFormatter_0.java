package pkg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;


public class DateTimeFormatter_0 {

	public static void main(String[] args) {
		var formatters = new ArrayList<DateTimeFormatter>();
		
	//  formatters.add(DateTimeFormatter.ofPattern("GGGGGG")); 			// expect: IllegalArgumentException
		formatters.add(DateTimeFormatter.ofPattern("GGGGG")); 			// expect: A
		formatters.add(DateTimeFormatter.ofPattern("GGGGG"));			// expect: A
		formatters.add(DateTimeFormatter.ofPattern("GGGG"));			// expect: Anno Domini
		formatters.add(DateTimeFormatter.ofPattern("GGGG"));			// expect: Anno Domini
		formatters.add(DateTimeFormatter.ofPattern("GGG"));				// expect: AD
		formatters.add(DateTimeFormatter.ofPattern("GG"));				// expect: AD
		formatters.add(DateTimeFormatter.ofPattern("G"));				// expect: AD
		
	 

	 

	 
		
	 
		
 		
		
	 // formatters.add(DateTimeFormatter.ofPattern("ddd"));			// expect: IllegalArgumentException
		formatters.add(DateTimeFormatter.ofPattern("dd"));			// expect: 13
		formatters.add(DateTimeFormatter.ofPattern("d"));			// expect: 13
		
	 // formatters.add(DateTimeFormatter.ofPattern("gggggggggggggggggggg")); // expect: IllegalArgumentException
		formatters.add(DateTimeFormatter.ofPattern("ggggggggggggggggggg"));  // expect: 0000000000000059258
		formatters.add(DateTimeFormatter.ofPattern("gggggggggggggggggg"));	 // expect: 000000000000059258
		formatters.add(DateTimeFormatter.ofPattern("ggggggggggggggggg"));	 // expect: 00000000000059258
		formatters.add(DateTimeFormatter.ofPattern("gggggggggggggggg"));	 // expect: 0000000000059258
		formatters.add(DateTimeFormatter.ofPattern("ggggggggggggggg"));	  	 // expect: 000000000059258
		formatters.add(DateTimeFormatter.ofPattern("gggggggggggggg"));		 // expect: 00000000059258
		formatters.add(DateTimeFormatter.ofPattern("ggggggggggggg"));	     // expect: 0000000059258
		formatters.add(DateTimeFormatter.ofPattern("gggggggggggg"));		 // expect: 000000059258
		formatters.add(DateTimeFormatter.ofPattern("ggggggggggg"));		  	 // expect: 00000059258
		formatters.add(DateTimeFormatter.ofPattern("gggggggggg"));			 // expect: 0000059258
		formatters.add(DateTimeFormatter.ofPattern("ggggggggg"));			 // expect: 000059258
		formatters.add(DateTimeFormatter.ofPattern("gggggggg"));			 // expect: 00059258
		formatters.add(DateTimeFormatter.ofPattern("ggggggg"));			     // expect: 0059258
		formatters.add(DateTimeFormatter.ofPattern("gggggg"));				 // expect: 059258
		formatters.add(DateTimeFormatter.ofPattern("ggggg"));				 // expect: 59258
		formatters.add(DateTimeFormatter.ofPattern("gggg"));				 // expect: 59258
		formatters.add(DateTimeFormatter.ofPattern("ggg"));				     // expect: 59258
		formatters.add(DateTimeFormatter.ofPattern("gg"));				     // expect: 59258
		formatters.add(DateTimeFormatter.ofPattern("g"));					 // expect: 59258
		
	 // formatters.add(DateTimeFormatter.ofPattern("QQQQQQ")); 	// expect: IllegalArgumentException
		formatters.add(DateTimeFormatter.ofPattern("QQQQQ")); 	// expect: 1
		formatters.add(DateTimeFormatter.ofPattern("QQQQ")); 	// expect: 1st quarter
		formatters.add(DateTimeFormatter.ofPattern("QQQ")); 	// expect: Q1
		formatters.add(DateTimeFormatter.ofPattern("QQ")); 		// expect: 01
		formatters.add(DateTimeFormatter.ofPattern("Q")); 		// expect: 1
		
	 // formatters.add(DateTimeFormatter.ofPattern("qqqqqq"));  // expect: IllegalArgumentException
		formatters.add(DateTimeFormatter.ofPattern("qqqqq")); 	// expect: 1
		formatters.add(DateTimeFormatter.ofPattern("qqqq")); 	// expect: 1st quarter
		formatters.add(DateTimeFormatter.ofPattern("qqq")); 	// expect: Q1
		formatters.add(DateTimeFormatter.ofPattern("qq")); 		// expect: 01
		formatters.add(DateTimeFormatter.ofPattern("q")); 		// expect: 1
		
	 // formatters.add(DateTimeFormatter.ofPattern("YYYYYYYYYYY")); 	// expect: ArrayIndexOutOfBoundsException
		formatters.add(DateTimeFormatter.ofPattern("YYYYYYYYYY")); 	// expect: 0000002021
		formatters.add(DateTimeFormatter.ofPattern("YYYYYYYYY")); 		// expect: 000002021
		formatters.add(DateTimeFormatter.ofPattern("YYYYYYYY")); 		// expect: 00002021
		formatters.add(DateTimeFormatter.ofPattern("YYYYYYY")); 		// expect: 0002021
		formatters.add(DateTimeFormatter.ofPattern("YYYYYY")); 		// expect: 002021
		formatters.add(DateTimeFormatter.ofPattern("YYYYY")); 			// expect: 02021
		formatters.add(DateTimeFormatter.ofPattern("YYYY")); 			// expect: 2021
		formatters.add(DateTimeFormatter.ofPattern("YYY")); 			// expect: 2021
		formatters.add(DateTimeFormatter.ofPattern("YY")); 			// expect: 21
		formatters.add(DateTimeFormatter.ofPattern("Y")); 				// expect: 2021

	
	 // formatters.add(DateTimeFormatter.ofPattern("EEEEEE")); // expect: IllegalArgumentException
		formatters.add(DateTimeFormatter.ofPattern("EEEEE"));  // expect: S
		formatters.add(DateTimeFormatter.ofPattern("EEE"));    // expect: Sat
		formatters.add(DateTimeFormatter.ofPattern("EE"));	   // expect: Sat
		formatters.add(DateTimeFormatter.ofPattern("E"));	   // expect: Sat	
		
		formatters.add(DateTimeFormatter.ofPattern("LLLL"));
		formatters.add(DateTimeFormatter.ofPattern("LLL"));
		formatters.add(DateTimeFormatter.ofPattern("LL"));
		formatters.add(DateTimeFormatter.ofPattern("L"));
		
		
		formatters.add(DateTimeFormatter.ofPattern("d 'de' LLLL 'de' y", Locale.forLanguageTag("pt")));
		
		formatters.stream()
			.map(formatter -> formatter.format(LocalDate.now()))
			.forEach(System.out::println);;
	}

}
