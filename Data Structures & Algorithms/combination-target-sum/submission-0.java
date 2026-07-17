class Solution {
   private void helper(int i, List<List<Integer>> ans, int [] arr, int target, List<Integer> ds){
    if(i == arr.length){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
        }
        return;
    }

    if(arr[i] <= target){
        ds.add(arr[i]);
        helper(i,ans,arr,target-arr[i],ds);
        ds.remove(ds.size() - 1);
    }
    helper(i+1,ans,arr,target,ds);
   }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,ans,nums,target,new ArrayList<>());
        return ans;
    }
}
