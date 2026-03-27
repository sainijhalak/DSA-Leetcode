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
 
    static Boolean sums(TreeNode root,int t,int sum){
        if(root==null) return false;
      if(root.left==null && root.right==null) {
        if(sum+root.val==t){
            return true; 
        }
       }
      
     return sums(root.left,t,sum+root.val)||sums(root.right,t,sum+root.val);
     
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        Boolean ans=sums(root,targetSum,sum);
        return ans;
    }
}