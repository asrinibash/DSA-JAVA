package DSA_Sheet_ApnaCollege.TwoDimensionalArrays;

import java.util.Arrays;

public class JP_02_SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        System.out.println(Arrays.deepToString(arr));
        findZero(arr);
        System.out.println(Arrays.deepToString(arr));

    }

    static void findZero(int[][] arr) {
        int row = -1, col = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    row = i;
                    col = j;
                    break;
                }
            }
            if (row >= 0)
                break;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (row == i || col == j)
                    arr[i][j] = 0;
            }
        }
    }
}


