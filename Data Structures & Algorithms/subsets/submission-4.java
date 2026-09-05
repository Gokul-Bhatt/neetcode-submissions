class Solution {
    private void solve(int[] nums,  List<List<Integer>> res, List<Integer> ans, int i){
        if(i >= nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        solve(nums, res, ans, i+1);
        ans.remove(ans.size() - 1);
        solve(nums,res,ans,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        solve(nums, res, ans,0);
        return res;
    }
}
