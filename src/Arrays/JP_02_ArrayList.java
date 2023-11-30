package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class JP_02_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();

        Scanner sc=new Scanner(System.in);

        //Initialising its inner ArrayList
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }

        //taking input
        for(int i=0;i<2;i++){
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(sc.nextInt());
            }
        }
        //printing the 2d ArrayList
        for (ArrayList<Integer> integers : arr) {
            for (int it : integers) {
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}
