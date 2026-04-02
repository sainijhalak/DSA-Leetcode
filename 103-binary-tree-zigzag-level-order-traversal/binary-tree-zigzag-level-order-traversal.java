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
    static void zigzaggy(TreeNode root,List<List<Integer>> list){
    Queue <TreeNode> q=new LinkedList<>();
    if(root!=null) q.add(root);
    Boolean m=true;
    while(!q.isEmpty()){
        List <Integer> l=new ArrayList<>();
        int n=q.size();
        if(m==true){

            for(int i=0;i<n;i++){
                TreeNode qq=q.poll();
                l.add(qq.val);
                if(qq.left!=null) q.add(qq.left);
            if(qq.right!=null) q.add(qq.right);
            }
            list.add(l);
            m=false;
        }
        else{
             for(int i=n-1;i>=0;i--){
                TreeNode qq=q.poll();
                l.add(qq.val);
                if(qq.left!=null) q.add(qq.left);
            if(qq.right!=null) q.add(qq.right);
            }
            Collections.reverse(l);
            list.add(l);
            m=true;
        }

    }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        zigzaggy(root,list);
        return list;
    }
}