class Solution {

    int solve(int[] nums, int target,int start,int end){
        if(start > end) return -1;
            int mid = start+(end-start) / 2;

            if(nums[mid] == target) return mid;
            else if(target < nums[mid]){
                return solve(nums,target,start,mid-1);       
            }else if(target > nums[mid]){
                return solve(nums,target,mid+1,end);
        }

        return -1;
    }
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        return solve(nums,target,start,end);
    }
}
