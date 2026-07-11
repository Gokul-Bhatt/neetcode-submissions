class Solution {
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[n]; 
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int count = 0;

        for(int i=0; i<n; i++){
            if(!visited[i]){
                count++;
                dfs(adj,i,visited);
            }
        }
        return count;
    }

public void dfs(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited){
    visited[i] = true;
    for(int u : adj.get(i)){
        if(!visited[u]){
            dfs(adj, u, visited);
        }
    }
}
}