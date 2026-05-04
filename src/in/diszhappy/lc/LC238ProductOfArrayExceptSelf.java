package in.diszhappy.lc;

import java.util.stream.IntStream;

public class LC238ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int input[] = {0,0};
		productExceptSelf(input);
		
	}
	
    public static int[] productExceptSelf(int[] nums) {
    	int retArr[] = new int[nums.length];
    	int zeroCount = 0;
    	int totalProd = 1;
    	for (int index = 0; index< nums.length; index++) {
    		if(nums[index] == 0) {
    			zeroCount++;
    		} else {
    			totalProd *= nums[index];
    		}
    		
    	}
    	
    	for(int index = 0; index< nums.length; index++) {
    		if(zeroCount>0) {
    			if (zeroCount > 1)
    				retArr[index] = 0 ;
    			else if (nums[index] == 0)
    				retArr[index] = totalProd;
    			else
    				retArr[index] = 0 ;
    		} else {
    			retArr[index] = totalProd/nums[index];
    		}
    	}
    	
    	IntStream.of(retArr).forEach(x -> System.out.print(" " + x));
    	
    	return retArr;
        
    }
}
