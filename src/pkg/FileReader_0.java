package pkg;

import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class FileReader_0 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("simple.txt");
		
		System.out.println(System.getProperty("file.encoding"));
		System.out.println(Charset.defaultCharset());
		
		System.out.println((char) reader.read());
		
		reader.close();
	}

}
