package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Q_448 {
    public static void main(String[] args) {
    int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
   static List<Integer> findDisappearedNumbers(int[] arr) {
        sort(arr);
        int i=0;
        List<Integer> list=new ArrayList<>();
        while(i<arr.length) {
            if(arr[i]!=(i+1))
                list.add(i+1);
            i++;
        }
        return list;
    }
    static void sort(int[] arr) {
        int i=0;
        int CorrectIndex;
        while(i< arr.length){
            CorrectIndex=arr[i]-1;
            if(arr[i]!=arr[CorrectIndex])
                Swap(arr,CorrectIndex,i);
            else
                i++;
        }
    }
    static void Swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
        
        
    