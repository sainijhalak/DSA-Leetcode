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
   static void create(TreeNode root,List<TreeNode>list,int i,int n){
   if(i==n) return;
   if(i>n) return;
   root.right=list.get(i);
   root.left=null;
   create(root.right,list,i+1,n);
   }
    static void traverse (TreeNode root,List<TreeNode>list){
        if(root==null) return;
        
        list.add(root);
        traverse(root.left,list);
        traverse(root.right,list);
    } 
    public void flatten(TreeNode root) {
        List<TreeNode>list=new ArrayList<>();
        traverse(root,list);
       int i=1;
       int n=list.size();
       create (root,list,i,n);
    }
}