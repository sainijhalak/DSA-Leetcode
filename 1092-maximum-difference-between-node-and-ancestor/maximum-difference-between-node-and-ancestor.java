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

        int leftmin;
        int rightmin;
        int leftmax;
        int rightmax;

        if (root.left != null) {
            leftmin = minnikalladle(root.left, root.left.val);
            leftmax = maxnikalladle(root.left, root.left.val);

            int l1 = Math.abs(root.val - leftmin);
            int l2 = Math.abs(root.val - leftmax);

            ans = Math.max(ans, Math.max(l1, l2));
        }

        if (root.right != null) {
            rightmin = minnikalladle(root.right, root.right.val);
            rightmax = maxnikalladle(root.right, root.right.val);

            int r1 = Math.abs(root.val - rightmin);
            int r2 = Math.abs(root.val - rightmax);

            ans = Math.max(ans, Math.max(r1, r2));
        }

        Retrying(root.left);
        Retrying(root.right);
    }

    public int maxAncestorDiff(TreeNode root) {
        ans = 0;
        Retrying(root);
        return ans;
    }
}