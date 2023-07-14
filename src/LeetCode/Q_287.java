package LeetCode;

import java.util.Arrays;

public class Q_287 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        int CorrectIndex;
        while (i < arr.length) {
            CorrectIndex = arr[i] - 1;
            if (arr[i] != arr[CorrectIndex])
                Swap(arr, CorrectIndex, i);
            else
                i++;
        }
//        System.out.println(Arrays.toString(arr));
//        i = 0;
//        while (i < arr.length) {
//            CorrectIndex = arr[i] - 1;
//            if (arr[i] == arr[CorrectIndex])
//                i++;
//            else
//                break;
//        }
        return arr[i - 1];
    }

    static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
