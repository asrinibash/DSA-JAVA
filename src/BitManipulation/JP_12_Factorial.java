package BitManipulation;

public class JP_12_Factorial {
    public static void main(String[] args) {
        factorial1(20);
    }
//    static void factorial(int n){
//        for (int i = 1; i <=n ; i++) {
//            if(n%i==0){   //here repetation checking is there
//                System.out.print(i+" ");
//            }
//        }
//    }


    //optimal approach
    static void factorial1(int n){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                if(n/i==i) {// for print in optimal approach use arraylist store it then print it
                    System.out.print(i + " ");
                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }
}
