package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Q_3 {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int maxLength=0;
        char[] chars=s.toCharArray();
        for (int i = 0; i <chars.length; i++) {
             if(map.containsKey(chars[i])){
                 maxLength=Math.max(maxLength,map.size());
                 map.clear();
             }else {
                 map.put(chars[i],i);
             }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
