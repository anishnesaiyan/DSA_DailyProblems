package week5.day2;

import org.junit.Test;

public class D_WhiteBlack_SlidingWindow {
	/*
	 * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. 

		The characters 'W' and 'B' denote the colors white and black, respectively.
		You are also given an integer k, which is the desired number of consecutive black blocks.
		In one operation, you can recolor a white block such that it becomes a black block.
		Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
		 
		Example 1:
		Input: blocks = "WBBWWBBWBW", k = 7
		Output: 3
		Explanation:
		One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
		so that blocks = "BBBBBBBWBW". 
		It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
		Therefore, we return 3.
		
		Example 2:
		Input: blocks = "WBWBBBW", k = 2
		Output: 0
		Explanation:
		No changes need to be made, since 2 consecutive black blocks already exist.

	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		
	String s="WBBWWBBWBW";
	int k=7;
	slidingWindow(s,k);
	slidingWindow2(s,k);	
	}

	@Test // Edge Case
	public void example2() {
		String s="WBWBBBW";
		int k=2;
		slidingWindow(s,k);
		slidingWindow2(s,k);
	}

	@Test // negative
	public void example3() {
		String s="WWWWWW";
		int k=2;
		slidingWindow(s,k);
		slidingWindow2(s,k);
	}

	/*
	 * Pseudo code here 
	 * 1. Loop till the k values and find the no of occurence of W
	 * 2. Then slide to next and remove the previous
	 * 		applying the below condition
	 * 		Remove 	add	
				W	W	no change
				B	W	Count++
				W	B	count--
				b	b	no change

	 */
	

	private void slidingWindow(String s, int k) {
		int count=0;
		for (int i = 0; i < k; i++) {
			if(s.charAt(i)=='W')
				count++;	
		}
		int min=count;
		
		for (int i = 0,j=k; j<s.length(); i++,j++) {
			
			if(s.charAt(i)=='B' && s.charAt(j)=='W') 
				count++;
			else if(s.charAt(i)=='W' && s.charAt(j)=='B') 
				count--;
	
			
			if(count<min) {
				min=count;
			}
		}
		
		System.out.println(min);
	}
	
	/*Another method
	 * 1. Loop till k-1 and find the initial minimum
	 * 2. Assign count value to min
	 * 3. previous loop will exit when it reaches k value
	 * 4. The next loop will starts from the exit point of i   ---important
	 * 5. check dropping element(i-k) is W then count --
	 * 6. Check adding element (i) is W count ++
	 * 
	 * */
	private void slidingWindow2(String s, int k) {
		int count=0;
		
		int i = 0;
		for (; i < k; i++) {
			if(s.charAt(i)=='W')
				count++;	
		}
		int min=count;	
		
		for (; i<s.length();i++) {
			//or for (int j=k; j<s.length();j++) {
			//Starting of window or dropping element
			if(s.charAt(i-k)=='W')
				count--;
			//Adding element of starting window
			if(s.charAt(i)=='W')
				count++;

			if(count<min) {
				min=count;
			}
		}
		
		System.out.println(min);
	}

}
