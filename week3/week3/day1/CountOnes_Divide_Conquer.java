package week3.day1;

public class CountOnes_Divide_Conquer {

	/*
	 * Given a binry sorted array , find the number of ones
	 * 
	 * eg:input nums=[0,0,0,0,1,1,1]
	 * 
	 * output: 3
	 * */
	
	public static void main(String[] args) {
		
		int nums[]= {1,1,1,1,1,1,1};
		int i=0, j=nums.length-1;
		int count=0;
		
		//If array have fully one's
		if(nums[0]==1) count=nums.length;
		
		// If array has full zeros or array has zero values
		else if(nums[nums.length-1]==0 || nums==null) count=0;
		
		else {
		while(i<j){
			
			int mid=(i+j)/2;
			
			if(nums[mid]==0 && nums[mid+1]==1 )
			{
			count=(nums.length-1)-mid;
			break;
			}
			else if(nums[mid]==1 && nums[mid-1]==0 )
			{
			count=nums.length-mid;
			break;
			}
			else if(nums[mid]==0 && nums[mid+1]==0 )
			{
			i=mid+1;
			}
			else if(nums[mid]==1 && nums[mid-1]==1 )
			{
			j=mid-1;
			}
			
			}
		}
		System.out.println(count);
		

	}

}
