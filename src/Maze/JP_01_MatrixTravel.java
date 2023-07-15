package Maze;

import java.util.ArrayList;
import java.util.List;

public class JP_01_MatrixTravel {
    public static void main(String[] args) {
//        System.out.println(MatrixTravel(3,3));
//           path("",3,3);
//        System.out.println(pathReturnList("",3,3));
        System.out.println(pathDiagonally("",3,3));
    }
    static int MatrixTravel(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=MatrixTravel(r-1,c);     //Travelling row wise and Column wise
        int right=MatrixTravel(r,c-1);

        return left+right;
    }

    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;                     //IT will Print the Path like Down Right OR Right Down
        }
        if(r>1)
            path(p+'D',r-1,c);
        if(c>1)
            path(p+'R',r,c-1);
    }

    static List<String> pathReturnList(String p,int r,int c){
          if(r==1 && c==1){
              List<String> list =new ArrayList<>();
              list.add(p);
            return list;                      //IT will return a list path like Down Right OR Right Down
          }
        List<String> ans =new ArrayList<>();
        if(r>1)
         ans= pathReturnList(p+'D',r-1,c);
        if(c>1)
          ans.addAll(pathReturnList(p+'R',r,c-1));

        return ans;
    }


    //Program for Print the possibilities if you can go through diagonally
    static List<String> pathDiagonally(String p,int r,int c){
        if(r==1 && c==1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;                      //here written a ArrayList,We can Travel horizontally
        }                                   // and vertically and also Diagonally
        List<String> ans =new ArrayList<>();
        if(r>1 && c>1)
            ans= pathDiagonally(p+'D',r-1,c-1);
        if(r>1)
            ans.addAll(pathDiagonally(p+'V',r-1,c));
        if(c>1)
            ans.addAll(pathDiagonally(p+'H',r,c-1));

        return ans;
    }

}
