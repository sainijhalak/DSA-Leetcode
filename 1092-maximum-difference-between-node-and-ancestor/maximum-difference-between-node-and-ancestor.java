class Solution {
    static int ans;

    int[] minMax(TreeNode temp) {
        if (temp == null) {
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        }

        int[] left = minMax(temp.left);
        int[] right = minMax(temp.right);

        int min = Math.min(temp.val, Math.min(left[0], right[0]));
        int max = Math.max(temp.val, Math.max(left[1], right[1]));

        return new int[]{min, max};
    }

    void Retrying(TreeNode root) {
        if (root == null) return;

        int[] mm = minMax(root);

        ans = Math.max(ans, Math.abs(root.val - mm[0]));
        ans = Math.max(ans, Math.abs(root.val - mm[1]));

        Retrying(root.left);
        Retrying(root.right);
    }

    public int maxAncestorDiff(TreeNode root) {
        ans = 0;
        Retrying(root);
        return ans;
    }
}