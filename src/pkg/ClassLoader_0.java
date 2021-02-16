package pkg;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoader_0 {

	    static class TestClassLoader1 extends ClassLoader {

	        @Override
	        public Class<?> loadClass(String name) throws ClassNotFoundException {
	            if (!name.equals("pkg.ClassLoader_0")) {
	                return super.loadClass(name);
	            }
	            
	            try (var in = ClassLoader.getSystemResourceAsStream("pkg/ClassLoader_0.class")){
	                byte[] a = new byte[10000];
	                int len  = in.read(a);
	                return defineClass(name, a, 0, len);
	            } catch (IOException e) {
	                throw new ClassNotFoundException();
	            }
	        }
	    }


	    public static void main(String[] args) throws Exception {
	        var c1 = new TestClassLoader1().loadClass("pkg.ClassLoader_0");
	        
	        Object newInstance = c1.getDeclaredConstructor().newInstance();
	        
	        System.out.println(newInstance.equals(new ClassLoader_0()));
	        
	        System.out.println(new ClassLoader_0().equals(new ClassLoader_0()));
	        
	        
	    }
	    
	    @Override
	    public boolean equals(Object obj) {
//	    	if (getClass() !=  obj.getClass())
//	    		return false;
	    	if (obj instanceof ClassLoader_0)
	    		return true;
	    	return true;
	    }
	}
