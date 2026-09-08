class Solution {
    private int solve(int start, int end, int[] nums){
        int prev1 = 0;
        int prev2 = 0;

        for(int i=start; i<= end; i++){
            int cur = Math.max(prev1, prev2+nums[i]);

            prev2 = prev1;
            prev1 = cur;
        }

        return prev1;
    }
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1)return nums[0];

        return Math.max(
            solve(0,n-2,nums),
            solve(1,n-1,nums)
        );
    }
}
