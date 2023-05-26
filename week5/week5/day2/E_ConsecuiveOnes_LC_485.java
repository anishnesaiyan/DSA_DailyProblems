package week5.day2;

import org.junit.Test;

public class E_ConsecuiveOnes_LC_485 {
	/*
	 * Your Question here
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		int[] a= {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(a));
	}

	@Test // Edge Case
	public void example2() {
		int[] a= {1,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(a));
	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
		1. Loop till end
	 * 2. If num[i] is 1 = incremnt count and check the max
	 * 3. Else make count as 0
	 * 
	 * 
	 */
	public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int count=0;
        int max=0;
		while(i<nums.length) {
			if(nums[i]==1) { 	
				count++;
				max=Math.max(max, count);
			}
			else {count=0;}
			i++;
		}
	return max;
    }

}
