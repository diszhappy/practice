package in.diszhappy.lc;

public class LC1480RunningSum {

	public static void main(String[] args) {
		

	}
	
	public int[] runningSum(int[] nums) {
        int length = nums.length;
        int ret[] = new int[length];
        ret[0] = nums[0];
        for(int i = 1; i< length ; i++){
            ret[i] = ret[i-1]+nums[i];
        }
        return ret;
    }

}
