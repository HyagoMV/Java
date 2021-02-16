package pkg;

public class Volatile_0 {

	static volatile boolean flag;

	public static void main(String[] args) {
		new Thread(() -> {
			while (!flag);

			System.out.println("Exit?");
		}).start();

		flag = true;
	}

}
