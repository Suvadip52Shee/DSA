//package Graph;
//
//import java.util.*;
//
//public class Traversal_types {
//    static class Edge{
//        int src;
//        int des;
//
//        public Edge(int s,int d){
//            this.src = s;
//            this.des = d;
//        }
//    }
//    public static void createGraph(ArrayList<Edge>[] graph){
//        for(int i=0;i<graph.length;i++){
//            graph[i] = new ArrayList<Edge>();
//        }
////        graph[0].add(new Edge(0,1));
////        graph[0].add(new Edge(0,2));
////
////        graph[1].add(new Edge(1,0));
////        graph[1].add(new Edge(1,3));
////
////        graph[2].add(new Edge(2,0));
////        graph[2].add(new Edge(2,4));
////
////        graph[3].add(new Edge(3,1));
////        graph[3].add(new Edge(3,4));
////        graph[3].add(new Edge(3,5));
////
////        graph[4].add(new Edge(4,2));
////        graph[4].add(new Edge(4,3));
////        graph[4].add(new Edge(4,5));
////
////        graph[5].add(new Edge(5,3));
////        graph[5].add(new Edge(5,4));
////        graph[5].add(new Edge(5,6));
////
////        graph[6].add(new Edge(6,5));
//        graph[0].add(new Edge(0,2));
//        graph[1].add(new Edge(1,0));
//        graph[2].add(new Edge(2,3));
//        graph[3].add(new Edge(3,0));
//    }
////    For Breath First Search Traversal
////    public static void bfs(ArrayList<Edge>[] graph, int V,boolean[] vis,int start){
////        Queue<Integer> q = new LinkedList<>();
////        q.add(start);
////        while(!q.isEmpty()){
////            int curr = q.remove();
////            if(vis[curr] == false){
////                System.out.print(curr+" ");
////                vis[curr] = true;
////                for(int i=0;i<graph[curr].size();i++){
////                    Edge e = graph[curr].get(i);
////                    q.add(e.des);
////                }
////            }
////        }
////    }
////    For Depth First Search Traversal  Time Complexity - 0(V+E)
////    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] vis){
////        System.out.print(curr+" ");
////        vis[curr] = true;
////
////        for(int i=0;i<graph[curr].size();i++){
////            Edge e = graph[curr].get(i);
////            if(vis[e.des] == false)
////                dfs(graph,e.des,vis);
////        }
////    }
////     All path from Source to Target
////    Time complexity - 0(V^V)
////    public static void printAllPath(ArrayList<Edge>[] graph,boolean[] vis,int curr,String path,int tar){
////        if(curr == tar){
////            System.out.println(path);
////            return;
////        }
////        for(int i=0;i<graph[curr].size();i++){
////            Edge e = graph[curr].get(i);
////            if(!vis[e.des]){
////                vis[curr] = true;
////                printAllPath(graph,vis,e.des,path+e.des,tar);
////                vis[curr] = false;
////            }
////        }
////    }
////    In a directed graph, check cycle exist or not
////    using dfs
//    public static boolean isCycleDirected(ArrayList<Edge>[] graph,boolean[] vis,int curr,boolean[] rec){
//        vis[curr] = true;
//        rec[curr] = true;
//        for(int i=0;i<graph[curr].size();i++){
//            Edge e = graph[curr].get(i);
////            Check the cycle condition
//            if(rec[e.des]){
//                return true;
//            }
//            else if(!vis[e.des]){
//                if(isCycleDirected(graph,vis,e.des,rec)){
//                    return true;
//                }
//            }
//        }
//        rec[curr] = false;
//        return false;
//    }
//    public static void main(String[] args) {
////        Time complexity O(V+E)
//        int V = 4;
////        For connected graph
////        For disconnected graph
//        /*
//         1 --- 3
//        /      | \
//       0       |  5 -- 6
//        \      | /
//         2 ---- 4
//        */
//       ArrayList<Edge>[] graph = new ArrayList[V];
//       createGraph(graph);
//
////        boolean[] vis = new boolean[V];
////        for(int i=0;i<V;i++){
////            if(vis[i] == false){
////                bfs(graph,V,vis,i);
////            }
////        }
////        dfs(graph,0,vis);
////        System.out.println();
////        Print all path from source to destination
////        int src = 0, tar = 5;
////        printAllPath(graph,new boolean[V],src,"0",tar);
//        System.out.println(isCycleDirected(graph,new boolean[V],0,new boolean[V]));
//    }
//}
