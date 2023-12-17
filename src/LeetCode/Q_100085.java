package LeetCode;

import java.util.Collections;
import java.util.List;

public class Q_100085 {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
Collections.sort(processorTime);
Collections.sort(tasks);
Collections.reverse(tasks);
int ans=Integer.MIN_VALUE;
int n=processorTime.size();
int tn=tasks.size();
        for (int i = 0; i < n; i++) {
            int maxx=Integer.MIN_VALUE;
            int j=i*4;
            int temp=i*4+4;
            while(j<temp){
                maxx=Math.max(maxx,processorTime.get(i)+tasks.get(i));
                j++;
            }
            ans=Math.max(ans,maxx);
        }
        return ans;
    }
}
