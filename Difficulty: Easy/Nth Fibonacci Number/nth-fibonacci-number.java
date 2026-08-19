class Solution {
    static int nthFibonacci(int n) {
        if (n == 0) return 0;
         if (n == 1) return 1;
        int[] series=new int[n];
             series[0]=1;
             series[1]=1;
             for(int i=2;i<n;i++){
                 series[i]=series[i-1]+series[i-2];
             }
             return series[n-1];
         }
    }