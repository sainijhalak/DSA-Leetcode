class Solution {
    static int ans;

    int minnikalladle(TreeNode temp, int min) {
        if (temp == null) return min;

        min = Math.min(min, temp.val);

        int leftMin = minnikalladle(temp.left, min);
        int rightMin = minnikalladle(temp.right, min);

        return Math.min(min, Math.min(leftMin, rightMin));
    }

    int maxnikalladle(TreeNode temp, int max) {
        if (temp == null) return max;

        max = Math.max(max, temp.val);

        int leftMax = maxnikalladle(temp.left, max);
        int rightMax = maxnikalladle(temp.right, max);

        return Math.max(max, Math.max(leftMax, rightMax));
    }

    void Retrying(TreeNode root) {
        if (root == null) return;

        int leftmin = minnikalladle(root, root.val);
        int rightmax = maxnikalladle(root, root.val);

        int l = Math.abs(root.val - leftmin);
        int r = Math.abs(root.val - rightmax);

        ans = Math.max(ans, Math.max(l, r));

        Retrying(root.left);
        Retrying(root.right);
    }

    public int maxAncestorDiff(TreeNode root) {
        ans = 0;
        Retrying(root);
        return ans;
    }
}