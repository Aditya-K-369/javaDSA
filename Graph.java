import java.util.*;

public class Graph {
    int v;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int v) {
        this.v = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void printAdj() {
        for (int i = 0; i < v; i++) {
            System.out.println(i + "->" + adj.get(i).toString());
        }
    }

    public void bfs() {
        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        boolean[] vis = new boolean[v];
        vis[0] = true;
        while (que.size() > 0) {
            int u = que.remove();
            System.out.println(u);
            for (int v : adj.get(u)) {
                if (!vis[v]) {
                    vis[v] = true;
                    que.add(v);
                }
            }
        }

    }

    void dfsHelper(int u, boolean[] vis) {
        System.out.println(u);
        vis[u] = true;
        for (int v : adj.get(u)) {
            if (!vis[v]) {
                dfsHelper(v, vis);
            }
        }
    }

    void dfs() {
        boolean[] vis = new boolean[v];
        dfsHelper(0, vis);
    }

    boolean isCycleDFS(int u, int par, boolean[] vis) {
        vis[u] = true;
        for (int v : adj.get(u)) {
            if (!vis[v]) {
                if (isCycleDFS(v, u, vis)) {
                    return true;
                }
            } else if (v != par) {
                return true;
            }
        }
        return false;
    }

    boolean isCycle() {
        boolean[] vis = new boolean[v];
        return isCycleDFS(0, -1, vis);
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        // g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.printAdj();
        g.bfs();
        // g.dfs();
        System.out.println(g.isCycle());
    }
}
