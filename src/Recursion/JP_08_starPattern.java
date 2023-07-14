package Recursion;

public class JP_08_starPattern {
    public static void main(String[] args) {
        starPrint2(5,0);
    }
    static void starPrint(int row ,int col){
        if(row==0){
            return;
        }
        if(col<row){
            starPrint(row,col+1);
            System.out.print("*");
        }
        else{
            starPrint(row-1,0);
            System.out.println();
        }
    }
    //it will print reversely
    static void starPrint2(int row ,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*");
            starPrint2(row,col+1);
        }
        else{
            System.out.println();
            starPrint2(row-1,0);
        }
    }
}
