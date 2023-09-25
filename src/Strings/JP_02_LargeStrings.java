package Strings;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class JP_02_LargeStrings {
    public static void main(String[] args) {
//string buffer object doesn't change its object it modifies that object only
        //constructor 1
        StringBuffer sb=new StringBuffer();
        //-> Initially an empty string builder object have 16 character capacity

        //constructor 2
        StringBuffer sb1=new StringBuffer("Srinibash");
        //->We can specify string in its constructor
//        System.out.println(sb1.capacity());//return the capacity of the SB object
        //constructor 3
        StringBuffer sb2=new StringBuffer(32);
        //->We can manually change its size in initial state

        //lets look at some stringBuffer methods**
        sb.append("hello ");// Adding element
        sb.append("WeMakeDevs"); //-> hello WeMakeDevs -->modifies that object only
//        sb.insert(5," Srinibash "); //it insert the string at the given string
        sb.replace(12,15,"Developer");//replace sub set of  the original with the given string by given its index
      // sb.delete(1,5);//delete the string sub by given its index 5 is exclusive
       // sb.reverse();//it will reverse the string
//        String str = sb.toString();
//        System.out.println(str);
        System.out.println(getRandom(5));

        //Remove white spaces
        String sent="hdf sdgd saf  dfsasf f";
        System.out.println(sent.replaceAll("\\s",""));

        //split
        String arr="Srinu,Nila,Hitesh,Rahul";
        String[] names=arr.split(",");
        System.out.println(Arrays.toString(names ));




        //Decimal Format:
        DecimalFormat df=new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));
    }

    public static String getRandom(int size){
        StringBuffer st=new StringBuffer(size);
        Random random=new Random();
        for (int i = 0; i < size; i++) {
            int randomChar=(97+(int)(26*random.nextFloat()));
            st.append((char)(randomChar));
        }
        return st.toString();
    }
}
