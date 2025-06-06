package addon;
import java.util.Scanner;

public class recursion {
	   static long factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1; // base case
	        } else {
	            return n * factorial(n - 1); // recursive step
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a number to find its factorial: ");
	        int number = scanner.nextInt();
	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            long result = factorial(number);
	            System.out.println("Factorial of " + number + " is: " + result);
	        }

	        scanner.close();
	    }
	}



