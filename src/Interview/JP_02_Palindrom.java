package Interview;

public class JP_02_Palindrom {
   static public boolean isNumPalindrom(int n){
       int org=n;
       int reversedNum=0;
       while(org>0){
           int r=org%10;
           reversedNum=(reversedNum*10)+r;
           org=org/10;
       }
        return reversedNum==n;
    }
   static public boolean isStrPalindrom(String n){
        String rev="";
       for (int i = n.length()-1; i >=0 ; i--) {
           rev+=n.charAt(i);
       }
       return rev.equals(n);
    }

    public static void main(String[] args) {
        int n=121;
        String str="ass";
        System.out.println(isNumPalindrom(n));
        System.out.println(isStrPalindrom(str));
    }

}
