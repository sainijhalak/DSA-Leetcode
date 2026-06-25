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
    int Retry(TreeNode root){
        if(root==null) return 0;
        int sum=sum(root);
        int n=count(root);
        int ans=0;
        if((sum/n)==root.val) ans=1;
        return Retry(root.left)+Retry(root.right)+ans;
    }
int sum(TreeNode root){
 if(root==null) return 0;
 return sum(root.left)+sum(root.right)+root.val;
}
int count(TreeNode root){
    if(root==null) return 0;
    return count(root.left)+count(root.right)+1;
    }
    public int averageOfSubtree(TreeNode root) {
        int a= Retry(root);
        return a;
    }
}