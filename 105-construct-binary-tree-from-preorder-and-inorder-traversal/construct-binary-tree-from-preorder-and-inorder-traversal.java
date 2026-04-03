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
    static TreeNode letsBuild(int[] preorder, int pl,int ph,int[] inorder,int il,int ih){
        if(pl>ph) return null;
        TreeNode root=new TreeNode(preorder[pl]);
        int i=il;
        while(inorder[i]!=preorder[pl])i++;
        int ls=i-il;  
       root.left=letsBuild(preorder,pl+1,pl+ls,inorder,il,i-1);
       root.right=letsBuild(preorder,pl+ls+1,ph,inorder,i+1,ih);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return letsBuild(preorder,0,n-1,inorder,0,n-1);
        
    }
}