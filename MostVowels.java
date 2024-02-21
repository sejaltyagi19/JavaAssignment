package AssignmentTechHaus;

public class MostVowels {

	public static void main(String[] args) {
		 String[] strings = {"Sunshine", "Umbrella", "Major", "Resourceful"};

	     String mostVowelsString = "";
	     int maxVowelsCount = 0;

	     for (String str : strings) {
	    	 int vowelsCount = countVowels(str);
	         if (vowelsCount > maxVowelsCount) {
	        	 maxVowelsCount = vowelsCount;
	             mostVowelsString = str;
	         }
	    }

	    System.out.println("String with the most number of vowels: " + mostVowelsString);
	 }

	    public static int countVowels(String str) {
	        int count = 0;
	        for (char ch : str.toLowerCase().toCharArray()) {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }
	        return count;

	}

}
