class Solution {
    List<List<String>> res = new ArrayList<>();
    int N;
    boolean isValid(char[][] bord, int row, int col){

        for(int i=row-1; i>=0; i--){
            if(bord[i][col] == 'Q'){
                return false;
            }
        }

        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(bord[i][j] == 'Q'){
                return false;
            }
        }

        for(int i=row-1, j=col+1; i>=0 && j<N; i--,j++){
            if(bord[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    void solve(char[][] bord, int row){
        if(row == N){
            List<String> temp = new ArrayList<>();
            for(int i=0; i<N; i++){
                temp.add(new String(bord[i]));
            }
            res.add(temp);
            return;
        }

        for(int col=0; col<N; col++){
            if(isValid(bord, row,col) == true){
                bord[row][col] = 'Q';
                solve(bord,row+1);
                bord[row][col] = '.';
            }
        }

    }
    public List<List<String>> solveNQueens(int n) {
        char[][] bord = new char[n][n];
        N = n;
        for(char []row : bord){
            Arrays.fill(row,'.');
        }
        solve(bord, 0);
        return res;
    }
}
