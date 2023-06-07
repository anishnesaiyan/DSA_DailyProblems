package assessment_2;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class RiverRecords_1 {
	/*
	 * Question - 1
		River Records

	 * 
	 * Given an array of integers, without reordering, determine the maximum
		difference between any element and any prior smaller element. If there
		is never a lower prior element, return -1.
		Example
		arr = [5, 3, 6, 7, 4]
		There are no earlier elements than arr[0].
		There is no earlier reading with a value lower than arr[1].
		There are two lower earlier readings with a value lower than arr[2] = 6:
		arr[2] - arr[1] = 6 - 3 = 3
		arr[2] - arr[0] = 6 - 5 = 1
		There are three lower earlier readings with a lower value than arr[3] = 7:
		arr[3] - arr[2] = 7 - 6 = 1
		arr[3] - arr[1] = 7 - 3 = 4
		arr[3] - arr[0] = 7 - 5 = 2
		There is one lower earlier reading with a lower value than arr[4] = 4:
		arr[4] - arr[1] = 4 - 3 = 1
		The maximum trailing record is arr[3] - arr[1] = 4
	 * 
	 *
	 * 
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		
		int a[]= {10, 2, 3, 7, 1, 9 };
		twoSum_TwoPointer2(a);

	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here  Algo:
	 * The max difference will the difference between highest num and lowest num
	 * 
	 * 	1. find max and its index , store in variables
		2. find min value between 0,1 which is min find
		3. Negative scenario - If max is index 0 , return -1
	 * 
	 * 
	 * 
	 */


	private static void twoSum_TwoPointer(int[] a) {
		int max=0;
		int min=Integer.MAX_VALUE;
		int maxIndex=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
				maxIndex=i;
			}
		for	(int j = 0; j <maxIndex; j++) {
			if(a[j]<min)
				min=a[j];
		}
		if(maxIndex==0) System.out.println(-1);
		else System.out.println( a[maxIndex]-min);
//		System.out.println(max);
//		System.out.println(min);
//		System.out.println(max-min);
	}
	}
		//Another method - Jotheesh bro
	
	private static void twoSum_TwoPointer2(int[] arr) {
		
//		5 -0
//		3 -1
//		6 -2
		
		//5,3,6,7,4
		int maxDif = -1;
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int lastIndex = hm.get(arr[i]);
                int diff = i - lastIndex;
                maxDif = (maxDif> diff)?maxDif:diff;
            }

            hm.put(arr[i], i);
        }
System.out.println(maxDif);
        //return maxDif;
		}
}
