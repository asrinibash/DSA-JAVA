package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JP_03_BFS_And_DFS {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;

        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
           graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }
    public static void BFS(ArrayList<Edge>[] graph,int v,boolean[] visit,int start){
        Queue<Integer> que=new LinkedList<>();
        que.add(0);
        while(!que.isEmpty()){
            int curr=que.remove();
            if(!visit[curr]){
                System.out.print(curr+" ");
                visit[curr]=true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e=graph[curr].get(i);
                    que.add(e.dest);
                }
            }
        }
    }
    public static void DFS(ArrayList<Edge>[] graph,int curr,boolean[] vis){
        System.out.print(curr+" ");
        vis[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]) {
                DFS(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int vertex=7;
        ArrayList<Edge>[] graph=new ArrayList[vertex];
        createGraph(graph);
        boolean[] visit=new boolean[vertex];
   //if graph is a sub of total graph we use loop to find it's all vertex
//        for (int i = 0; i < visit.length ; i++) {
//            if(!visit[i]){
//                BFS(graph,vertex,visit,i);
//            }
//        }

        //
        
        
//        DFS(graph,0,visit);  //if graph is total entity

        //if graph is sub graph
        for (int i = 0; i < vertex; i++) {
            if(!visit[i])
                DFS(graph,i,visit);
        }
    }
}
