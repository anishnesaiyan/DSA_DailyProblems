package week3.assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class ClassWork_1 {
	/*
	 * Your Question here
	 * I will be giivng two arrays, return a boolean
		going to check both the arrays contain same elements
	 * eg: a -> 1,2,3 , b -> 1,2,3,1,2  ==> true
	 * eg: a -> 1,2,3,4 , b -> 1,2,3,1,2  ==> false
	 * 
	 */
	@Test // + ive
	public void example1() {
		int a[]= {1,2,3,1,4};
		int b[]= {3,2,1,1};
		twoSum_BruteForce(a,b);
	}

	@Test // Edge Case
	public void example2() {
		int a[]= {1,1,1,1};
		int b[]= {1,1,1,1,1};
		twoSum_BruteForce(a,b);
	}

	@Test // negative
	public void example3() {
		int a[]= {};
		int b[]= {1,1,1,1,1};
		twoSum_BruteForce(a,b);
		
	}

	/*
	 * Pseduo code here 1. Brute force
	 * 1. Remove duplicates from an array by adding it to set
	 * 2. Then add set values to list
	 * 3. Compare both the list are equal
	 * 
	 * 
	 * 
	 */
	private void twoSum_BruteForce(int a[], int b[]) {
		
		if(a.length<1 || b.length<1) {
			
			System.out.println("invalid inputs");
		}
			
		else {
		//	
		Set<Integer> sa= new TreeSet<Integer>();

		Set<Integer> sb= new TreeSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			sa.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			sb.add(b[i]);
		}
		List<Integer> ls= new ArrayList<Integer>();
		ls.addAll(sa);
		
		List<Integer> ll= new ArrayList<Integer>();
		ll.addAll(sb);
		
		System.out.println(ls.equals(ll));
		System.out.println(ls.toString());
		System.out.println(ll.toString());
		}
	}

	private void twoSum_TwoPointer() {

	}
}
