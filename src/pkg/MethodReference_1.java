package pkg;

import java.util.function.Consumer;

public class MethodReference_1 {

	public static void main(String[] args) {
		bar(new Consumer<Object>() {
			@Override
			public void accept(Object t) {
				MethodReference_1.abc(t);
			}
		});

		bar(t -> MethodReference_1.abc(t));

		bar(MethodReference_1::abc);
	}

	static void bar(Consumer<Object> c) {
		// void accept(T t);
	}

	// ----

	static void abc(Object o) {
	}

}
