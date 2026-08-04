class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        int i = 0;
        int j = nums.length;

        while(i != nums.length){
            res[i] = nums[i];
            res[j] = nums[i];
            i++;
            j++;
        }

        return res;
    }
}