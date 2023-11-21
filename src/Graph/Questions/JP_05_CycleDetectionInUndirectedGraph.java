package Graph.Questions;

import java.util.ArrayList;

public class JP_05_CycleDetectionInUndirectedGraph {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
//        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
//        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }
     static boolean isCycleExistUndirectedGraph(ArrayList<Edge>[] graph,int curr,boolean[] vis,int parent){
        vis[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if(vis[e.dest] && e.dest!=parent){
                return true;
            }
            else if(!vis[e.dest]){
                if(isCycleExistUndirectedGraph(graph,e.dest,vis,curr)){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph= new ArrayList[V];
        createGraph(graph);
//        boolean[] vis=new boolean[V];
//        boolean cycle = false;
        System.out.println(isCycleExistUndirectedGraph(graph,0,new boolean[V],-1));
//        for (int i = 0; i <graph.length; i++) {
//            if(!vis[i]){
//                cycle= isCycleExistUndirectedGraph(graph,i,vis,-1);
//            }
//            if(cycle){
//                System.out.println(cycle);
//                break;
//            }
//        }

    }
}
