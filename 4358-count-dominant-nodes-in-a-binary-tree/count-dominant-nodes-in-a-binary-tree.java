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
    static int count;
    boolean check(TreeNode root,int max,boolean ans){
        if(root==null) return ans;
        if(root.val>max){
            ans=false;
        }
       ans=check(root.left,max,ans);
        ans=check(root.right,max,ans);
        return ans;
    }
    void letsTry(TreeNode root){
        if(root==null) return;
        if(root.left==null &&  root.right==null){
            count++;
            return;
        }
        int max=root.val;
        boolean left=check(root.left,max,true);
        boolean right=check(root.right,max,true);
        if(left && right) count++;
        letsTry(root.left);
        letsTry(root.right);
    }
    public int countDominantNodes(TreeNode root) {
        count=0;
        letsTry(root);
        return count;
    }
}