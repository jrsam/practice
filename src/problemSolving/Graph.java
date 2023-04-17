package problemSolving;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Graph {
    private int V;


    private LinkedList<Integer>[] adj;
    private int adja[];



    @SuppressWarnings("unchecked")
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }


    void addEdge(int v, int w) {
        adj[v].add(w);
    }


    void DFSUtil(int v, boolean visited[]) {

        visited[v] = true;
        System.out.print(v + " ");


        List<Integer> i = adj[v].stream().collect(Collectors.toList());

        i.forEach(elem -> {
            if (!visited[elem])
                DFSUtil(elem, visited);
        });
    }


    void DFS(int v) {


        boolean visited[] = new boolean[V];


        DFSUtil(v, visited);
    }


    public static void main(String args[]) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        g.DFS(2);
    }
}
