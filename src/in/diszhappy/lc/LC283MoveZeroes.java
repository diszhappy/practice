package in.diszhappy.lc;

public class LC283MoveZeroes {

	public static void main(String[] args) {
		int arr[] = {0,1,0,3,12};
		moveZeroes(arr);

	}

	public static void moveZeroes(int[] nums) {
		int zeroCount = 0;
		
		for(int index = 0; index< nums.length; index++) {
			if(nums[index] == 0) {
				zeroCount++;
			}
		}
		int maxShift = zeroCount;
		for(int index = 0; index< nums.length; index++) {
			if(nums[index] == 0) {
				maxShift --;
			}
			if (maxShift > 0)
			nums[index] = nums[index+(zeroCount-maxShift)];
			else 
				nums[index] = 0;
		}
		for (int i:nums) {
			System.out.printf(i+ " ");
		}

	}

}
