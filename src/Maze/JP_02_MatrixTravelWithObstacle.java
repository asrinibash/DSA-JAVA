package Maze;

import java.util.ArrayList;
import java.util.List;

public class JP_02_MatrixTravelWithObstacle {
    public static void main(String[] args) {
//        path("",0,0);
//        System.out.println(pathWIthObstacle("",0,0));  //Started From Zero
        boolean[][] maze = {{true, true, true}, {true, false, true}, {true, true, true}};
        pathObstacleArray("", maze, 0, 0);
    }

    static void path(String p, int r, int c) {   //travel from (0,0)
        if (r == 2 && c == 2) {
            System.out.println(p);
            return;                     //IT will Print the Path like Down Right OR Right Down
        }
        if (r < 2) path(p + 'D', r + 1, c);
        if (c < 2) path(p + 'R', r, c + 1);
    }

    static List<String> pathWIthObstacle(String p, int r, int c) {
        if (r == 2 && c == 2) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        if (r == 1 && c == 1)                         //Obstacle at middle which is 2,2
            return ans;

        if (r < 2) ans = pathWIthObstacle(p + 'D', r + 1, c);

        if (c < 2) ans.addAll(pathWIthObstacle(p + 'R', r, c + 1));

        return ans;
    }


    static void pathObstacleArray(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c])   //Generalise Solution when it finds false it didn't go through it
            return;

        if (r < maze.length - 1) pathObstacleArray(p + 'D',maze, r + 1, c);

        if (c < maze[0].length - 1) pathObstacleArray(p + 'R',maze, r, c + 1);
    }
}
