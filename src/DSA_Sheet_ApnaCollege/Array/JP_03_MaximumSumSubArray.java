package DSA_Sheet_ApnaCollege.Array;

public class JP_03_MaximumSumSubArray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};

        //solution:1

        //This Solution takes o(n3)
        //So, it shows timeLimit Exceeded in leetcode
//        int sum=0;
//        int max=Integer.MIN_VALUE;
//        int index;
//        for(int i=0;i<nums.length;i++){
//            for(int j=i;j<nums.length;j++){
//                index=i;
//                sum=0;
//                while(index<=j){
//                    sum+=nums[index];
//                    index++;
//                }
//                max=Integer.max(sum,max);
//            }
//        }
//        System.out.println(max);


        //solution:2
        //this solution is better than 1st solution,
        //but it also didn't work in large arrays in leetcode
//        int sum;
//        int max=Integer.MIN_VALUE;
//        int index;
//        for(int i=0;i<nums.length;i++){
//            sum=0;
//            for(int j=i;j<nums.length;j++){
//                sum+=nums[j];
//                max=Integer.max(sum,max);
//            }
//        }
//        System.out.println(max);


        //solution: 3
        //using Kadane's Algo Optimal Solution
        //Here Loop will run once and if the sum is smaller than 0 we reassigned to sum 0,
        //so we can get max sum in traverse once in a group
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max)
                max=sum;
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}
