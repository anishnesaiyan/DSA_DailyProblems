package mentor;

import org.junit.Test;

public class B_SubstringsDistinctCharacters_LC1876 {
	/*
	 * Your Question here
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String s = "xyzzaz";
		System.out.println(countGoodSubstrings(s));
	}

	@Test // Edge Case
	public void example2() {
		String s = "aababcabc";
		System.out.println(countGoodSubstrings(s));
	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
		1. char a!=b
			char b!=c
			char c!=a
			
	 * 
	 * 
	 * 
	 */
	

	public int countGoodSubstrings(String s) {
		char[] charArr = s.toCharArray();
		int count=0;
		for (int i = 0; i+2 < s.length(); i++) {
		if(charArr[i]!=charArr[i+1] && charArr[i+1]!=charArr[i+2] && charArr[i]!=charArr[i+2]) {
			count++;
		}		
		}
		return count;
	}
}
