package Permutation;

import java.util.ArrayList;
import java.util.List;

public class JP_02_MobilePad {
    public static void main(String[] args) {
        System.out.println(letterCombinations("8"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(ch + p, up.substring(1));
        }
    }

    static List<String> padReturnList(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        List<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(padReturnList(ch + p, up.substring(1)));
        }
        return ans;
    }

    public static List<String> letterCombinations(String digits) {
        List<String> list = retList("", digits);
        if (digits.length() == 0) {
            List<String> empty = new ArrayList<>();
            return empty;
        }
        return list;
    }

    public static List<String> retList(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digits = up.charAt(0) - '0';
        List<String> ans = new ArrayList<>();
        int start, end;
        if (digits == 8 || digits == 9) {
            if (digits == 8)
                end = ((digits - 1) * 3);
            else
                end = ((digits - 1) * 3) + 1;
            start = ((digits - 2) * 3) + 1;
            for (int i = start; i <= end; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(retList(p + ch, up.substring(1)));
            }
        } else if (digits == 7) {
            start = ((digits - 2) * 3);
            end = ((digits - 1) * 3) + 1;
            for (int i = start; i < end; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(retList(p + ch, up.substring(1)));
            }
        } else {
            start = (digits - 2) * 3;
            end = (digits - 1) * 3;
            for (int i = start; i < end; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(retList(p + ch, up.substring(1)));
            }
            return ans;
        }
        return ans;
    }

}
