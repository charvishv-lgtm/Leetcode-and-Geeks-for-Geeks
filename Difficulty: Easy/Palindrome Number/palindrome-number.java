class Solution {
    public boolean isPalindrome(int n) {
        if (n == Integer.MIN_VALUE) {
            return false; 
        }
        int original_number=Math.abs(n);
        int reverse_number=0;
        if(n<0){
            n=n*-1;
        }
        while(n>0){
            int digit=n%10;
            reverse_number=reverse_number*10 + digit;
        n=n/10;
        }
        if(original_number==reverse_number){return true;}
        return false;
    }
}