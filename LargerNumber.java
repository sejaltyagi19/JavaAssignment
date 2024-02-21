package AssignmentTechHaus;

import java.util.*;

public class LargerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second numner: ");
		int n2 = sc.nextInt();
		
		// Determine the larger number
		int largerNumber = (n1 > n2) ? n1 : n2;
		
		System.out.println("The larger number is: " + largerNumber);
		sc.close();
	}

}
