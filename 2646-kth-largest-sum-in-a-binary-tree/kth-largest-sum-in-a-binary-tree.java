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
    static void levelOrder(TreeNode root,List<Long>list){
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return;
        q.add(root);
        while(!q.isEmpty()){
            long sum=0;
           int n=q.size();
           for(int i=0;i<n;i++){
         TreeNode temp=q.poll();
         sum=sum+temp.val;
         if(temp.left!=null) q.add(temp.left);
         if(temp.right!=null) q.add(temp.right);
           }
           list.add(sum);

        }

    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> list=new ArrayList<>();
        levelOrder(root,list);
        Collections.sort(list);
        int s=list.size();
long ans=0;
        if(k>s){
            ans=-1;
        }
        else{
            ans=list.get(s-k);
        }
        return ans;
    }
}
