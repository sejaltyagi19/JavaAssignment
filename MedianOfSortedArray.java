package AssignmentTechHaus;

import java.util.*;

public class MedianOfSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		// Create an array of the specified size
		double[] arr = new double[size];
		
		System.out.println("Enter the elements of array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		// Calculate and display the median of the array
		double median = findMedian(arr);
        System.out.println("Median of the array: " + median);
        sc.close();
	}
	
	public static double findMedian(double[] arr) {

        if (arr.length == 0) {
            return -1.0; // return -1.0 if the array is empty
        }

        int middleIndex = arr.length / 2;

        if (arr.length % 2 == 0) {
            // Even number of elements, median is the average of the two middle elements
            return (arr[middleIndex - 1] + arr[middleIndex]) / 2.0;
        } else {
            // Odd number of elements, median is the middle element
            return arr[middleIndex];
        }
}
}
