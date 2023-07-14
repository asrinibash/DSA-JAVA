package BitManipulation;

public class JP_11_SqrtNum {
    public static void main(String[] args){
        int n=36;
        int p=3;
        System.out.println(sqrtNum(n,p));
    }
 static double sqrtNum(int n, int p) {
        int s=0;
        int e=n;
        int m=0;
        double root=0.0;
        //it is for perfect square root
        while(s<=e){
            m=s+(e-s)/2;
            if(m*m==n)
                return m;
            else if(m*m<n)
                s=m+1;
            else
                e=m-1;
        }

        //2nd way to get closer number of square root

        double incre=0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<=n)
                root+=incre;
            root-=incre;
            incre/=10;
        }
        return root;
    }
}
