package Recursion;

import java.util.ArrayList;

public class JP_06_LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,34,34,5,6};
//        System.out.println(linearSearchBoolean(arr,4,0));

        ArrayList<Integer> ans=search(arr,34,0,new ArrayList<Integer>());
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target,int index){
        if(index==arr.length)
            return -1;
        if(arr[index]==target)
            return index;
        return linearSearch(arr,target,index+1);
    }
    static boolean linearSearchBoolean(int[] arr,int target,int index){
        if(index==arr.length)
            return false;

        return arr[index]==target || linearSearchBoolean(arr,target,index+1);
    }

    // if in the array target is present one to many times then we have to return array list
    static ArrayList<Integer> search(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index==arr.length)
            return list;
        if(arr[index]==target)
            list.add(index);
        return search(arr,target,index+1,list);
    }
}
