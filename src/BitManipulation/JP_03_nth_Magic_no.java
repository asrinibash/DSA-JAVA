package BitManipulation;

public class JP_03_nth_Magic_no {
    public static void main(String []args){
        int n=3;
        int base=5;
        int ans=0;
        int last;
        while(n>0){
            last=n&1;//it returns last binary digit
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }
        System.out.println(ans);
    }
}
