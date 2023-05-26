package week3.day1;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int a[]= {1,3,5,7,9};
		int b[]= {2,8};
		int output[] = new int[a.length+b.length];
		int c=0;
		int i=0,j=0;
		while(c<output.length)
		{
			if(a[i]<b[j]) {
				output[c]=a[i];
				if(i<a.length-1) i++;
				}
			else if(a[i]>b[j]) {
				output[c]=b[j];
				if(j<b.length-1) j++;}
			else if(a[i]==b[j]) {
				output[c]=a[i];
				output[c+1]=b[j];
				if(i<a.length-1) i++;
				if(j<b.length-1) j++;}
				
			c++;			
		}
		System.out.println(Arrays.toString(output));
	}

}
