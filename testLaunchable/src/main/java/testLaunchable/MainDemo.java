package testLaunchable;

public class MainDemo {

	public static void main(String[] args) {
		int a = 10, b = 5;

		sum(a, b);

		subtract(a, b);

		multiplication(a, b);

		division(a, b);

		power(a, b);

	}

	static int sum(int a, int b) {
		return a + b;
	}

	static int subtract(int a, int b) {
		return a - b;
	}

	static int multiplication(int a, int b) {
		return a * b;
	}

	static int division(int a, int b) {
		return a / b;
	}

	static double power(int a, int b) {
		return Math.pow(a, b);
	}

}
