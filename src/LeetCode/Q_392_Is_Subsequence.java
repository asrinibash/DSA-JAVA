package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q_392_Is_Subsequence {
    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        for (char c : t.toCharArray()) {
            map.put(c, i);
            i++;
        }
        char[] temp = new char[s.length()];
        int x = 0;
        for (char sub : s.toCharArray()) {
            if (map.containsKey(sub)) {
                temp[x] = sub;
                x++;
            }
        }
       String str =new String(temp);
        System.out.println(str);
        return str.equals(s);
    }
}

