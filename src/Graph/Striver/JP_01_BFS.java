package Graph.Striver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JP_01_BFS {
    public ArrayList<Integer> BFS(int V,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean[] vis=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);

            for(Integer it: adj.get(node)) {
                if (!vis[it]) {
                    q.add(it);
                    vis[it] = true;
                }
            }
        }
        return bfs;
    }
}
