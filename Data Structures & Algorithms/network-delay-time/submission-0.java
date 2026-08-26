class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : times) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new int[]{v, w});
        }
        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int[] res = new int[n + 1];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[k] = 0;
        pq.offer(new int[]{0, k});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int distance = curr[0];
            int node = curr[1];
            if (distance > res[node]) continue;
            for (int[] u : adj.get(node)) {
                int adjnode = u[0];
                int wt = u[1];
                if (distance + wt < res[adjnode]) {
                    res[adjnode] = distance + wt;
                    pq.offer(new int[]{res[adjnode], adjnode});
                }
            }
        }
        int mx = 0;
        for (int i = 1; i <= n; i++) {
            if (res[i] == Integer.MAX_VALUE) {
                return -1;
            }
            mx = Math.max(mx, res[i]);
        }
        return mx;
    }
}