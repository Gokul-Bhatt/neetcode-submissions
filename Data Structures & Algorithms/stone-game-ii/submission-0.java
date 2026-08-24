class Solution {

    int n;
    int[][][] t = new int[2][101][101];
    private int solve(int[] piles, int person, int i, int m) {
        if (i >= n) {
            return 0;
        }
        if (t[person][i][m] != -1) {
            return t[person][i][m];
        }
        int res;
        if (person == 1) {
            res = -1;
        } else {
            res = Integer.MAX_VALUE;
        }
        int stones = 0;
        for (int x = 1; x <= Math.min(2 * m, n - i); x++) {
            stones += piles[i + x - 1];
            if (person == 1) {
                res = Math.max(
                    res,
                    stones + solve(
                        piles,
                        0,
                        i + x,
                        Math.max(m, x)
                    )
                );
            } else {
                res = Math.min(
                    res,
                    solve(
                        piles,
                        1,
                        i + x,
                        Math.max(m, x)
                    )
                );
            }
        }
        return t[person][i][m] = res;
    }
    public int stoneGameII(int[] piles) {
        n = piles.length;
        for (int p = 0; p < 2; p++) {
            for (int i = 0; i < 101; i++) {
                java.util.Arrays.fill(t[p][i], -1);
            }
        }
        return solve(piles, 1, 0, 1);
    }
}