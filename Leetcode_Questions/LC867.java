class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        // for size: row size and col size will be inverted
        int[][] ans = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                // row entry becomes column entry and column etry becomes row entry
                ans[i][j] = matrix[j][i];
            }
            System.out.println();
        }
        return ans;
    }
}
