import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            int sum = l == 0 ? prefixSum[r] : prefixSum[r] - prefixSum[l - 1];
            result.add(sum / (r - l + 1));
        }
        
        return result;
    }
}