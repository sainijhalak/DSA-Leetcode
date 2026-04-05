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
    static void sum2(TreeNode root,int targetSum,  List<List<Integer>>list,List<Integer>l,int sum){
        if(root==null) return ;
        if(root.left==null && root.right==null){
            if(sum+root.val==targetSum) {
                l.add(root.val);
               list.add(new ArrayList<>(l));
               l.remove(l.size() - 1);
                return;
            }

        }
        l.add(root.val);
        sum2(root.left,targetSum,list,l,sum+root.val);
        sum2(root.right,targetSum,list,l,sum+root.val);
        l.remove(l.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        int sum=0;
        sum2(root,targetSum,list,l,sum);
        return list;
    }
}