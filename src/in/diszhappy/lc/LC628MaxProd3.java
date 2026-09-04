package in.diszhappy.lc;

import java.util.Arrays;

public class LC628MaxProd3 {

	public static void main(String[] args) {
		int arr[] = { -100, -98, -1, 2, 3, 4 };
		int[] x = { -710, -107, -851, 657, -14, -859, 278, -182, -749, 718, -640, 127, -930, -462, 694, 969, 143, 309,
				904, -651, 160, 451, -159, -316, 844, -60, 611, -169, -73, 721, -902, 338, -20, -890, -819, -644, 107,
				404, 150, -219, 459, -324, -385, -118, -307, 993, 202, -147, 62, -94, -976, -329, 689, 870, 532, -686,
				371, -850, -186, 87, 878, 989, -822, -350, -948, -412, 161, -88, -509, 836, -207, -60, 771, 516, -287,
				-366, -512, 509, 904, -459, 683, -563, -766, -837, -333, 93, 893, 303, 908, 532, -206, 990, 280, 826,
				-13, 115, -732, 525, -939, -787 };
		System.out.println(maximumProductBF(x));
//		System.out.println(maximumProduct(arr));

	}

	public static int maximumProductBF(int[] nums) {
		int l = nums.length;
		if (nums.length == 0) {
			return 0;
		}

		int maxProd = 1;
		if (nums.length <= 3) {
			for (int i : nums) {
				maxProd *= i;
			}
			return maxProd;
		}
		Arrays.sort(nums);

		
			return Math.max( nums[l - 1] * nums[0] * nums[1],nums[l - 1] * nums[l - 2] * nums[l - 3]);

	}

	public static int maximumProduct(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int maxProd = 1;
		if (nums.length <= 3) {
			for (int i : nums) {
				maxProd *= i;
			}
			return maxProd;
		}

		int x = Integer.MIN_VALUE, y = Integer.MIN_VALUE, z = Integer.MIN_VALUE;

		for (int i : nums) {

			if (i > x) {
				z = y;
				y = x;
				x = i;
			} else if (i > y) {
				z = y;
				y = i;
			} else if (i > z) {
				z = i;
			}

			System.out.println("i = " + " " + x + " " + " " + y + " " + z);

		}

		return x * y * z;

	}

}
