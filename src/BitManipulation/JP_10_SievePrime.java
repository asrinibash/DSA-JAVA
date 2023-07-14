package BitManipulation;
//this is optimise method given by Seive to find  prime number in a range
public class JP_10_SievePrime {
    public static void main(String[] args) {
        int n=40;
        boolean[] primes=new boolean[n+1];
        seive(n,primes);
    }

    private static void seive(int n, boolean[] primes) {
        for (int i = 2; i*i <=n ; i++) {
            if(!primes[i])
                for (int j = i*2; j <=n ; j+=i) {
                    primes[j]=true;
                }
        }
        for (int i = 2; i <=n; i++) {
            if(!primes[i])
                System.out.print(i+" ");
        }
    }
}
