class Solution {
    /**
     * @param {number[]} coins
     * @param {number} amount
     * @return {number}
     */
    coinChange(coins, amount) {
    let res = new Array(amount + 1).fill(amount + 1);
    res[0] = 0;
    
    for (let i = 1; i <= amount; i++) {
        for (let c of coins) {
            if (i - c >= 0) {
                res[i] = Math.min(res[i], res[i - c] + 1);
            }
        }
    }
    
    return res[amount] === amount + 1 ? -1 : res[amount];
    }
}
