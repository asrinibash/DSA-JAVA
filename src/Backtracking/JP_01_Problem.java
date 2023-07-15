<<<<<<< HEAD
package Backtracking;

import java.util.Arrays;

public class JP_01_Problem {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true}, {true, true, true}, {true, true, true}};
//        pathAll("", maze, 0, 0);
        int[][] path=new int[maze.length][maze[0].length];
        pathPrintArray("",maze,0,0,path,1);
    }


    //This problem is Define the Concept of Backtracking
    //Now we can go all 4 direction(down ,up ,left,Right)
    static void pathAll(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) return;

        // I am considering this block is my path
        maze[r][c] = false;

        //going down
        if (r < maze.length - 1) pathAll(p + 'D', maze, r + 1, c);

        //going right
        if (c < maze[0].length - 1) pathAll(p + 'R', maze, r, c + 1);

        //going up
        if (r > 0) pathAll(p + 'D', maze, r - 1, c);

        //going left
        if ( c> 0) pathAll(p + 'R', maze, r, c - 1);


        //this line where the Function will over
        //so before the function get removed ,also removes the changes that were made by that function
        maze[r][c] = true;
    }

    //if we change something in function call in Array it will change for all so that after changing in array
    //we make it same as it before after that function call...then it will not change for all




    static void pathPrintArray(String p, boolean[][] maze, int r, int c,int[][] path,int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]=step;
            for(int[] n : path){
                System.out.println(Arrays.toString(n));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) return;

        maze[r][c] = false;
        path[r][c]=step;
        //going down
        if (r < maze.length - 1) pathPrintArray(p + 'D', maze, r + 1, c,path,step+1);

        //going right
        if (c < maze[0].length - 1) pathPrintArray(p + 'R', maze, r, c + 1,path,step+1);

        //going up
        if (r > 0) pathPrintArray(p + 'D', maze, r - 1, c,path,step+1);

        //going left
        if ( c> 0) pathPrintArray(p + 'R', maze, r, c - 1,path,step+1);


        maze[r][c] = true;
        path[r][c]=0;
    }
}

=======
package Backtracking;

import java.util.Arrays;

public class JP_01_Problem {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true}, {true, true, true}, {true, true, true}};
//        pathAll("", maze, 0, 0);
        int[][] path=new int[maze.length][maze[0].length];
        pathPrintArray("",maze,0,0,path,1);
    }


    //This problem is Define the Concept of Backtracking
    //Now we can go all 4 direction(down ,up ,left,Right)
    static void pathAll(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) return;

        // I am considering this block is my path
        maze[r][c] = false;

        //going down
        if (r < maze.length - 1) pathAll(p + 'D', maze, r + 1, c);

        //going right
        if (c < maze[0].length - 1) pathAll(p + 'R', maze, r, c + 1);

        //going up
        if (r > 0) pathAll(p + 'D', maze, r - 1, c);

        //going left
        if ( c> 0) pathAll(p + 'R', maze, r, c - 1);


        //this line where the Function will over
        //so before the function get removed ,also removes the changes that were made by that function
        maze[r][c] = true;
    }

    //if we change something in function call in Array it will change for all so that after changing in array
    //we make it same as it before after that function call...then it will not change for all




    static void pathPrintArray(String p, boolean[][] maze, int r, int c,int[][] path,int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]=step;
            for(int[] n : path){
                System.out.println(Arrays.toString(n));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) return;

        maze[r][c] = false;
        path[r][c]=step;
        //going down
        if (r < maze.length - 1) pathPrintArray(p + 'D', maze, r + 1, c,path,step+1);

        //going right
        if (c < maze[0].length - 1) pathPrintArray(p + 'R', maze, r, c + 1,path,step+1);

        //going up
        if (r > 0) pathPrintArray(p + 'D', maze, r - 1, c,path,step+1);

        //going left
        if ( c> 0) pathPrintArray(p + 'R', maze, r, c - 1,path,step+1);


        maze[r][c] = true;
        path[r][c]=0;
    }
}

>>>>>>> bb451aa (Initial commit)
