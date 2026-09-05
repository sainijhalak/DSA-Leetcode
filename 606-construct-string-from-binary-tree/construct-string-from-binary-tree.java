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
    static String ans;
    void preorder(TreeNode root){
        if(root==null) return;
        ans=ans+String.valueOf(root.val);
        if(root.left==null && root.right!=null){
             ans=ans+'(';
        preorder(root.left);
         ans=ans+')';

        ans=ans+'(';
         preorder(root.right);
        ans=ans+')';
       
        } 
        else if(root.left!=null && root.right==null){
          ans=ans+'(';
        preorder(root.left);
         ans=ans+')';

       
        }
        else if(root.left!=null && root.right!=null){
            ans=ans+'(';
        preorder(root.left);
         ans=ans+')';

        ans=ans+'(';
         preorder(root.right);
        ans=ans+')';
       
        }
     
         
    }
    public String tree2str(TreeNode root) {
        ans="";
        preorder(root);
        return ans;
    }
}