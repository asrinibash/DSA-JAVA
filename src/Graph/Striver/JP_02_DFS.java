package Graph.Striver;

import java.util.ArrayList;

public class JP_02_DFS {
    public void dfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> is){
        vis[node]=true;
        is.add(node);
        for(Integer it: adj.get(node)){
            if(!vis[it]){
                dfs(it,vis,adj,is);
            }
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> is = new ArrayList<>();
        boolean[] vis = new boolean[V];
        dfs(0, vis, adj, is);
        return is; 
    }
}
