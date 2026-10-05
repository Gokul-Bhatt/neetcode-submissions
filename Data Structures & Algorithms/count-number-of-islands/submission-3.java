class Solution {
    void dfs(int i, int j, int n, int m, char[][] grid){
        if(i >= n || i < 0 || j >= m || j<0 || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        dfs(i+1,j,n,m,grid);
        dfs(i-1,j,n,m,grid);
        dfs(i,j+1,n,m,grid);
        dfs(i,j-1,n,m,grid);
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int count  = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(i,j,n,m,grid);
                }
            }
        }
        return count;
    }
}