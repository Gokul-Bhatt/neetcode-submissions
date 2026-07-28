class Solution {

    private void helper(int[] dp, int[] cost){
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2; i<cost.length; i++){
            dp[i] =  cost[i] + Math.min( dp[i-1] ,dp[i-2]);
        }
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        helper(dp, cost);
        return Math.min(dp[n-2], dp[n-1]);
    }
}
