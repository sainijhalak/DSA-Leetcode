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
    void letsDoThis(TreeNode root,int max){
        if(root==null) return;
        if(root.val>=max){
            count++;
            max=Math.max(max,root.val);
        }
        letsDoThis(root.left,max);
        letsDoThis(root.right,max);
    }
    public int goodNodes(TreeNode root) {
        count=0;
        int max=root.val;
        letsDoThis(root,max);
        return count;
    }
}