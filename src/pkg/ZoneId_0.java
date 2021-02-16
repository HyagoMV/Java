package pkg;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;

public class ZoneId_0 {

	public static void main(String[] args) {
		var zoneIds = new ArrayList<ZoneId>();

		zoneIds.add(ZoneId.ofOffset("GMT", ZoneOffset.ofHours(12)));
		zoneIds.add(ZoneId.ofOffset("UTC", ZoneOffset.ofHoursMinutes(12, 00)));
		zoneIds.add(ZoneId.ofOffset("UT", ZoneOffset.ofHoursMinutesSeconds(12, 00, 00)));
		zoneIds.add(ZoneId.ofOffset("GMT", ZoneOffset.ofTotalSeconds(12 * 60 * 60)));
		
		zoneIds.add(ZoneId.ofOffset("GMT", ZoneOffset.of("+12")));
		zoneIds.add(ZoneId.ofOffset("UTC", ZoneOffset.of("+12:00")));
		zoneIds.add(ZoneId.ofOffset("UT", ZoneOffset.of("+12:00:00")));
		
		zoneIds.forEach(System.out::println);

		// Exibe os Zone Ids disponíveis
		//ZoneId.getAvailableZoneIds().forEach(System.out::println);
	}

}
