package Graph.Questions;

import Graph.JP_02_ImplOfWeightedGraph;

import java.util.ArrayList;

public class JP_01_CycleDetection {
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
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    static boolean isCycleInDirectedGraph(ArrayList<Edge>[] graph,boolean[] vis,boolean[] rec,int curr){
        vis[curr]=true;
        rec[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }
           else if(!vis[e.dest] && isCycleInDirectedGraph(graph,vis,rec,e.dest)){
                    return true;
            }
        }
        rec[curr]=false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean[] vis = new boolean[graph.length];
        boolean[] rec = new boolean[vis.length];
//        System.out.println(isCycleInDirectedGraph(graph,new boolean[V],new boolean[V],0));
        for (int i = 0; i < graph.length; i++) {
            if(!vis[i]) {
               boolean isCyc =isCycleInDirectedGraph(graph, vis, rec, i);
               if(isCyc){
                   System.out.println(isCyc);
                    break;
                }
            }
        }

     }
}
