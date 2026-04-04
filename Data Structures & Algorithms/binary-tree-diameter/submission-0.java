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
    int len = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return len;
    }
        private int dfs(TreeNode root){
            if(root == null) return 0;

            int leftL = dfs(root.left);
            int rightL = dfs(root.right);

            len = Math.max(leftL + rightL , len);
            return Math.max(leftL, rightL)+1;
        }
}
