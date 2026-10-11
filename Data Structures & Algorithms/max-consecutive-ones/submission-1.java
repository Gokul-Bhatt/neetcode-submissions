class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0;
        int res = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                curr++;
            }else if(nums[i] == 0){
                res = Math.max(res, curr);
                curr = 0;
            }
        }

        res = Math.max(res, curr);
        return res;
    }
}