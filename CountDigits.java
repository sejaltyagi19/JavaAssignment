package AssignmentTechHaus;

import java.util.*;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// taking input from user
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int digit = 0;
		
		// Count digits using division by 10
		while(n!=0) {
			n = n/10;
			digit++;
		}
		
		// display the result
		System.out.println("The count of the number is " + digit);
		sc.close();

	}

}
