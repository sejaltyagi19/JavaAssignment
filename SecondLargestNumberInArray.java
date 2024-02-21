package AssignmentTechHaus;

import java.util.*;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		// Create an array of the specified size
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Find the second largest number
		int k = 2;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	
			if(i == k-1) {
				System.out.println("Second max element is " + arr[i]);    // Display the result
				break;
			}
		}
		sc.close();

	}

}
