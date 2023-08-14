package DSA_Sheet_ApnaCollege;

import java.util.Arrays;

public class JP_02_ReverseArray {
    public static void main(String[] args) {
//        int[] arr = {1, 4, 2, 6, 0, 2, 7, -1};
//        System.out.println(Arrays.toString(arr));
//        reverseArray(arr);
//        System.out.println(Arrays.toString(arr));

        int[] nums={1,2,3};
        System.out.println(containsDuplicate(nums));
    }

    static void reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static boolean containsDuplicate(int[] nums) {
        int correctindex;
        int i=0;
        while(i<nums.length){
            correctindex=nums[i]-1;
            if(nums[correctindex]!=nums[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
