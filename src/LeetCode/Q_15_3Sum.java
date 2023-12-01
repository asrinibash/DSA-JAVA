package LeetCode;

import java.util.*;

public class Q_15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<Integer> hs =new HashSet<>();

      List<List<Integer>> set=new ArrayList<>();

        for (int i = 0; i <nums.length ; i++) {
            List<Integer> list=new ArrayList<>();
            for (int j = i+1; j <nums.length ; j++) {
                int third = -(nums[i] + nums[j]);
                if (hs.contains(third)) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(third);
                }
                else{
                    hs.add(j); 
                }
            }
            Collections.sort(list);
            set.add(list);
        }
        return set;
    }
}
