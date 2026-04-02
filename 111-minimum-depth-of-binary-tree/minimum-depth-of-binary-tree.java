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
    static int minniDippi(TreeNode root){
        if(root==null) return 0;
      if(root.left==null && root.right!=null) return 1+ minniDippi(root.right);
        if(root.left!=null && root.right==null) return 1+minniDippi(root.left);
        return 1+Math.min(minniDippi(root.left),minniDippi(root.right));
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
          return minniDippi(root);
          
    }
}