class Solution:
    def find(self, arr):
        x=0
        n=len(arr)
        for i in range(n - 1, -1, -1):
            x = (x + arr[i] + 1) // 2
        return x
