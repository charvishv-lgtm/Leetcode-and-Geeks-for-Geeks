class Solution {
    public int maxOnes(int[] arr) {
        int countOnes = 0;
        int maxDiff = 0;
        int currDiff = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countOnes++;
            }
            
            int val = (arr[i] == 0) ? 1 : -1;
            currDiff += val;
            
            if (currDiff < 0) {
                currDiff = 0;
            }
            
            if (currDiff > maxDiff) {
                maxDiff = currDiff;
            }
        }
        
        return countOnes + maxDiff;
    }
}