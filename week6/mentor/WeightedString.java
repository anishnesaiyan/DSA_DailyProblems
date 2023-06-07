package mentor;

import java.util.HashMap;
import java.util.List;

public class WeightedString {

	public static void main(String[] args) {
	String s= "abccddde";

	}
	/*
	 * 1. Store the char along the index in hashmap
	 * 2. 
	 * 
	 * 
	 * 
	 * */
	public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
		
		HashMap<Character, Integer> hs= new HashMap<>();
		HashMap<Character, Integer> hp= new HashMap<>();
		int i=1;
		for(char c= 'a' ; c <='z'; c++,i++) {
			
			hs.put(c, i);
		}
		int j=0;
		int sum=0;
		
		while(j<s.length()) {
		
			int a=hs.get(s.charAt(j));
			if(j==0) {
			sum=sum+a;}
			else if(s.charAt(j) == s.charAt(j-1)) {
				sum=sum+a;
			}
		}
		
		return null;
	    }
}
