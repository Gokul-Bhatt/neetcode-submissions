class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n-1;
        int maxwater = 0;
        while(i < j){
            int h = Math.min(heights[i] , heights[j]);
            int w = j - i;

            int area = h * w;
            maxwater = Math.max(maxwater, area);

            if(heights[i] > heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxwater;
    }
}
