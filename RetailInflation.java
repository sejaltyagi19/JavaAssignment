package AssignmentTechHaus;

import java.util.*;

public class RetailInflation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rate of retail inflation: ");
		double rateOfInflation = sc.nextDouble() /100.0;
		
		System.out.println("Enter the number of years: ");
		int numOfYears = sc.nextInt();
		
		// Calculate the compounded inflation
        double compoundedInflation = Math.pow(1 + rateOfInflation, numOfYears);

        // Convert compounded inflation to percentage
        double compoundedInflationPercentage = (compoundedInflation - 1) * 100;
        
        // Display the result
        System.out.println("Compounded retail inflation after " + numOfYears + " years: " + compoundedInflationPercentage + "%");
        sc.close();
    

	}

}
