package week2.day2;

public class WordSwap {
	
	/*Pseudocode
	 * Split the String with spaces
	 * Loop thrice based based on array length
	 * put in a loop pass the string and read in reverse and add it to a value
	 * 
	 * 
	 * *faeltseT oT emocleW
	 */

	public static void main(String[] args) {
		//anotherMethod();
		String s="Welcome To Testleaf";
		String[] splitted=s.split(" ");
		String output="";
		for(int i=0; i<splitted.length;i++) {
			output=output+reverseword(splitted[i])+" ";
		}
		System.out.println(output.trim());	
	}
	static String reverseword(String s){
		String S2="";
		for (int i = s.length()-1; i >=0; i--) {
			S2=S2+s.charAt(i);
		}
		return S2;
	}
	
	// Another method using String Buffer/Builder
	static void anotherMethod() {
		String s="Welcome To Testleaf";
		String output="";
		StringBuilder sb= new StringBuilder(s);
		String s1[]=sb.reverse().toString().split(" ");
		
		for(int i=s1.length-1; i>=0;i--) {
			output=output+s1[i]+" ";
		}
		System.out.println(output.trim());
		
	}
	
}
