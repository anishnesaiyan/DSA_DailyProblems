package classroom;

import java.util.Arrays;

public class HackerRank_arrayRotation {
	
	
//https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Algo
		//Create a loop and get the d value
		int arr[]= {1,2,3,4,5};
		int arr2[]= new int[arr.length];
		int d=3%arr.length;
		int k= arr.length-d;
		int j=0;
		for(int i=0; i<arr.length;i++) {
			
			if(k<arr.length) {
				arr2[i]=arr[k];
				k++;
				
			}
			else {
				arr2[i]=arr[j];
				j++;
			}
			
		}
		System.out.println(Arrays.toString(arr2));
	}

}
