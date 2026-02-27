class Solution {
    public int count_digits(int num){
        String str=String.valueOf(num);
        int len=str.length();
        return len;
        }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(count_digits(num) %2==0){
                count+=1;
            }
        }
        return count;
}
}