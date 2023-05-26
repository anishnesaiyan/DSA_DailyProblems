package week3.day2;

import java.util.Arrays;

public class HighestSum_Sliding_window {

	public static void main(String[] args) {
		int[] arr= {1,5,2,3,7,1};
		int k =3;
		int maxSum=0;
		int sum=0;
		
		// To find the sum of first three elements
		for (int i = 0; i < k; i++) {
		maxSum=maxSum+arr[i];		
		}
		
		sum=maxSum;
		//To implement the sliding window logic
		for (int i = 1; i < arr.length-k; i++) {
			// removing first and adding the next
			sum=sum-arr[i-1]+arr[i+k-1];
			if(sum>maxSum) {
				maxSum=sum;		}
			
		}
		System.out.println(maxSum);

	}

}
