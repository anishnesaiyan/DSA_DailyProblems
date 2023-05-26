package week2.day2;

import java.util.Arrays;

public class VowelSwap_TwoPointer {
	/*Given an input String s. Swap the vowels in the input
		Example:
		Input - "Hello Everyone! Welcome to Testleaf"
		Output - "Halle evoryeno! Welcemo te TEstloef"
		
		
		psedocode:
		1. Convert String inot char array using function toCharArray()
		2. Make the pointers at start and end index of array
		3. If char at p1 index is vowel and char at p2 is alos a vowel them swap and increment P1 and decrement p2
		4. if char at p1 is not vowel increment P1
		5. if char at p2 is alos not vowel increment p2
*/

	public static void main(String[] args) {
		
		String s= "Hello Everyone! Welcome to Testleaf";
		char ch[]=s.toCharArray();
		int p1=0;
		int p2=ch.length-1;
		while(p1!=p2) {
			if(vowelCheck(ch[p1]) && vowelCheck(ch[p2])){
				char temp;
				temp=ch[p1];
				ch[p1]=ch[p2];
				ch[p2]=temp;
				p1++;
				p2--;
			}
			else if(!vowelCheck(ch[p1]))
					p1++;
			else if(!vowelCheck(ch[p2]))
				p2--; 
		}
		System.out.println(Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", ""));

	}
	
	static boolean vowelCheck(char c) {
		
		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
			return true;
		
		return false;
	}

}
