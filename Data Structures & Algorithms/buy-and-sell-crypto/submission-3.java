class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // int[] dp = new int[n];

        // dp[0] = 0;
        int maxprice = 0;
        int minprice = prices[0];

        for(int i=1; i<n; i++){
            minprice = Math.min(minprice, prices[i]);

            maxprice = Math.max(maxprice, prices[i] - minprice);
        }

        return maxprice;
    }
}
