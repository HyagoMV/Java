package pkg;

public class Object_0 {

	public static void main(String[] args) {
		String string = new Object_0().toString();
	}
	
	private String field0;
	private int field1;
	private boolean field2;
	
	@Override
	public String toString() {
		return String.format("%s [field0=%s, filed1=%d, filed1=%b]", 
				getClass().getSimpleName(), 
				field0, field1, field2);
	}

}
