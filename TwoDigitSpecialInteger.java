package AssignmentTechHaus;

import java.util.*;

public class TwoDigitSpecialInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int num = sc.nextInt();
		
		// Check if the integer is a two-digit special integer
        boolean isSpecialInteger = checkSpecialInteger(num);

        // Display the result
        if (isSpecialInteger) {
            System.out.println(num + " is a two-digit special integer.");
        } else {
            System.out.println(num + " is not a two-digit special integer.");
        }

        sc.close();
    }

    public static boolean checkSpecialInteger(int num) {
        // Check if the number is a two-digit number
        if (num >= 10 && num <= 99) {
            int firstDigit = num / 10;
            int secondDigit = num % 10;
            int product = firstDigit * secondDigit;
            int sum = firstDigit + secondDigit + product;
            
            // Check if the sum equals the original number
            return sum == num;
        } else {
            return false;
        }

	}

}
