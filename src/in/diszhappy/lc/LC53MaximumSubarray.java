package in.diszhappy.lc;

public class LC53MaximumSubarray {

	public static void main(String[] args) {
		int input[] = {-1, -1000000} ;
		System.out.println(maxSubArray(input));
		
	}

	public static int maxSubArray(int[] nums) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int index = 0;index< nums.length; index++) {
			
			currSum += nums[index];	
			currSum = Math.max(nums[index], currSum);
			maxSum = Math.max(maxSum, currSum);
		}
		
		return maxSum;
	}

}
