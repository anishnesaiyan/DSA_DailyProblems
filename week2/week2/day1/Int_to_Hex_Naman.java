package week2.day1;

public class Int_to_Hex_Naman {
	
	/*Pseudocode for number to Hexa-decimal

		For positive Numbers
			  Find the fraction
			  Say number is = 47
			  number %16 = 15 which is F
			  number = number/16 = 2 (Repeat till number is > 0)
			  output - 2F
		For Negative Numbers
		// Step 1
		  Convert the no to binary
		    Use the same code above, just instead of 16 use 2
		
		// Step 2
		  Find 2's complement to the number
		    Add 0s before the number to make the number of length 32
		    Find One's complement
		        Replace all 1 with 0 and 0 with 1
		    Add 1 to the One's Complement
		
		// Step 3
		  Calculate the hexadecimal value
		    Split the 32 bits in pair of 4s
		    Say if the bits are 1111 then hex will be 1*2^3 + 1*2^2 + 1*2^1 + 1*2^0 = 15 = F
    
*/
	public static void main(String[] args) {
		int no=-47;
		if(no>0)
			System.out.println(convertPositiveNo(no,16));
		else
			System.out.println(convertNegativeNo(no));

	}

	
	private static String convertPositiveNo(int no, int base) {
		
		String output="";
		while(no>0) {
			int remainder= no%base;
			output=getHex(remainder)+output;
			no=no/base;
		}
		return output;
	}

	private static String getHex(int remainder) {
		switch(remainder)
		{
		case 10: return "A";
		case 11: return "B";
		case 12: return "C";
		case 13: return "D";
		case 14: return "E";
		case 15: return "F";
		default: return remainder+"";
		}
	}

	private static String convertNegativeNo(int no) {
		// Convert to positive number
		no=no*-1;
		//Step1: Convert to binary
		String binary= convertPositiveNo(no,2);
		// Step 2: Find two's complement
		String twoComp= twosComp(binary);
		// Step 3: convert to hex
		String output= convertHex(twoComp);
		return output;
	}

	private static String twosComp(String binary) {
		// Step 1: Convert the binary number into 32 bit long by adding zero's
		for(int i=binary.length();i<32;i++) {
			binary="0"+binary;
		}
		
		// Ste 2:  Find One's complement
        			//1.Replace all 1 with 0 and 0 with 1
					//2. Add 1 to the One's Complement
		//1.Replace all 1 with 0 and 0 with 1
		String onesComp="";
		for(int i=0;i<binary.length();i++) {
			if(binary.charAt(i)=='0'){
				onesComp=onesComp+"1";
			}
			else
				onesComp=onesComp+"0";
			}
		//2. Add 1 to the One's Complement
		boolean carry=true;
		String output="";
		for (int i = onesComp.length(); i >= 0; i--) {
			
			if(!carry) {
				output=onesComp.charAt(i)+output;
			}
			else if(carry && onesComp.charAt(i)=='0') {
				output='1'+output;
				carry=false;
			}
			else {
				output='0'+output;
			}
			
		}
		if(carry) {
			output='1'+output;
		}
		return output;
	}
	private static String convertHex(String twoComp) {
		String output="";
		for (int i = 0; i < twoComp.length(); i+=4) {
			int sum=0;
		
		for (int j = 0,pow=3; j <=3; j++,pow--) {
			if(twoComp.charAt(i+j)=='1') {
				sum=(int) (sum + Math.pow(2,pow));
			}
			
		}
		output=output+getHex(sum);
			
		}
		return output;
	}
	
}
