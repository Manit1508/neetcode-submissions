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
    public boolean isBalanced(TreeNode root) {
        
        if(root==null){
            return true;
        }

        int l = maxHeight(root.left);
        int r = maxHeight(root.right);

        int d = Math.abs(l-r);

        if(d>1){
            return false;
        } 
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxHeight(TreeNode root){
        if(root==null){
            return 0;
        }

        int left = maxHeight(root.left);
        int right = maxHeight(root.right);

        return 1 + Math.max(left,right);
    }
}
