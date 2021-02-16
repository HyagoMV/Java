package pkg;

import java.util.Optional;

public class Optional_3 {
	
	public static void main(String[] args) {
		// expected: true
		boolean b0 = Optional.empty().equals(Optional.empty());
		
		// expected: true
		boolean b1 = Optional.of("Java").equals(Optional.of("Java"));
		
		// expected: true
		boolean b2 = Optional.of("Java").equals(Optional.ofNullable("Java"));
		
		// expected: false
		boolean b3 = Optional.of("Java").equals(Optional.ofNullable(""));
		
	}

}
