class Solution {
    List<String> res = new ArrayList<>();
    void solve(int open, int close, int n, StringBuilder str){
        if(str.length() == n*2){
            res.add(str.toString());
            return;
        }

        if(open > 0){
            str.append('(');
            solve(open-1, close, n, str);
            str.deleteCharAt(str.length()-1);
        }

        if(close > open){
            str.append(')');
            solve(open, close-1, n, str);
            str.deleteCharAt(str.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder str = new StringBuilder();
        solve(n,n,n,str);
        return res;
    }
}
