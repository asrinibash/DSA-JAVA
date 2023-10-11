package Heaps.Problems;

import java.util.Arrays;

public class JP_01_insertNewElementInHeap {

    public void insertNewElement(int[] arr,int n,int val){  //bottom se top
        n=n+1;
        arr[n]=val;
        int i=n;
        while(i>1){
            int parent=i/2;
            if(arr[parent]<arr[i]){
                swap(arr,parent,i);
                i=parent;
            }
            else{
                return;
            }
        }
    }
    private void swap(int[] arr,int x,int y){
     int temp=arr[x];
     arr[x]=arr[y];
     arr[y]=temp;
    }

    public static void main(String[] args) {
        int[] arr=new int[10];
        JP_01_insertNewElementInHeap ob=new JP_01_insertNewElementInHeap();
        ob.insertNewElement(arr,0,11);
        ob.insertNewElement(arr,1,32);
        ob.insertNewElement(arr,2,40);
        ob.insertNewElement(arr,3,19);
        ob.insertNewElement(arr,4,10);
        System.out.println(Arrays.toString(arr));
    }
}
