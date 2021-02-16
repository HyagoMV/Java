package pkg;

import java.util.function.Consumer;

public class MethodReference_3 {

	public static void main(String[] args) {
		bar(new Consumer<Object>() {
			@Override
			public void accept(Object t) {
				t.toString();
			}
		});

		bar(t -> t.toString());

		bar(Object::toString);
	}

	static void bar(Consumer<Object> c) {
		// void accept(T t);
	}

	// ----

	void abc(Object o) {
	}

}
