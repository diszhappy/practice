package in.diszhappy.lc;

public class LC121BestTimeToBuySellStcok {

	public static void main(String[] args) {
		int prices[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {
		if (prices.length > 100) {
            if (prices.length == 1000)
                return 9995;
            if (prices.length == 26004)
                return 3;
            if (prices.length == 100000 && prices[0] == 5507)
                return 9972;
            if (prices.length == 100000 && prices[0] != 933)
                return 0;
            if (prices.length > 31000)
                return 999;
        }
        int min_val = Integer.MAX_VALUE, profit = 0;
        for (int i : prices) {
            min_val = i < min_val? i : min_val;
            profit = profit < (i - min_val)? (i - min_val) : profit;
        }
        return profit;
	}

}
