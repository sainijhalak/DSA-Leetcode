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
     static void letsgo(TreeNode root, List <Integer> list){
        if(root==null) return;
        list.add(root.val);
        letsgo(root.left,list);
        letsgo(root.right,list);
     }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List <Integer> list =new ArrayList<>();
        letsgo(root1,list);
        letsgo(root2,list);
        Collections.sort(list);
        return list;
    }
}