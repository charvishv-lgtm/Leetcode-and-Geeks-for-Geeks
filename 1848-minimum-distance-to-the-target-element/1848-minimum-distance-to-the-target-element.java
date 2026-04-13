class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int md=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==target){
                md=Math.min(md,Math.abs(i-start));
            }
        }
        return md;
    }
}