
import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long num = scanner.nextInt();
		scanner.close();

		if (isPrime(num)) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
			System.out.print("Factors of " + num + ": ");
			printFactors(num);
		}
	}

	// Function to check if a number is prime
	public static boolean isPrime(long num) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	// Function to print factors of a number
	public static void printFactors(long num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
