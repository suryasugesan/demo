package addon;
import java.util.Scanner;

public class sumofdigit {
	public static int sumDigits(int n) {

        if (n == 0) {

            return 0; 
        } else {

            return (n % 10) + sumDigits(n / 10); 
        }

    }
public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a number: ");

        int number = sc.nextInt();
  int result = sumDigits(number);

        System.out.println("Sum of digits = " + result);



	}



}

	

	
	  


