
public class FibonacciSeriesExample {
	public static void main(String[] args) {
		int max = 10; // Maximum value for Fibonacci numbers
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int c;
		System.out.println("Fibonacci Series:" + a + " " + b + " ");

		while (true) {
			c = a + b;
			if (c > max)
				break;
			System.out.print(c + " ");
			a = b;
			b = c;
			while (true) {
				c = max;
				if (c <= max)
					break;
			}
		}
	}
}
