package pkg;

import java.util.Optional;

public class Optional_4 {
	
	public static void main(String[] args) {
		// expected: 0
		int i0 = Optional.empty().hashCode();
		
		// expected: 0
		int i1 = Optional.of("").hashCode();
		
		// expected: 0
		int i2 = Optional.ofNullable("").hashCode();
		
		
	}

}
