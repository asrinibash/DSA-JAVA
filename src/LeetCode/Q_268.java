package LeetCode;

public class Q_268 {
    public static void main(String[] args){
        int[] arr={3,0,1};
        System.out.println(missingNum(arr));
        //System.out.println(missingNumber(arr));  Easy Approach
    }
    static void sort(int[] arr) {
        int i = 0;
        int n=arr.length;
        int CorrectIndex;
        while (i < arr.length) {
            CorrectIndex = arr[i] ;
           if (arr[i]<n && arr[i] != arr[CorrectIndex])
                Swap(arr, CorrectIndex, i);
            else
                i++;
        }
    }
  static int missingNum(int[] arr){
            sort(arr);
            int i=0;
            while(i<arr.length) {
              if(arr[i]==i)
                  i++;
              else
                  return i;
            }
        return arr.length;
    }
    static void Swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }




 public static int missingNumber(int[] arr) {
        int sumr=0;
        int sumv=0;
        int i=0;
        for(i=0;i<arr.length;i++){
            sumr+=i;
            sumv+=arr[i];
        }
        return (sumr+i)-sumv;
    }
}

