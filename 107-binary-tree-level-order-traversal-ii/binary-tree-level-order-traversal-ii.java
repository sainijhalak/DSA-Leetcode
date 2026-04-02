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
    static void  levelsbkeniklenge(TreeNode root ,List<List<Integer>> list){
        Queue <TreeNode> q=new LinkedList<>();
        if(root==null) return ;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode m=q.poll();
                l.add(m.val);
                 if(m.left!=null) q.add(m.left);
            if(m.right!=null) q.add(m.right);
            }
            list.add(l);
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>  list=new ArrayList<>();
        levelsbkeniklenge(root,list);
        Collections.reverse(list);
        return list;
    }
}