package week2.day1;

import org.junit.Test;

public class Integer_to_hexadecimal {

	/*
	 * Your Question here Given an integer num, return a String representing its
	 * hexadecimal rep i/p: 26 --output: 1a
	 * 
	 * For positive Numbers: Find the fraction Say number is = 47 number %16 = 15
	 * which is F number = number/16 - 2 (Repeat till number is > 0) output - 2F
	 * 
	 */
	@Test // + ive
	public void example1() {
		intToHex(47);
		intToHex(26);
		intToHex(6);
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseduo code here 1. Brute force
	 * 
	 * 
	 * 
	 */
	private void intToHex(int n) {
		char cha[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int remainder = 0;
		String s = "";
		if(n>0) {
		while (n != 0) {
			remainder = n % 16;
			s = cha[remainder] + s;
			n = n / 16;
		}
		System.out.println(s);
		}
	}

}
