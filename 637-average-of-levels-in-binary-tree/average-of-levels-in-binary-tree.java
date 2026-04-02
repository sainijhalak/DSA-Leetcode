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
    static void avgnikalo(TreeNode root,List<Double>list){
        Queue <TreeNode> q=new LinkedList<>();
        if(root==null) return;
        q.add(root);
        while(!q.isEmpty()){
             int n=q.size();
            Double sum=0.0;
            for(int i=0;i<n;i++){
        TreeNode temp=q.poll();
         sum=sum+temp.val;
         if(temp.left!=null) q.add(temp.left);
         if(temp.right!=null) q.add(temp.right);
            }
            Double avg=sum/n;
            list.add(avg);
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        avgnikalo(root,list);
        return list;
    }
}