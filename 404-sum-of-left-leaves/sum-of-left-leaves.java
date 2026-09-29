class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int sum = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();

            if (temp.left != null) {
                if (temp.left.left == null &&
                    temp.left.right == null) {
                    sum += temp.left.val;
                } else {
                    q.add(temp.left);
                }
            }

            if (temp.right != null) {
                q.add(temp.right);
            }
        }

        return sum;
    }
}