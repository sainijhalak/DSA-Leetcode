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
    static void letsgo(TreeNode root,String s,List <String> list){
      if(root==null) return ;
      if(root.left==null && root.right==null) {
        s=s+root.val;
        list.add(s);
        return;
      }
      letsgo(root.left,s+root.val,list);
        letsgo(root.right,s+root.val,list);
    }
    public int sumRootToLeaf(TreeNode root) {
        List <String> list=new ArrayList<>();
        letsgo(root,"",list);
        int sum=0;
        for(int i=0;i<list.size();i++){
            int num = Integer.parseInt(list.get(i), 2);
            sum=sum+num;
        }
        return sum;
    }
}