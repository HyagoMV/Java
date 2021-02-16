package pkg;

import java.time.Clock;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Clock_0 {

	static Map<String, String> aliasMap = new HashMap<>();

	static {
		aliasMap.put("BR/SP", "America/Sao_Paulo");
	}

	public static void main(String[] args) {
		var clocks = new ArrayList<Clock>();
		
		clocks.add(Clock.system(ZoneId.of("America/Sao_Paulo")));
		clocks.add(Clock.system(ZoneId.of("BR/SP", aliasMap)));
		clocks.add(Clock.system(ZoneId.of("BET", ZoneId.SHORT_IDS)));
		
		clocks.forEach(System.out::println);
	}

}
