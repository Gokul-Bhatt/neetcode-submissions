/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     constructor(val = 0, left = null, right = null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    /**
     * @param {TreeNode} root
     * @return {number[]}
     */
    rightSideView(root) {
        if(!root) return [];
        let queue = [];
        let res = [];

        queue.push(root);

        while(queue.length){
            let size = queue.length;
            let temp = [];

            for(let i=0; i<size; i++){
                let curr = queue.shift();
                temp = curr.val;

                if(curr.left) queue.push(curr.left);
                if(curr.right) queue.push(curr.right);
            }
            res.push(temp);
        }
        return res;
    }
}
