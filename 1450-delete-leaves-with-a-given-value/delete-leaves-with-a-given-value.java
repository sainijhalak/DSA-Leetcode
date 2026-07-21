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
    TreeNode ComplexityN(TreeNode root,int t){
        if(root==null) return null;
        root.left=ComplexityN(root.left,t);
        root.right=ComplexityN(root.right,t);
          if(root.val==t && root.left==null && root.right==null){
            return null;
        }
        return root;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        root=ComplexityN(root,target);
        return root;
    }
}