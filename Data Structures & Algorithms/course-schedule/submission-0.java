class Solution {
    private boolean dfs(boolean[] visited, boolean[] parent, int i,ArrayList<ArrayList<Integer>> adj){
        visited[i] = true;
        parent[i] = true;

        for(int u : adj.get(i)){
            if(!visited[u]){
                if(dfs(visited,parent,u,adj)) return true;
            }else if(parent[u]){
                return true;
            } 
        }
        parent[i] = false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[numCourses];
        boolean[] parent = new boolean[numCourses];
        

        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : prerequisites){
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
        }

        for(int i=0; i<numCourses; i++){
            if(!visited[i]){
                if(dfs(visited,parent,i,adj)){
                    return false;
                }
            }
        }
        return true;
    }
}
