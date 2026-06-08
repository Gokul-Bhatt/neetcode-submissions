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
    public boolean hasPathSum(TreeNode root, int targetSum) {
      return countsum(root,targetSum,0);
    }

    private boolean countsum(TreeNode root, int sum,int count){
          if(root == null) return false;
            count += root.val;
            if(root.left == null && root.right == null){
                if(count == sum) return true;
                else return false;
            }
             return countsum(root.left, sum, count) ||
             countsum(root.right, sum, count);
    }
}