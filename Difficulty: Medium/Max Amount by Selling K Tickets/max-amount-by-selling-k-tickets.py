class Solution:
    def maxAmount(self, arr, k):
        # 1. Define binary search boundaries
        low = 0
        high = max(arr)
        threshold = 0
        
        # 2. Binary search to find the minimum price threshold
        while low <= high:
            mid = (low + high) // 2
            
            # Count how many items can be picked if we stop at 'mid'
            current_count = sum(max(0, x - mid) for x in arr)
            
            if current_count <= k:
                threshold = mid
                high = mid - 1
            else:
                low = mid + 1
                
        # 3. Calculate total revenue using the arithmetic series formula
        max_price = 0
        items_picked = 0
        
        for x in arr:
            if x > threshold:
                cnt = x - threshold
                items_picked += cnt
                # Sum of arithmetic progression from (threshold + 1) to x
                max_price += (cnt * (x + threshold + 1)) // 2

        # 4. Fill remaining capacity with items priced exactly at the threshold
        remaining = k - items_picked
        if remaining > 0 and threshold > 0:
            max_price += remaining * threshold
            
        # 5. Return result modulo 10^9 + 7
        return max_price % (10**9 + 7)