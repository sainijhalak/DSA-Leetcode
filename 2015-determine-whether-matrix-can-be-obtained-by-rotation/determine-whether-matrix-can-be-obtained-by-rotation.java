class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        for (int k = 0; k < 4; k++) {

            boolean same = true;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] != target[i][j]) {
                        same = false;
                        break;
                    }
                }
                if (!same) break;
            }

            if (same) return true;

            int[][] ans = new int[mat.length][mat[0].length];

            for (int i = 0; i < mat.length; i++) {
                int j = mat.length - 1;
                for (int m = 0; m < mat[0].length; m++) {
                    ans[i][m] = mat[j][i];
                    j--;
                }
            }

            mat = ans;
        }

        return false;
    }
}