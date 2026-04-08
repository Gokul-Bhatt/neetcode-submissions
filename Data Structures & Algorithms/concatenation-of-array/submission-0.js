class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    getConcatenation(nums) {
        if(!nums.length) return [];
        let n = nums.length;
        let res = [n*2];
        for(let i=0; i<n; i++){
            res[i] = nums[i];
            res[n+i] = nums[i];
        }
        return res;
    }
}
