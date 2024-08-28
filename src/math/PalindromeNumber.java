class Solution {
    public static int reverse(int n){
        int temp = n;
        int reverse= 0;
        while(temp>0){
            reverse = reverse * 10;
            reverse += temp%10;

            temp = temp/10;
            
        }
        return reverse;
    }
    public boolean isPalindrome(int x) {
        int c = reverse(x);
        return c == x;

        
    }
}