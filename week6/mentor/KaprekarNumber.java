package mentor;

public class KaprekarNumber {
	
	//https://www.hackerrank.com/challenges/kaprekar-numbers/problem?isFullScreen=true
	public static void main(String[] args) {


		kaprekarNumbers2(1, 99999);
		
		kaprekarNumbers2(400, 700);
	}

	/**
	 * Algo: 
	 * 1. Square the number
	 * 2. Convert the squared number into string
	 * 3. Get the length of the string and divide into two (if squared is 123 --> s1 =1 s2=23/// If squared = 1234 , s1=12, s2=34]
	 * 4. Using substring function divide the given numbers into two
	 * 5. Using regex remove the leading zeros
	 * 6. Sometimes after removing zeros there will be any numbers in the string, so update that value as zero
	 * 7. Then finally add compare
	 **/
	public static void kaprekarNumbers2(long p, long q) {

		int a1 = 0, a2 = 0;
		//Flag will get true if the given range has atleast one kaprekarNumbers
		//Else return as invalid
		boolean flag=false;
		while (p <= q) {

			long squared = p * p;
			String s = String.valueOf(squared);
			int split = s.length()/2;

			String s1 = s.substring(0, split);
			String s2 = s.substring(split);
			
			String strPattern = "^0+(?!$)";
			
			s1 = s1.replaceAll(strPattern, "");
			s2 = s2.replaceAll(strPattern, "");

			if (s1.length() == 0)
				a1 = 0;
			else
				a1 = Integer.parseInt(s1);

			if (s2.length() == 0)
				a2 = 0;
			else
				a2 = Integer.parseInt(s2);

			if (a1 + a2 == p) {
				System.out.print(p + " ");
				flag=true;
			}
			p++;

		}
		if(!flag) {System.out.println("INVALID RANGE");}
	}
}
