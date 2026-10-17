class Solution {
    public int maxProfit(int[] prices) {
        int by = prices[0];

        int profit = 0;

        for(int i=1; i<prices.length; i++){
            by = Math.min(by, prices[i]);

            profit = Math.max(prices[i] - by, profit);
        }

        return profit;
    }
}
