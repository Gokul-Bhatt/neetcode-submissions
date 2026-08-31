class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0; i<=n; i++){
            ans = ans+i;
        }
        int res = 0;
        for(int i=0; i<nums.length; i++){
            res = res+nums[i];
        }

        return ans - res;
    }
}
