package String;

public class longestSubstringWithoutRepeatingChars {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
        System.out.println("The input string is " + str);
 
        int len = longestUniqueSubsttr(str);
        System.out.println("The length of the longest "
                           + "non-repeating character "
                           + "substring is " + len);
	}

	private static int longestUniqueSubsttr(String str) {
		
		String test = "";
		int maxLength = -1;
		
		for(char c: str.toCharArray()) {
			String current  = String.valueOf(c);
			
				if(test.contains(current)) {
					test = test.substring(test.indexOf(current)+1);
				}
				
				test = test + String.valueOf(c);
				maxLength = Math.max(test.length(), maxLength); 
		}
		
		return maxLength;
	}

}
