package StarPattern;

public class JP_Pattern_05 {
    public static void main(String[] args) {
        int x = 0;
        int n=5;
        int totalrows;
        for (int row = 1; row <=2*n; row++) {
            totalrows=row>n?2*n-row:row;
            for (int col = 1; col <= totalrows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//*
//* *
//* * *
//* * * *
// * * * * *
//* * * *
//* * *
//* *
//* 