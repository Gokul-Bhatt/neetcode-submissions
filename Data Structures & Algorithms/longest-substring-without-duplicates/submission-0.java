class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int i = 0;
        int j = 0;
        int res = 0;

        while(j < n){
            map.put(s.charAt(j) , map.getOrDefault(s.charAt(j), 0) + 1);
            
            while(map.get(s.charAt(j)) > 1){
                map.put(s.charAt(i),map.get(s.charAt(i)) - 1 );
                i++;
            }

            res = Math.max(res , j-i+1);
            j++;
        }

        return res;
    }
}
