package pkg;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;

public class Optional_2 {
	
	public static void main(String[] args) {
		// O método 'ofNullable' retorna um Optional que PODE conter um valor NULL
		
		// expected: Optional Vazio
		Optional<String> op0 = Optional.ofNullable(null); 
		
		// expected: Optional com o valor "Java"
		Optional<String> op1 = Optional.ofNullable("Java"); 
		
		// expected: false
		boolean present0 = op0.isPresent(); 
		
		// expected: true
		boolean present1 = op1.isPresent(); 
		
	}

}
