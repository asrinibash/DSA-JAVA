package Heaps.Implementation;

//convert a normal array to heap

import java.util.Arrays;

public class JP_02_HeapifyAlgo {
    public void heapify(int[] arr, int n,int i){
        int largest=i;
        int l=i*2;
        int r=i*2+1;
        if(l<=n && arr[l]>arr[largest]){
            largest=l;
        }
        if(r<=n&& arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            swap(arr,i,largest);
            heapify(arr,n,largest);
        }
    }
    public void buildHeap(int[] arr,int n){
        for (int j = n/2; j >0 ; j--) {
            heapify(arr,n,j);
        }
    }
    private void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public void heapSort(int[] arr){
        int n=arr.length-1;
        buildHeap(arr,n);
        for (int i = n; i >1 ; i--) {
            swap(arr,1,i);
            heapify(arr,i-1,1);
        }
    }

    public static void main(String[] args) {
        int[] arr={0,23,6,3,6,7,34,31};
        System.out.println(Arrays.toString(arr));
        JP_02_HeapifyAlgo ob=new JP_02_HeapifyAlgo();
        ob.buildHeap(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
        ob.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
