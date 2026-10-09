class Solution {
    int[][] dp = new int[1001][1001];
    private int solve(String s, String t, int n, int m) {
        if (m == 0) {
            return dp[n][m] = 1;
        }
        if (n == 0) {
            return dp[n][m] = 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (s.charAt(n - 1) == t.charAt(m - 1)) {
            return dp[n][m] = solve(s, t, n - 1, m - 1) + solve(s, t, n-1 ,m);
        } else { 
            return dp[n][m] = solve(s, t, n-1, m );
        }
    }
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(s, t, n, m);
    }
}