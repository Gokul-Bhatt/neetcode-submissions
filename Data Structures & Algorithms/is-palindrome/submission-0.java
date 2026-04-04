class Solution {
    boolean valid(char ch) {
        if ((ch >= 'a' && ch <= 'z') ||
            (ch >= 'A' && ch <= 'Z') ||
            (ch >= '0' && ch <= '9')) {
            return true;
        }
        return false;
    }
    char toLowercase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char)(ch - 'A' + 'a');
        }
        return ch;
    }
    boolean checkPalindrome(String temp) {
        int s = 0;
        int e = temp.length() - 1;
        while (s < e) {
            if (temp.charAt(s) != temp.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        StringBuilder temp = new StringBuilder();
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (valid(ch)) {
                temp.append(toLowercase(ch));
            }
        }
        return checkPalindrome(temp.toString());
    }
}
