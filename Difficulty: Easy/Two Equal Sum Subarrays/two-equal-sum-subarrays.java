class Solution {
    public boolean canSplit(int[] arr) {
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        long leftSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            if (leftSum * 2 == sum) {
                return true;
            }
        }
        
        return false;
    }
}