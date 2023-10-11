package Heaps.Implementation;

import java.util.ArrayList;

public class JP_01_Implementation<T extends Comparable<T>> {
   private ArrayList<T> list=new ArrayList<>();
    private void insert(T value){
       list.add(value);
       upHeap(list.size()-1);
    }
    void upHeap(int index){
        if(index==0) return;
        int pIndex=getParent(index);
        if(list.get(index).compareTo(list.get(pIndex))<0){
            swap(index,pIndex);
            upHeap(pIndex);
        }
    }
    private T remove() throws Exception{
        if(list.isEmpty()) throw new Exception("Removing from Empty Array");

        T temp=list.get(0);
        T last=list.get(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downHeap(0);
        }
        return temp;
    }
    void downHeap(int index){
         int min=index;
         int left=leftChild(index);
         int right=rightChild(index);
         if(left<list.size() && list.get(min).compareTo(list.get(left))>0){
             min=left;
         }
        if(right<list.size() && list.get(min).compareTo(list.get(right))<0){
            min=right;
        }
        if(min!=index){
            swap(min,index);
            downHeap(min);
        }
    }
    private void swap(int first,int second){
        T temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
    int getParent(int index){
        return (index-1)/2;
    }
    int leftChild(int index){
        return (index*2)+1;
    }
    int rightChild(int index){
        return (index*2)+2;
    }


    public  ArrayList<T> heapSort() throws Exception {
    ArrayList<T> newList=new ArrayList<>();
    while(list.isEmpty()){
        newList.add(this.remove());
    }
    return newList;
    }

    public static void main(String[] args)throws Exception {
    JP_01_Implementation<Integer> heap=new JP_01_Implementation<>();
        heap.insert(34);
        heap.insert(22);
        heap.insert(11);
        heap.insert(31);
        heap.insert(72);
        heap.insert(55);
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        ArrayList l=heap.heapSort();
        System.out.println(l);
    }
}
