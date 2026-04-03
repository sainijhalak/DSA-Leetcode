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
    static Boolean ans;
    static int sum;
    static void pathsum(TreeNode root,int targetSum,int sum){
        if(root==null) return;
        if(root.left==null && root.right==null){
          int temp=sum+root.val;
            if(temp==targetSum) ans=true;
        }
        pathsum(root.left,targetSum,sum+root.val);
          pathsum(root.right,targetSum,sum+root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ans=false;
        sum=0;
        pathsum(root,targetSum,sum);
        return ans;
    }
}