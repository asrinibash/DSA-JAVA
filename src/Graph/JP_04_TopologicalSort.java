package Graph;

import Graph.Questions.JP_01_CycleDetection;

import java.util.ArrayList;
import java.util.Stack;

public class JP_04_TopologicalSort {
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));
        graph[5].add(new Edge(5, 2));
        graph[5].add(new Edge(5, 0));
    }
   static void topologicalSort(ArrayList<Edge>[] graph,int vertex){
       Stack<Integer> stack=new Stack<>();
       boolean[] vis=new boolean[vertex];
       for (int i = 0; i < vertex; i++) {
           if(!vis[i]){
               topoUtil(graph,i,vis,stack);
           }
       }
       while(!stack.isEmpty()){
           System.out.print(stack.pop()+" ");
       }
   }

    private static void topoUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> stack) {
        vis[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
               topoUtil(graph,e.dest,vis,stack);
            }
        }
        stack.push(curr);
    }

    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph);
        topologicalSort(graph,V);
    }

}
