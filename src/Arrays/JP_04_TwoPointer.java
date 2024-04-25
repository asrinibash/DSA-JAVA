package Arrays;

public class JP_04_TwoPointer {
    public static void main(String[] args) {

    }
    public void arrange(int[] arr){
        int l=arr.length;
        int i=0;
        int j=l;
        while (i<j) {
             while(i<l){
                 if(arr[i]>0){
                     break;
                 }
                 else{
                     i++;
                 }
             }
            while(j>0){
                if(arr[j]<0){
                    break;
                }
                else{
                    j--;
                }
            }
        }
    }
}
