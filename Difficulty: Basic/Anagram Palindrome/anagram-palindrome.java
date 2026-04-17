import java.util.*;
class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        Map<Character, Integer> dict=new HashMap<>();
        for(char c: s.toCharArray()){
            dict.put(c,dict.getOrDefault(c,0)+1);
        }
        int oddcount=0;
        for(int i:dict.values()){
            if (i%2 !=0){
                oddcount+=1;
            }
        }
        return oddcount<=1;
        
    }
}