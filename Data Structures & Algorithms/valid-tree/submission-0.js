class Solution {
    validTree(n, edges) {
        if (edges.length !== n - 1) return false;
        let adj = Array.from({ length: n }, () => []);
        let visited = new Array(n).fill(false);
        for (let [u, v] of edges) {
            adj[u].push(v);
            adj[v].push(u);
        }
        const dfs = (node) => {
            visited[node] = true;
            for (let u of adj[node]) {
                if (!visited[u]) {
                    dfs(u);
                }
            }
        };
        dfs(0);
        for (let i = 0; i < n; i++) {
            if (!visited[i]) return false;
        }

        return true;
    }
}