package week3.day2;

public class SubArrayAddGivenNumber_SlidingWindow_Dynamic {

	public static void main(String[] args) {
		int[] arr= {1,7,4,3,1,2,1,5,1};
		int desiredSum=3;
		int sum=0, start=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			if(chkpr(arr, start, i, sum, desiredSum)) {
				break;
			}
			else if(sum>desiredSum) {
				while(sum>desiredSum && start<=i) {
					sum=sum-arr[start];
					start++;
				}
				if(chkpr(arr, start, i, sum, desiredSum)) {
					break;
				}
			}

			
		}
	}
	
	public static boolean chkpr(int[] arr,int start, int end, int sum, int desiredSum) {
		
		if(sum==desiredSum) {
			for (int i = start; i <= end; i++) {
				System.out.print(arr[i]+", ");
			}
			return true;
			
		}
		return false;
		
	}
	

}
