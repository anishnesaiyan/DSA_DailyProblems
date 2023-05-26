package week3.assignments;

import org.junit.Test;

public class ClassWork_2 {
	/*
	 * Your Question here
	 * Given integer , I request you to get revered integer
	 * 
	 */
	@Test // + ive
	public void example1() {
		twoSum_BruteForce(123);
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseduo code here 1. Brute force
	 * 1. Get the input 123
	 * 2. Find modulo of 123%10 ==> 3 
	 * 3. Find quotient of 123/10 ==> 12
	 * 
	 * 
	 * 
	 */
	private void twoSum_BruteForce(int n) {
		//int n=123;
		int reversed=0;
		while(n!=0) {
			reversed=reversed*10 + n%10;
			n = n/10;
		}
		System.out.println(reversed);
	}

	private void twoSum_TwoPointer() {

	}
}
