package in.diszhappy.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC56MergeIntervals {

	public static void main(String[] args) {
//		int arr[][] = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
		int arr[][] = { { 1, 5 }, { 2,3 }, {4,6}};
		System.out.println(merge(arr));

	}

	public static int[][] merge(int[][] intervals) {
		
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		int[] prev = intervals[0];
		List<int[]> res = new ArrayList<int[]>();
		res.add(prev);
		for (int i = 1; i < intervals.length; i++) {
			int temp[] = intervals[i];
			if (prev[1] >= temp[0] && prev[1] < temp[1]) {
				prev[1] = temp[1];
			} 
			if(prev[1]<temp[0]) {
				prev = temp;
				res.add(prev);
			}
			
		}
		int resArray[][] = new int[res.size()][2];
		return res.toArray(resArray);
	}

}
