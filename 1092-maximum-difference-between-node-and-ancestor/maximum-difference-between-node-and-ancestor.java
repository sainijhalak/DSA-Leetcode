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
    static int ans;

    void optimalHojaSimSim(TreeNode root,int min,int max){
        if(root==null) return;
        min=Math.min(min,root.val);
        max=Math.max(max,root.val);
        optimalHojaSimSim(root.left,min,max);
        optimalHojaSimSim(root.right,min,max);
        int mi=Math.abs(root.val-min);
        int ma=Math.abs(root.val-max);
        ans=Math.max(ans,Math.max(mi,ma));
    }
    public int maxAncestorDiff(TreeNode root) {
        ans=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        optimalHojaSimSim(root,min,max);
        return ans;
    }
}