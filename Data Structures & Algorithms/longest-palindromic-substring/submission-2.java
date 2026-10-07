class Solution {
    int [][] dp = new int[1001][1001];
    int solve(int i, int j, String s){
        if(i >= j){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i) == s.charAt(j)){
            return dp[i][j] = solve(i+1, j-1, s);
        }
        return dp[i][j] = 0;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        for(int []row : dp){
            Arrays.fill(row,-1);
        }
        int len = Integer.MIN_VALUE;
        int sp = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(solve(i,j,s) == 1){
                    if(j-i+1 > len){
                        len = j-i+1;
                        sp = i;
                    }
                }
            }
        }
        return s.substring(sp, sp + len);
    }


}