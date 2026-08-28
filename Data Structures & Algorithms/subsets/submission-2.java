class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        helper(0,ans,temp,nums);
        return ans;
    }

    private void helper(int i, List<List<Integer>> ans, ArrayList<Integer> temp, int[] nums){
            if(i >= nums.length){
                ans.add(new ArrayList<>(temp));
                return;
            }

            temp.add(nums[i]);
            helper(i+1,ans,temp,nums);
            temp.remove(temp.size() - 1);
            helper(i+1,ans,temp,nums);
    }
}
