class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0) return false;
        Arrays.sort(nums);
        int temp = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == temp){
                return true;
            }else{
                temp = nums[i];
            }
        }
        return false;
    }
}