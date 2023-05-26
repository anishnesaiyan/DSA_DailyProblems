package week5.day1;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int a[]= {11,4,17,18,2,22,1,8};
		
		//Pivot will starts from 1
		for (int i = 1; i < a.length; i++) {
			//To loop to the left end
			int j=i;
			//Ascending
			//For descending change < as >
			while(j>=1 && a[j]<a[j-1]) {
				
				//swap
				a[j]=a[j]+a[j-1]-(a[j-1]=a[j]);
				//a=a+b-(b=a)
				j--;
			}
		}

		System.out.println(Arrays.toString(a));
	}

}
