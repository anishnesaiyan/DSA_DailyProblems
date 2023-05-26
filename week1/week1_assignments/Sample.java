package week1_assignments;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
	
		//int a[]= {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		   // System.out.println(Arrays.toString(plusOne(a)));
		int b='F';
		    System.out.println(b);
		    
		}
	
	public static int[] plusOne(int[] digits) {
        
        // Reverse iteration of the array
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else
                digits[i] = 0;
        }

        // The array has only '9'
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }

	}


