package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_442 {
    public static void main(String[] args) {
int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] arr) {
       List<Integer> list =new ArrayList<>();
       int i=0;
       int l,temp;
       while(i<arr.length) {
           l = arr[i] - 1;
           if (arr[i] != arr[l]) {
               temp = arr[l];
               arr[l] = arr[i];
               arr[i] = temp;
           } else
               i++;
       }
        System.out.println(Arrays.toString(arr));
       i=0;
        while(i<arr.length) {
            if(arr[i]!=(i+1))
               list.add(arr[i]);
            i++;
       }
       return list;
    }
}
