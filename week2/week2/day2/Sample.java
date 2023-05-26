package week2.day2;

public class Sample {

	public static void main(String[] args) {
	String s="abc";
	StringBuilder sb= new StringBuilder(s);
	
	//System.out.println(sb.charAt(0));
	sb.setCharAt(2,'C');
	System.out.println(sb);
	//sb.charAt(0);
	}

}
