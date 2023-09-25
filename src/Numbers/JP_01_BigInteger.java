package Numbers;

import java.math.BigInteger;

public class JP_01_BigInteger {
    public static void main(String[] args) {
        int a=30;
        int b=67;

        BigInteger A=BigInteger.valueOf(5); //convert int to BigInteger
        BigInteger B=BigInteger.valueOf(6);
        BigInteger C= new BigInteger("2232345678345673");//working with string
        BigInteger F= new BigInteger("9876543098765439");//working with string

        //constants
        BigInteger D=BigInteger.TEN;

        //Operations
        BigInteger E=F.add(C);
        BigInteger G=F.multiply(C);
        BigInteger sub=F.subtract(C);
        BigInteger div=F.divide(C);
        BigInteger rem=F.remainder(C);

        //Comparisons
        if(F.compareTo(C)>0){
//            System.out.println(F.compareTo(C));
        }

//        System.out.println(rem);
        System.out.println(factorial(100));
    }
    public static BigInteger factorial(int num){
        BigInteger ans=new BigInteger("1");
        for (int i = 2; i <= num; i++) {
            ans=ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
}
