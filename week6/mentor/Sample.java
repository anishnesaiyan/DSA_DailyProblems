package mentor;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Sample {

	public static void main(String[] args) {
		ArrayList<Integer> ls= new ArrayList<Integer>();
		ls.add(1);
		ls.add(3);
		ls.add(3);
		ls.add(3);
		ls.add(2);
		//System.out.println(maxTrailing(ls));
		System.out.println(equalizeArray(ls));
	}
	
	public static int maxTrailing(ArrayList<Integer> arr) {
	    // Write your code here
		if(arr.size()==1) return -1;
	        int max=0;
	        for (int i = 1; i < arr.size(); i++) {
	           int k=0;
	           while(k<i){

	               if(arr.get(i)>arr.get(k)){
	                   int diff=arr.get(i)-arr.get(k);
	                   if(diff>max) {max=diff;}
	               }
	               k++;
	               
	           }
	        }
	        if(max==0) {return -1;}
	        else return max;
	    }
	public static int equalizeArray(ArrayList<Integer> arr) {
	    
	    HashMap<Integer,Integer> hs= new HashMap<Integer, Integer>();
	    for (int i = 0; i < arr.size(); i++) {
	        
	        if(hs.containsKey(arr.get(i))) hs.put(arr.get(i), hs.get(arr.get(i))+1);
	        else hs.put(arr.get(i), 1);
	        
	    }
	    int max=0;
	    for(int a: hs.values()) {
	    	if(a>max) max= a;
	    }
	    return arr.size()-max;
	    }

}
