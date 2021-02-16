package pkg;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class LocalDate_0 {

	public static void main(String[] args) {
		var lds = new ArrayList<LocalDate>();
		
		lds.add(LocalDate.from(LocalDate.now()));
		lds.add(LocalDate.from(Instant.now()));

		lds.add(LocalDate.now());
		lds.add(LocalDate.now(Clock.systemDefaultZone()));
		lds.add(LocalDate.now(ZoneId.systemDefault()));

		lds.add(LocalDate.of(2021, 02, 13));
		lds.add(LocalDate.of(2021, Month.FEBRUARY, 13));
		
		// Dias passados desde de 1970-01-01
		lds.add(LocalDate.ofEpochDay(18671));
		
		lds.add(LocalDate.ofYearDay(2021, 44));
		
		// YYYY-MM-DD
		lds.add(LocalDate.parse("2021-02-13"));
		
		// Custom DataTimeFormatter
		lds.add(LocalDate.parse("13/02/2021", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		
		lds.forEach(System.out::println);

	}

}
