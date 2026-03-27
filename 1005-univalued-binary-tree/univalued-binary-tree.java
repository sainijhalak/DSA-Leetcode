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
     static Boolean ans=true;
     static void find(TreeNode root,int val){
       if(root==null) return;
       if(root.val!=val){
        ans=false;
       }
       find(root.left,val);
       find(root.right,val);
     }
    public boolean isUnivalTree(TreeNode root) {
       ans=true;
        find(root,root.val);
        return ans;
    }
}