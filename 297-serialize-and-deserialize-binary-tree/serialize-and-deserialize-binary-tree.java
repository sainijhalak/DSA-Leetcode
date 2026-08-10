/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp==null){
                sb.append("null");
            sb.append(",");
            continue;
            }
            else{
                 sb.append(String.valueOf(temp.val));
            sb.append(",");
            }
           
            if(temp.left!=null){
                q.add(temp.left);
            }
            else{
                q.add(null);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            else{
                q.add(null);
            }
        }
            String data=sb.toString();
        return data.substring(0,data.length()-1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String []arr=data.trim().split(",");
        TreeNode []num=new TreeNode[arr.length];
        for(int i=0;i<num.length;i++){
            if(arr[i].equals("null")) {
                num[i]=null;
                continue;
            }
            num[i]=new TreeNode(Integer.valueOf(arr[i]));
        }
         if(num[0]==null) return null;
      Queue <TreeNode> q = new LinkedList<>();
        TreeNode root=num[0];
        q.add(num[0]);
        int i=0;
        while(!q.isEmpty() && i<arr.length){
             TreeNode temp=q.poll();
             i++;
             if(i<arr.length && !arr[i].equals("null")){
                temp.left=num[i];
                q.add(num[i]);
             }
             else{
                temp.left=null;
             }
             i++;
             if(i<arr.length && !arr[i].equals("null")){
                temp.right=num[i];
                q.add(num[i]);
             }
             else{
                temp.right=null;
             }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));