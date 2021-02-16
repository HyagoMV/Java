package pkg;

import java.util.function.Consumer;

public class MethodReference_0 {
 
	public static void main(String[] args) throws ClassNotFoundException {
		// class MethodReference_0$1 implements Consumer
		bar(new Consumer<Object>() {
			@Override
			public void accept(Object t) {
				new MethodReference_0(t);
			}
		});

		//void lambda$0(Object t)
		bar(t -> new MethodReference_0(t));

		bar(MethodReference_0::new);
	}

	static void bar(Consumer<Object> c) {
		// void accept(T t);
	}

	// -----

	public MethodReference_0(Object o) {
	}

}
