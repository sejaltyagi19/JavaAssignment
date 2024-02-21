package AssignmentTechHaus;

import java.util.*;
import java.text.DecimalFormat;

public class CalculateGrossPrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// taking input from user
		System.out.println("Enter the net price: ");
		double netPrice = sc.nextDouble();
		System.out.println("Enter the tax rate: ");
		double taxRate = sc.nextDouble();
		
		//calculate gross price
		double grossPrice = netPrice / (1 - taxRate);

        // Format the output to display as currency
        DecimalFormat df = new DecimalFormat("#,###.##");
        String formattedGrossPrice = df.format(grossPrice);
        
        // display the result
        System.out.println("Gross Price: " + formattedGrossPrice);

        sc.close();
	}
	
}