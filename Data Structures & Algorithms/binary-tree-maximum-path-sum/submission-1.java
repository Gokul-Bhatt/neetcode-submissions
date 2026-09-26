/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int max_sum;
    private int solve(TreeNode root){
        if(root == null) return 0;

        int l = solve(root.left);
        int r = solve(root.right);

        int got_sum_at_bottom = l + r + root.val;
        int case1 = Math.max(l,r) + root.val;
        int case2 = root.val;

        int temp = Math.max(case1, case2);
        int comp = Math.max(temp, got_sum_at_bottom);
        max_sum = Math.max(max_sum,comp);

        return temp; 
    }
    public int maxPathSum(TreeNode root) {
        max_sum = Integer.MIN_VALUE;
        solve(root);
        return max_sum;
    }
}
