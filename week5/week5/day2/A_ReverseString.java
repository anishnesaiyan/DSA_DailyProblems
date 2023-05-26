package week5.day2;

import java.util.Arrays;

import org.junit.Test;

public class A_ReverseString {

	
	/*
	 * Reverse the given String
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String S= "Test Leaf";
		System.out.println(reverseString(S));
	}

	@Test // Edge Case
	public void example2() {
		String S= "T";
		System.out.println(reverseString(S));
	}

	@Test // negative
	public void example3() {
		String S= "";
		System.out.println(reverseString(S));
	}

	/*
	 * Pseudo code here 1. Brute force
	 * 
	 * 
	 * 
	 */

	private String reverseString(String S) {
		if(S.length()<1) return "Invalid Input";		
		String reverse="";
		for (int i = S.length()-1; i >=0; i--) {
			
			reverse=reverse+S.charAt(i);
		}
		
		return reverse;
	}

	private String reverseStringTwoPointer(String S) {
		
		if(S.length()<1) return "Invalid Input";
		int i=0;
		int j=S.length()-1;
		char[] arr=S.toCharArray();
		
		while(i<j) {
			
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
	
		return Arrays.toString(arr);
	}
}
