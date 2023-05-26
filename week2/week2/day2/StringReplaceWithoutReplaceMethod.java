package week2.day2;

import java.util.Arrays;

public class StringReplaceWithoutReplaceMethod {

	/*Given a valid IP address, return a defanged version of that IP address.
		A defanged IP address replaces every period "." with "[.]".
		Do Not Use the replaceAll()
		Example 1:
		Input: address = "1.1.1.1"
		Output: "1[.]1[.]1[.]1"
*/
	public static void main(String[] args) {
	
		String s="1.1.1.1";
		
		String newString="";
		for(int i=0; i<s.length();i++) {
		if(s.charAt(i)=='.') 
			newString=newString+"[.]";
		else 
			newString=newString+s.charAt(i);
		}
		System.out.println(newString);	
		}
	
}


