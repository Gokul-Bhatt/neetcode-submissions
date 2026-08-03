class Solution {
    int n;
    int[] dp;
    private int solve(int[] stone, int i){
        if(i >= n) return 0;
        if(dp[i] != -1)
        return dp[i];
        int res = stone[i] - solve(stone, i+1);
        if(i+1 < n)
        res = Math.max(res,stone[i] + stone[i+1] - solve(stone, i+2));
        if(i+2 < n)
        res = Math.max(res, stone[i] + stone[i+1] + stone[i+2] - solve(stone, i+3));
        return dp[i] = res;
    }
    public String stoneGameIII(int[] stoneValue) {
        n = stoneValue.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        int diff = solve(stoneValue, 0);

        if(diff < 0) return "Bob";
        else if(diff > 0) return "Alice";
        return "Tie";
    }
}