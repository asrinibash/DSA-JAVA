package LeetCode;

import java.sql.Array;
import java.util.Arrays;

public class Q_48_RotateImage {
    public static void rotate(int[][] matrix) {
        //transpose the matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reversing each row
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int[] value : arr) {
            System.out.println(Arrays.toString(value));
        }
        rotate(arr);
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
