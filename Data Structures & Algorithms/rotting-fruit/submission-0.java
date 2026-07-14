class pair{
    int row;
    int col;
    int minute;

    pair(int row, int col, int minute){
        this.row = row;
        this.col = col;
        this.minute = minute;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cntfresh = 0;
        Queue<pair> queue = new LinkedList<>();
        int visited[][] = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 2){
                    queue.offer(new pair(i,j,0));
                }else{
                    visited[i][j] = 0;
                }
                if(grid[i][j] == 1) cntfresh++;
            }
        }

        int tm = 0;
        int drow[] = {-1,0,+1,0};
        int dcol[] = {0,1,0,-1};
        int cnt = 0;

while (!queue.isEmpty()) {
    pair curr = queue.poll();

    int r = curr.row;
    int c = curr.col;
    int t = curr.minute;

    tm = Math.max(tm, t);

    for (int i = 0; i < 4; i++) {
        int nrow = r + drow[i];
        int ncol = c + dcol[i];

        if (nrow >= 0 && nrow < m &&
            ncol >= 0 && ncol < n &&
            visited[nrow][ncol] == 0 &&
            grid[nrow][ncol] == 1) {

            queue.offer(new pair(nrow, ncol, t + 1));
            visited[nrow][ncol] = 2;
            cnt++;
        }
    }
}

 if(cnt != cntfresh) return -1;
 return tm;         
    }
}