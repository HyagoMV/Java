package pkg;

import java.util.function.Consumer;

public class MethodReference_2 {

	public static void main(String[] args) {
		MethodReference_2 ref = new MethodReference_2();

		bar(new Consumer<Object>() {
			@Override
			public void accept(Object t) {
				ref.abc(t);
			}
		});

		bar(t -> ref.abc(t));

		bar(ref::abc);
	}

	static void bar(Consumer<Object> c) {
		// void accept(T t);
	}

	// ----

	void abc(Object o) {
	}

}
