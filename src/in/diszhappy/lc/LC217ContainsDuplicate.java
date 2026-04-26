package in.diszhappy.lc;

import java.util.HashSet;
import java.util.Set;

public class LC217ContainsDuplicate {
	public static void main(String[] args) {
		
	}
	public boolean containsDuplicate(int[] nums) {
        Set<Integer> tmp = new HashSet<>();
        for(int i:nums){
            if (!tmp.add(i))
                return true;
        }
        return false;
    }

}
