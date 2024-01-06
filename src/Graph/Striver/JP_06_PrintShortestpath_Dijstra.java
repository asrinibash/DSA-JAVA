package Graph.Striver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

//graph-Striver video no.-35
public class JP_06_PrintShortestpath_Dijstra {
    static class Pair {
        private final int first;
        private final int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static List<Integer> shortestPath(int n, int m, int[][] edges) {
        ArrayList<ArrayList<Pair>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<Pair>());
        }
        for (int i = 0; i <= m; i++) {
            list.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
            list.get(edges[i][1]).add(new Pair(edges[i][0], edges[i][2]));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> (a.first - b.first));
        int[] dist = new int[n + 1];
        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dist[i] = (int) 1e9;
            parent[i] = i;
        }
        pq.add(new Pair(0, 1));
        dist[1] = 0;

        while (!pq.isEmpty()) {
            Pair it = pq.remove();
            int node = it.first;
            int dis = it.second;

            for (Pair itr : list.get(node)) {
                int adjNode = itr.first;
                int edW=itr.second;
                if(dis+edW>dist[adjNode]){
                    dist[adjNode]=dis+edW;
                    pq.add(new Pair(edW+dis,adjNode));
                    parent[adjNode]=node;
                }
            }
        }
        List<Integer> path=new ArrayList<>();
        if(dist[n]==1e9){
            path.add(-1);
            return path;
        }
        int node =n;
        while(parent[node]!=node){
            path.add(node);
            node=parent[node];
        }
        path.add(1);
        Collections.reverse(path);
        return path;
    }


}
