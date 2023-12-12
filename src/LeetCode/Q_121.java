package LeetCode;

public class Q_121 {
        public static int maxProfit(int[] prices) {
            int leastPrice = prices[0];
            int currentProfit = 0;
            int overalProfit = 0;
            for (int i = 0; i < prices.length; i++) {
                if (leastPrice > prices[i])
                    leastPrice = prices[i];
                currentProfit = prices[i] - leastPrice;
                if (overalProfit < currentProfit)
                    overalProfit = currentProfit;
            }
            return overalProfit;
        }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2}));
    }
}
