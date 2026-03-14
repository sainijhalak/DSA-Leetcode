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
    static int sum=0;
    static int height(TreeNode root){
        if(root==null) return -1;
        return 1+Math.max(height(root.left),height(root.right));
    }
    static void sum(TreeNode root, int n){
        if(root==null) return;
 if(n==0){
sum=sum+root.val;
        }
        sum(root.left,n-1);
        sum(root.right,n-1);

    }
    public int deepestLeavesSum(TreeNode root) {
      sum=0;
      if(root.left==null && root.right==null){
        return root.val;
      }
     int n1= height(root);

      sum(root,n1);
      
       return sum;
    }
}