package LeetCode;

public class Q_1945 {
    public static int getLucky(String s, int k) {

        StringBuilder str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int x=((s.charAt(i)-97)+1);
            str.append(x);
        }
        int n=Integer.parseInt(String.valueOf(str));
        int sum=0;
        for (int i = 0; i < k; i++) {
            int r=n%10;
            sum+=r;
            n=n/10;
            if(n==0){
                n=sum;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
//        System.out.println(Integer.parseInt(String.valueOf("123")));
//        System.out.println(getLucky("iiii",1));
        System.out.println(0+(-1));
    }

}
