package DSA_Sheet_ApnaCollege.String;

import java.util.Arrays;
//leetcode -242 no question
public class JP_02_validAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
}
