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
    void veerTumBadheChle(TreeNode root,int t,TreeNode p){
        if(root==null) return;
        if(root.left!=null && root.left.val==t && root.left.left==null && root.left.right==null){
            root.left=null;
            veerTumBadheChle(p,t,p);
        }
        if(root.right!=null && root.right.val==t && root.right.left==null && root.right.right==null){
            root.right=null;
            veerTumBadheChle(p,t,p);
        }
        veerTumBadheChle(root.left,t,p);
        veerTumBadheChle(root.right,t,p);
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        veerTumBadheChle(root,target,root);
        if(root.left==null && root.right==null && root.val==target) {
            root=null;
        }
        return root;
    }
}