package assessment_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ProjectEstimates_2 {
	/*
	 * Question - 2
		Project Estimates
	 * A number of bids are being taken for a project. Determine the number
		of distinct pairs of project costs where their absolute difference is some target value. Two pairs are distinct if they differ in at least one
		value.
		
		Example
		n = 3
		projectCosts = [1, 3, 5]
		target= 2
		There are 2 pairs [1,3], [3,5] that have the target difference target = 2,
		therefore a value of 2 is returned.
	 * 
	 */
	@Test // + ive
	public void example1() {
		
		ArrayList<Integer> ls= new ArrayList<>();
		ls.add(1);
		ls.add(3);
		ls.add(5);
		int target=2;
		projectEstimates(ls,target);
	}

	@Test // Edge Case
	public void example2() {
		
		ArrayList<Integer> ls= new ArrayList<>();
		ls.add(1);
		ls.add(5);
		ls.add(3);
		ls.add(4);
		ls.add(2);
		int target=2;
		projectEstimates(ls,target);
	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
	 * 1. Store the given list items in an Hashset
	 * 2. Then pick each values in the list add with the target
	 * 3. Check the added value is available in Hashset then increase the counter
	 * 4. Finally return the count
	 * 
	 * 
	 */
	public static void projectEstimates(List<Integer> ls,int target) {

		HashSet<Integer> hs= new HashSet<>();
		hs.addAll(ls);
		int count=0;
		for (int i = 0; i < ls.size(); i++) {
			if(hs.contains(ls.get(i)+target)) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}
	
	//Another method by jotheesh bro
	public static int pairsPrj(int[] ProjectCosts, int target) {
		
        int count = 0;
        Map<Integer, Integer> hm = new HashMap<>();

        for (int cost : ProjectCosts) {
            int cost1 = cost - target;
            int cost2 = cost + target;

            count += (hm.get(cost1)!=null)?hm.get(cost1):0;
            count +=(hm.get(cost2)!=null)?hm.get(cost2):0;

            //hm.put(cost, ((hm.get(cost, 0)!=null)?hm.get(cost):0) + 1);
        }

        return count;
    }

	
}
