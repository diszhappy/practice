package in.diszhappy.lc;

import java.util.HashMap;
import java.util.Map;

public class LC1TwoSum {
	
	public static void main(String[] args) {
		
	}
	
	public static int[] twoSum_BruteForce(int[] nums, int target) {
        int arr[] = new int[2];
        for (int i = 0; i< nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                
                if(nums[i]+nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
	
	public static int[] twoSum_HashMpa(int[] nums, int target) {
        int arr[] = new int[2];
        Map<Integer, Integer> tmp = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            int rem = target - nums[i];
            if(tmp.get(rem) == null) {
            	tmp.put(nums[i],i);
            } else {
            	arr[0] = i;
            	arr[1] = tmp.get(rem);
            }
        }
        return arr;
    }

}
