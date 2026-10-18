class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] output = new int[n];

        int leftpro = 1;
        for(int i=0; i<n; i++){
            output[i] = leftpro;
            leftpro *= nums[i];
        }

        int rightpro = 1;
        for(int i = n-1; i>=0; i--){
            output[i] *= rightpro;
            rightpro *= nums[i];
        }

        return output;
    }
}  
