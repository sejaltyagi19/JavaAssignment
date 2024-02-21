package AssignmentTechHaus;

import java.util.*;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your taxable income:");
        double taxableIncome = sc.nextDouble();

     // Calculate the income tax using the calculateTax method
        double tax = calculateTax(taxableIncome);

     // Print the calculated tax amount
        System.out.println("Your income tax is: Rs." + tax);
        sc.close();
    }

    public static double calculateTax(double taxableIncome) {
        if (taxableIncome <= 250000) {
            return 0;
        } else if (taxableIncome <= 500000) {
            return 0.1 * (taxableIncome - 250000);
        } else if (taxableIncome <= 1000000) {
            return 0.1 * (500000 - 250000) + 0.2 * (taxableIncome - 500000);
        } else {
            return 0.1 * (500000 - 250000) + 0.2 * (1000000 - 500000) + 0.3 * (taxableIncome - 1000000);
        }
    }
}


