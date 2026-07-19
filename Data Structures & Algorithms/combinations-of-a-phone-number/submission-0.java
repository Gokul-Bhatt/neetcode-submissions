class Solution {
      String[] alpha = {
    "", "", "abc", "def", "ghi",
    "jkl", "mno", "pqrs", "tuv", "wxyz"
};
    public List<String> letterCombinations(String digits) {
        List<String> ans  = new ArrayList<>();
        if(digits.isEmpty()) return ans;
        helper(digits, ans, new StringBuilder(), 0);
        return ans;
    }

    private void helper(String digit, List<String> ans, StringBuilder res, int i ){
            if(i == digit.length()){
                ans.add(res.toString());
                return;
            }

           String letter = alpha[digit.charAt(i) - '0'];
           for(int j=0; j<letter.length(); j++){
                 res.append(letter.charAt(j));
                helper(digit,ans,res,i+1);
                res.deleteCharAt(res.length()-1);
           } 
    }
}
