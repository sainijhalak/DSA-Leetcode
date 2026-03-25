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
    static void findsum(TreeNode root, String s,List<String> list){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s=s+root.val;
            list.add(s);
            return;
        }
        findsum(root.left,s+root.val,list);
        findsum(root.right,s+root.val,list);
        
    }
    public int sumNumbers(TreeNode root) {
        List<String>list =new ArrayList<>();
        String s="";
        findsum(root,s,list);
        int sum=0;
      for(int i=0;i<list.size();i++){
        sum=sum+Integer.parseInt(list.get(i));
      }
        return sum;
    }
}