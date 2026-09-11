class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dup = new HashSet<>();
        for(int n : nums){
            dup.add(n);
        }

        if(dup.size() == nums.length) return false;
        return true;
    }
}