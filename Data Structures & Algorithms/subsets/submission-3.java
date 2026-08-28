class Solution {
    private void solve(int[] nums, List<List<Integer>> res, ArrayList<Integer> temp, int i){
        
        if(i >= nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        solve(nums, res, temp,i+1);
        temp.remove(temp.size() - 1);   
        solve(nums, res, temp,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();      
        ArrayList<Integer> temp = new ArrayList<>();
        solve(nums, res, temp,0);
        return res;
    }
}
