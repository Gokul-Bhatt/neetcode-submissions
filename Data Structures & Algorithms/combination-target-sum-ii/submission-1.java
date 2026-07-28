class Solution {

    private void helper(int[] candidates, int target, List<List<Integer>> res,List<Integer> temp,int i) {
    if (target == 0) {
        res.add(new ArrayList<>(temp));
        return;
    }
    if (i == candidates.length || target < 0) {
        return;
    }
    temp.add(candidates[i]);
    helper(candidates, target - candidates[i], res, temp, i + 1);
    temp.remove(temp.size() - 1);
    int next = i + 1;
    while (next < candidates.length && candidates[next] == candidates[i]) {
        next++;
    }
    helper(candidates, target, res, temp, next);
}

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> res = new ArrayList<>();
       Arrays.sort(candidates);
      helper(candidates, target, res,new ArrayList<>(), 0);
      return res;
    }

}
