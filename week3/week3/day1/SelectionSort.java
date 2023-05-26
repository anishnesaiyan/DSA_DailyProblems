package week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class SelectionSort {

	public static void main(String[] args) {
	/*Algo
	 * 1. Take the pivot
	 * 2. Find the lowest in the array
	 * 3. Swap with the lowest
	 * 4. Continue step 2 and 3 for next pivot
	 * (after each iteration the pivot will get the sorted elements)
	 * 
	 * */
		int arr[]= {11,4,17,18,2,22,1,8};
		
		for (int i = 0; i < arr.length-1; i++) {
			int minloc=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[minloc]>arr[j]) {
					minloc=j;
				}
			}
			//Swap
			arr[minloc]= (arr[minloc]+arr[i])- (arr[i]=arr[minloc]);
		}
		System.out.println(Arrays.toString(arr));

	}

}
