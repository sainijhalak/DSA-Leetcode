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
    boolean dodo(TreeNode root){
        if(root.val==1) return true;
        if(root.val==0) return false;
        if(root.val==2) return dodo(root.left) || dodo(root.right);
        else return dodo(root.left) && dodo(root.right);
    }
    public boolean evaluateTree(TreeNode root) {
        return dodo(root);
    }
}