package week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class BubbleSort {
/* 1.Create a outer loop runs for 
 * 2. Create a inner loop runs for lenght -i value
 * 3. 
 * 
 * */
	public static void main(String[] args) {
		int a[]= {11,4,17,18,2,22,1,8};
		
		//If no swap happens we can directly print the output
		boolean noswap=false;
		for (int i = 0; i < a.length; i++) {
			
			
			// Looping before the sorted element as after each iteration last element will be sorted
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]<a[j+1])
					continue;
				else {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					//Swap in single line without third variable
					//a[j]=(a[j]+a[j+1])-(a[j+1]=a[j]);
					noswap=true;
					}
			}
			if(!noswap)break;
			
		}
		System.out.println(Arrays.toString(a));

	}

}
