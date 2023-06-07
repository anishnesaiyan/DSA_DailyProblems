package mentor;

import java.util.Arrays;

import org.junit.Test;

public class A_BoatstSavePeople_LC_881 {
	/*
	 * https://leetcode.com/problems/boats-to-save-people/description/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {

	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
	 * 1. Take two pointer 
	 * 2. Keep one at end and one at last
	 * 3. 
	 * 
	 */
	 public int numRescueBoats(int[] people, int limit) {
		 
		 Arrays.sort(people);
		 int i=0; 
		 int j=people.length-1;
		 int count=0;
		 while(i<=j) {
			 if(people[i]+people[j]<=limit) {
				 i++;
				 j--;
			 }
			 else {
				 j--;
			 }
			 count++;
		 }
		 return count;
	        
	    }
	 
	 //Another solution calvin
	 
	 public int numRescueBoats2(int[] people, int limit) {
		 int[] boat = new int[limit+1];
	     for(int p: people) boat[p]++;
	     int start = 0;
	     int end = boat.length - 1;
	     int solution = 0;
     while(start <= end) {	
         while(start <= end && boat[start] <= 0) start++;
         while(start <= end && boat[end] <= 0) end--;
         if(boat[start] <= 0 && boat[end] <= 0) break;
         solution++;
         if(start + end <= limit) boat[start]--; 
         boat[end]--;
     }
     return solution;
	 }
}
