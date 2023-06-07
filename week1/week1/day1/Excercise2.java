package week1.day1;

import java.util.Arrays;

public class Excercise2 {

	public static void main(String[] args) {
		// Write pgm to insert a new element in the existing sorted array
		int a[]= {1,2,3,4,5,6,8};
		int insert=7;
		int[] op= new int[a.length+1];
		
		int i = 0;
		for (; i < a.length; i++) {
			if(a[i]<insert) {
				op[i]=a[i];
			}
			else break;
		}
		op[i]=insert;
		for (; i < a.length; i++) {
			op[i+1]=a[i];
			
		}
		
		System.out.println(Arrays.toString(op));

	}

}
