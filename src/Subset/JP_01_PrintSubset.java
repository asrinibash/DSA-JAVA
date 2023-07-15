package Subset;

import java.util.ArrayList;
import java.util.List;

public class JP_01_PrintSubset {
    public static void main(String[] args) {
        System.out.println(iterativeSet(new int[] { 1, 2, 3 }));
    }

    // not Very optimised creates string object in every function Call
    static void subset(String p, String up) {
        if (up.isEmpty()) {
            if (!p.equals(""))
                System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset(ch + p, up.substring(1));
        subset(p, up.substring(1));
    }

    // Optimised Approach returning ArrayList
    static ArrayList<String> subsetRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if (!p.equals("")) {
                list.add(p);
            }
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetRet(ch + p, up.substring(1));
        ArrayList<String> right = subsetRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    // Important--Iterative Way --->
    static List<List<Integer>> iterativeSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
