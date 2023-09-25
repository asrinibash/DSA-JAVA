package Numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class JP_02_BigDecimal {
    public static void BD(){
//        double x=0.03;
//        double y=0.04;
//        double ans =y-x;
//        System.out.println(ans); //->it prints 0.010000000000000002 why? exact answer is 0.1
        // why? float and double are floating point numbers binary representation of a  fraction and exponent
        //i.e they give some error (10pow -19)
        //integer are fixed point numbers
        //but BigDecimal get exact answer

        BigDecimal a=new BigDecimal("0.03");
        BigDecimal b=new BigDecimal("0.04");
        BigDecimal ans=a.subtract(b);  //here it gives exact answer
        System.out.println(ans);


        //operations
//        BigDecimal E=a.add(b);
//        BigDecimal G=a.multiply(b);
//        BigDecimal sub=a.subtract(b);
//        BigDecimal div=a.divide(b);
//        BigDecimal rem=a.remainder(b);

        //constants
        BigDecimal B=BigDecimal.ONE;

    }

    public static void main(String[] args) {
       BD();
    }
}
