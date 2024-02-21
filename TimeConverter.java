package AssignmentTechHaus;

import java.util.*;

public class TimeConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of seconds: ");
		long seconds = sc.nextLong();
		
		// Calculate days, hours, minutes, and remaining seconds
        long days = seconds / (24 * 3600);
        long remainingSeconds = seconds % (24 * 3600);
        long hours = remainingSeconds / 3600;
        remainingSeconds %= 3600;
        long minutes = remainingSeconds / 60;
        remainingSeconds %= 60;

        // Display the result
        System.out.println(seconds + " second(s) is equivalent to:");
        System.out.println(days + " Day(s) " + hours + " Hour(s) " + minutes + " Minute(s) " + remainingSeconds + " Second(s)");

        sc.close();
	}

}
