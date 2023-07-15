package Permutation;

import java.util.ArrayList;
import java.util.List;

public class JP_03_Dice {
    public static void main(String[] args) {
        // dice("", 6);
        System.out.println(diceRet("", 4));
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static List<String> diceRet(String p, int target) {
        if (target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= target; i++) {
            ans.addAll(diceRet(p + i, target - i));
        }
        return ans;
    }
}
