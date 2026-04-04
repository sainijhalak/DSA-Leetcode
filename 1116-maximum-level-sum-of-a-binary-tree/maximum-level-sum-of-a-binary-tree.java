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
    static void levelOrder(TreeNode root){
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return;
        q.add(root);
        int j=1;
         int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int sum=0;
           
           int n=q.size();
           for(int i=0;i<n;i++){
         TreeNode temp=q.poll();
         sum=sum+temp.val;
         if(temp.left!=null) q.add(temp.left);
         if(temp.right!=null) q.add(temp.right);
           }
         
           if(sum>max) {ans=j;
           max=sum;
           }
             
            j++;
        }

    }
    public int maxLevelSum(TreeNode root) {
        ans=0;
   
        levelOrder(root);
        return ans;
    }
}
