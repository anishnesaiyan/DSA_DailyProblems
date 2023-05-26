package week2.day1;

public class FindNumbersPresent {

	
//	Write a program to find if 2 numbers are present in an array
//	Ex1: [1,2,3,4,5], 2, 4      Output: true
//	Ex2: [1,2,3,4,5], 2, 6      Output: false
	
	
	public static void main(String[] args) {
	int [] a= {1,2,3,4,5};
	System.out.println(findNos(a,2,4));
	System.out.println(findNos2(a,2,4));
	}

	
	public static boolean findNos (int []arr, int x, int y) {
		boolean xflag=false, yflag=false;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == x)  xflag=true;
	        
	        else if(arr[i] == y) yflag=true;
	        
	        }
	    if(xflag==true && yflag==true) return true;
	    return false;
	    
	  //Ipdiyum ezhuthalam
	 	   // return xflag && yflag
	    
	}
	
	// One more way - Conditon inside for loop ( if flag is false the only it comes inside loop
	    public static boolean findNos2 (int []arr, int x, int y) {
	    
	    boolean flagX = false, flagY = false;
        for (int i = 0; ( i < arr.length && !flagX&& !flagY); i++) {
            if (arr[i] == x) flagX = true;
            if(arr[i] == y) flagY = true;
        }
        return flagX&&flagY;
	  
}
	}
	
