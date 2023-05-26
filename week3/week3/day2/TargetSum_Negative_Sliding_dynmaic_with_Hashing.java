package week3.day2;

import java.util.HashMap;

public class TargetSum_Negative_Sliding_dynmaic_with_Hashing {
/*
 * Given an array with +ve and -ve nos, print the consecutive elements that add up to a given sum
 * 
 * */
	public static void main(String[] args) {
		
		int a[]= {10,15,-5,15,-10,0};
		int k=5;
		int sum=0;
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			if(hm.containsKey(sum-k)) {
				for(int j=hm.get(sum-k)+1;j<=i; j++)
				{
					//System.out.print(hm.getKey(j));
				}
				break;			 
			}
			hm.put(sum, i);
		}

	}

}
