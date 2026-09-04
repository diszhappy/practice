package in.diszhappy.lc;

public class LC26RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,3,3,4};
		System.out.println(removeDuplicates(arr));
	}

	public static int removeDuplicates(int[] nums) {
		int counter = 1;
		int prev = nums[0];
		for(int i=1;i<nums.length;i++) {
			if(prev!=nums[i]) {
				nums[counter] = nums[i];
				counter++;
				
			}
			prev = nums[i];
		}

		return counter;
	}

}
