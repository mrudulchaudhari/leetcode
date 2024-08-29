class Solution {
    public int myAtoi(String s) {
        boolean del = false;
        int ans=0, i=0;
        int len = s.length();

        while(i<len && s.charAt(i) == ' '){
            i++;
        }

        if(i<len){
            char c = s.charAt(i);
            if(c == '-'){
                del = true;
                i++;
            }
            else if(c == '+'){
                i++;
            }
        }

        while(i<len && s.charAt(i)>='0' && s.charAt(i)<='9')
        {
            int digit = s.charAt(i) - '0';

            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return del ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }

        return del ? -ans : ans;
    }
}