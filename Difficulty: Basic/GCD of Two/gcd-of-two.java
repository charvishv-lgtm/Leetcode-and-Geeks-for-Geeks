class Solution {
    public static int gcd(int a, int b) {
        if (b == 0) { 
            return a; 
        } 
        // a is greater
        return gcd(b, a % b);
    }
}