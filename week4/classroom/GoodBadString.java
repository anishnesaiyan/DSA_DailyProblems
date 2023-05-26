package classroom;

import org.junit.Test;

public class GoodBadString {

	/*
	 * Input: s = "xyzzaz"
		Output: 1
		Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
		The only good substring of length 3 is "xyz".
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {

		String s="xyzzaz";
		twoSum_TwoPointer(s);
	}

	@Test // Edge Case
	public void example2() {
		String s="ZZZZZZZZ";
		twoSum_TwoPointer(s);
	}

	@Test // negative
	public void example3() {
		
	}

	/*
	 * Pseudo code here 
	 * 1. Create a loop runs till the string end
	 * 2. Get the three characters and compare with each other if matching print the string
	 * 3. 
	 * 
	 */
	

	private void twoSum_TwoPointer(String s) {

		for (int i = 0; i < s.length()-2; i++) {
			
			int j=0;
			
			String split=s.substring(i, i+3);
			
			if(split.charAt(j)!=split.charAt(j+1) &&split.charAt(j+1)!=split.charAt(j+2) && split.charAt(j+2)!=split.charAt(j) )
			{
				System.out.println(split);
				
			}
		}
		
	}
	
}
