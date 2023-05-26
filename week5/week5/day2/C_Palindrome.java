package week5.day2;

import org.junit.Test;

public class C_Palindrome {
	/*
	 * Your Question here
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {

		String a="ANISH";
		System.out.println(twoSum_TwoPointerOptimized(a));
	}

	@Test // Edge Case
	public void example2() {
		String a="AAAA";
		System.out.println(twoSum_TwoPointerOptimized(a));
	}

	@Test // negative
	public void example3() {
		String a="A";
		System.out.println(twoSum_TwoPointerOptimized(a));
	}

	/*
	 * Pseudo code here 
	 * 1. Place two pointer
	 * 	if even p1=mid-1
	 * 			p2=mid
	 *  if odd p1=mid-1
	 *  		p2=mid+1
	 *  2. Now move p1-- and p2++
	 *  3. If value of p1 and p2 are matched ignore
	 *  	if not directly return false
	 * 
	 * 
	 * 
	 */
	private void twoSum_BruteForce() {

	}

	private boolean twoSum_TwoPointer(String s) {
		
		int mid=s.length()/2;
		int p1=mid-1;
		int p2=0;
		if(s.length()%2!=0) {
			p2=mid+1;}
		else {
			p2=mid;}
	
	while(p1>=0 && p2<s.length()) {
		
		if(s.charAt(p1)!=s.charAt(p2))
		{
			return false;
		}
		p1--;
		p2++;
		
	}
	return true;
	
	}
	
	// Modified pointers assginemnt
	// for even p2 is mid so directly assigned mid as P2
	// For odd we have mid +1, so we just added P2++
	
// p1 and P2 incrementation happed inside the conditon itself
	
private boolean twoSum_TwoPointerOptimized(String s) {
		
		int p2=s.length()/2;
		int p1=p2-1;
		if(s.length()%2!=0) {
			p2=p2++;}
	while(p1>=0 && p2<s.length()) {
		
		if(s.charAt(p1--)!=s.charAt(p2++))
		{
			return false;
		}
		p1--;
		p2++;
		
	}
	return true;
	
	}

}
