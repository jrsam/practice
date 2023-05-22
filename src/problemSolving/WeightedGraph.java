package problemSolving;

import java.util.LinkedList;

public class WeightedGraph {

    static class Node {
        int weight;
        int vertex;

        public Node(int weight, int vertex) {
            this.weight = weight;
            this.vertex = vertex;
        }
    }

    static class Graph {
        private int V;

        private LinkedList<Node>[] adj;


        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        void addEdge(int from, int to, int weight) {
            adj[from].add(new Node(to, weight));
        }
    }

    public static void main(String[] args) {
        int[][] graph = new int[][] {{1, 4, 200},
           {1, 2, 5},
           {1, 3, 10},
           {2, 3, 4},
           {2, 4, 150},
           {3, 4, 100}};
        System.out.println(solution(4, graph));;


    }
    static int solution(int n, int[][] network) {
        Graph graph = new Graph(n);

        for(int i=0; i<network.length; i++) {
            graph.addEdge(i, network[i][1], network[i][2]);
        }
        return 0;

    }


}
