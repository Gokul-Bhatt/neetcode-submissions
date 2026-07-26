class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        helper(nums,ans,temp,0);
        return ans;
    }

    private void helper(int[] nums, List<List<Integer>> ans, ArrayList<Integer> temp, int i){
        if( i>= nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        helper(nums, ans, temp, i+1);
        temp.remove(temp.size() - 1);
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }
        helper(nums,ans,temp,i+1);
    }

}