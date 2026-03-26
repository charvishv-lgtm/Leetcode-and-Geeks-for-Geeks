import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int countPaths(int n, int[][] edges) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int time = edge[2];
            adj.get(u).add(new int[]{v, time});
            adj.get(v).add(new int[]{u, time});
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        long[] ways = new long[n];
        dist[0] = 0;
        ways[0] = 1;
        int mod = 1000000007;

        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        pq.add(new long[]{0, 0});

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            long d = curr[0];
            int u = (int) curr[1];

            if (d > dist[u]) continue;

            for (int[] neighbor : adj.get(u)) {
                int v = neighbor[0];
                long w = neighbor[1];

                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    ways[v] = ways[u];
                    pq.add(new long[]{dist[v], v});
                } else if (dist[u] + w == dist[v]) {
                    ways[v] = (ways[v] + ways[u]) % mod;
                }
            }
        }
        
        return (int) ways[n - 1];
    }
}