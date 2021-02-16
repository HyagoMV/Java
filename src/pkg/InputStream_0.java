package pkg;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStream_0 {

	public static void main(String[] args) throws Exception{
		// File � a ORIGEM dos bytes 
		InputStream in = new FileInputStream("simple.txt");
		
		System.out.println(System.getProperty("file.encoding"));
		System.out.println(Charset.defaultCharset());
		
		
		System.out.println(in.read());
		System.out.println(in.read());
		System.out.println(in.read());
		
	}

}
