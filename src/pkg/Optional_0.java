package pkg;

import java.util.Optional;

public class Optional_0 {
	
	// Pode conter um valor NULL
	// Não pode conter um valor NULL
	public static void main(String[] args) {
		// Um Optional VAZIO
		Optional<String> op = Optional.empty();
		
		boolean present = op.isPresent();
		
		System.out.println(present); // expected: false
		
		
		// Não há garantia de que seja um singleton
		boolean dontDoThis = // Não faça isso
				Optional.empty() == Optional.empty(); // bad

	}

}
