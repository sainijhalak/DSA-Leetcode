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
    static void orderLevel(TreeNode root ,List<Integer> l){
            Queue <TreeNode> q=new LinkedList<>();
            if(root!=null) q.add(root);
            int max=Integer.MIN_VALUE;
            while(!q.isEmpty()){
                int n=q.size();
                for(int i=0;i<n;i++){
                    TreeNode temp=q.poll();
                    max=Math.max(max,temp.val);
                    if(temp.left!=null) q.add(temp.left);
                    if(temp.right!=null) q.add(temp.right);
                }
                l.add(max);
                max=Integer.MIN_VALUE;
            }
    }
    public List<Integer> largestValues(TreeNode root) {
              List<Integer> l=new ArrayList<>();
        orderLevel(root,l);
        return l;
    }
}