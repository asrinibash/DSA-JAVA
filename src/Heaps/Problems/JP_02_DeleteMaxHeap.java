package Heaps.Problems;

public class JP_02_DeleteMaxHeap {
    public int delete(int[] arr,int n){ //top se bottom
        int deleteItem=arr[1];
        arr[1]=arr[n];
        n=n-1;
        int i=1;
        while(i<n){
            int leftChild=arr[i*2];
            int rightChild=arr[i*2+1];
            int larger=leftChild>rightChild?i*2:i*2+1;
            if(arr[i]<arr[larger]){
                swap(arr,i,larger);
                i=larger;
            }
            else {
                return deleteItem;
            }
        }
        return deleteItem;
    }
    private void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
