class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length()-1;
        int blen = b.length()-1;

        int sum = 0;
        int carry = 0;

        StringBuilder res = new StringBuilder();

        while( alen >= 0 || blen >= 0){
            sum = carry;

            if(alen >= 0){
                sum += a.charAt(alen--) - '0';
            }
            if(blen >= 0){
                sum += b.charAt(blen--) - '0';
            }

            res.append(sum % 2);
            carry = sum / 2;
        }

        if(carry == 1){
            res.append(carry);
        }

        return res.reverse().toString();
    }
}