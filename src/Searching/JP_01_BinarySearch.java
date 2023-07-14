package Searching;

public class JP_01_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 1;
        JP_01_BinarySearch ob = new JP_01_BinarySearch();
        int ans = ob.binary_search(arr, target);
        System.out.println("item at index: " + ans);
    }

    int binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
        }
        return -1;
    }
}


