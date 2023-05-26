package week5.day2;

import java.util.Arrays;

import org.junit.Test;

public class B_MoveZeros_LC_283 {
	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

		Note that you must do this in-place without making a copy of the array.
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		int arr[]= {0,1,0,3,12};

		System.out.println(Arrays.toString(twoSum_TwoPointer(arr)));
	}

	@Test // Edge Case
	public void example2() {
		int arr[]= {1,0,1};
		System.out.println(Arrays.toString(twoSum_TwoPointer(arr)));
	}

	@Test // negative
	public void example3() {
		int arr[]= {0};
		System.out.println(Arrays.toString(twoSum_TwoPointer(arr)));
	}

	/*
	 * Pseudo code here 1. Brute force
	 * 
	 * 
	 * 
	 */

	private int[] twoSum_TwoPointer(int[] arr) {

		
		int p2=0;
		for (int p1 = 0; p1 < arr.length; p1++) {
			
			if(arr[p1]!=0) {
				int temp=arr[p1];
				arr[p1]=arr[p2];
				arr[p2]=temp;
				p2++;
			}
			
		}
		return arr;
		}

}
