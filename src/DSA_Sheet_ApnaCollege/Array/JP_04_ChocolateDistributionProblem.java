package DSA_Sheet_ApnaCollege.Array;

import java.util.ArrayList;
import java.util.Collections;

//GFG problem
// like sliding window
public class JP_04_ChocolateDistributionProblem {
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int s=0;
        int e=m-1;
        int min=Integer.MAX_VALUE;
        int temp;
        while(e<n){
            temp=a.get(e)-a.get(s);
            if(temp<min){
                min=temp;
            }
            e++;s++;
        }
        return min;
    }
}
