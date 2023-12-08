package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class Q_56_MergeIntervals {
//    public int[][] merge(int[][] ints) {
//       if(ints.length==1)
//            return ints;
//       Arrays.sort(ints, Comparator.comparingInt(i->i[0]));
//    }

    public static void main(String[] args) {
      int[][] temp={
              {1,2},
              {9,4},
              {3,9},
              {2,0},
              {4,8}
      };
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp, Comparator.comparingInt(i->i[0]));
        System.out.println(Arrays.toString(temp));
      }
    }

