package pkg;

import java.util.Optional;

public class Optional_1 {
	
	public static void main(String[] args) {
		// O método 'of' retorna um Optional que NÃO PODE conter um valor NULL
		
		// expected: NullPointerException
		Optional<String> op0 = Optional.of(null);  
		
		// expected: Optional com o valor "Java"
		Optional<String> op1 = Optional.of("Java"); 
		
		// expected: true
		boolean present = op1.isPresent(); 
	}

}
