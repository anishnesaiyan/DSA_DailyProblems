package mentor;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ArraysRotation {
	/*
	 * Your Question here
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
//		int arr[]= {39356, 87674, 16667, 54260, 43958 ,70429 ,53682, 6169 ,87496 ,66190 ,90286, 4912, 44792, 65142,
//				36183, 43856 ,77633, 38902, 1407 ,88185, 80399, 72940,97555, 23941,
//				96271, 49288, 27021, 32032, 75662 ,69161, 33581, 15017, 56835, 66599, 69277, 17144
//				,37027, 39310, 23312, 24523, 5499, 13597, 45786, 66642, 95090, 98320 ,26849, 72722, 
//				37221, 28255, 60906};
//		
//		
		List<Integer> a= new ArrayList<Integer>();
//		for(Integer add:arr) {
//			a.add(add);
//		}
		//System.out.println(a.size());
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
//		a.add(8);
//		a.add(9);
		List<Integer> b= new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		//b.add(3);
		System.out.println(circularArrayRotation(a,3,b));

	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 1. Brute force
	 * 1. Find the point from where we need to rotate using lenght-k Sometimes k might greater than arrays size so do modulous of k with array length;
	 * 2. Create a for loop from that index and add it to result array
	 * 3. then create another loop satrts from zero and runs before the index
	 * 4. To get the values use another loop and update the same array list 
	 * 
	 */
	   public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		   
		   List<Integer> op= new ArrayList<>();	   
		   int length=a.size();
		   k=k%length;
		   	System.out.println(a);
		    //Add the rotation values first 
		    for(int i=length-k;i<a.size(); i++){
		        op.add(a.get(i));
		    }
		    
		    // Add the remaining values
		    for(int i=0;i<length-k;i++) {
		    	op.add(a.get(i));
		    }
		    System.out.println(op);
		    //Loop to get the output as list for the required index stored in quereis list
		    for(int i=0;i<queries.size(); i++){
		        queries.set(i,op.get(queries.get(i)));
		    }
		return queries;
		    }
	   
	   //Calvin Solution
	   
	   public static List<Integer> circularArrayRotation2(List<Integer> a, int k, List<Integer> queries) {
	        int arrLen=a.size();
	        k=k%arrLen;
	        List<Integer> out1= new ArrayList<Integer>();
	        List<Integer> out2= new ArrayList<Integer>();
	        for(int i=arrLen-k;i<arrLen;i++){
	            out1.add(a.get(i));
	        }
	        for(int i=0;i<arrLen-k;i++){
	            out1.add(a.get(i));
	        }
	        for(int i=0;i<queries.size();i++){
	           out2.add(out1.get(queries.get(i))) ;
	        }
	        return out2;
	    }
}
