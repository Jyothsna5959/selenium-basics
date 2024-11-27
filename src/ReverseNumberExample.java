
public class ReverseNumberExample {
	public static void main(String[] args) {
		int number = 123; // The number to be reversed
		int reversedNumber = 0; // Initialize the variable to store the reversed number

		while (number != 0) {
			int digit = number % 10; // Extract the last digit
			reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
			number /= 10; // Remove the last digit from the original number
		}

		System.out.println("Original number: 123");
		System.out.println("Reversed number: " + reversedNumber);
	}
}
