class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        sum=0
        runningSum=[]
        for i in nums:
            sum+=i
            runningSum.append(sum)
        return runningSum
        