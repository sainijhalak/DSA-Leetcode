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
    public static int height(TreeNode root){

                if(root == null) return 0;

                return 1 + Math.max(height(root.left), height(root.right));

        }
    public static void balanceCheck(TreeNode root){
        if(root==null) return;
        int l=height(root.left);
        int r=height(root.right);
        if((Math.abs(l-r)<=1)==false){
ans=false;
        };
        balanceCheck(root.left);
        balanceCheck(root.right);
    }
    public boolean isBalanced(TreeNode root) {
        ans=true;
        balanceCheck(root);
        return ans;
    }
}