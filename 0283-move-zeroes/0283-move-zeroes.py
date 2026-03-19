class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        readpos=0
        for i in range(len(nums)):
            if nums[i]!=0:
                nums[readpos], nums[i] = nums[i], nums[readpos]
                readpos += 1
        return nums
        