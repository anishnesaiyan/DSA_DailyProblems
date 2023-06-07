package week1.day1;

public class Excercise_1 {

	public static void main(String[] args) {
		//Write a pgm  to find the number of distinct numbers in a sorted array, Find the complexit of the code
		
		/* Algo:
		 * 1. Comapre i and i+1 value
		 * 		if not equal print i else increment i
		 * 2. Print the last value seperatley
		 * 3. Handle array with one element
		 * 				array with null
		 * 				array without any value
		 * */
		
		int [] arr= {1,2,3,4,4,4,5,5};
		if(arr==null|| arr.length==0) {
			System.out.println("Empty or null array");
		}
		else {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				System.out.print(arr[i]);
			}
		}
		System.out.print(arr[arr.length-1]);

	}}

}
