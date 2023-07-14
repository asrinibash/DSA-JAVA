package BitManipulation;

public class JP_04_NoOfDigits {
    public static void main(String []args){
        int n=10;
        int base=2;    //time complexity log(n)   --> it works in decimal number also by taking base 10
        int ans=(int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }
}
