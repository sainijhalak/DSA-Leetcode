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
    void findingLeftView(TreeNode root){
        Queue <TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null) {
                    if(temp.left.left==null && temp.left.right==null) sum=sum+temp.left.val;
                    else q.add(temp.left);
                    }
                if(temp.right!=null) q.add(temp.right);
            }
        }
    }
    public int sumOfLeftLeaves(TreeNode root) {
        sum=0;
        findingLeftView(root);
        return sum;
    }
}