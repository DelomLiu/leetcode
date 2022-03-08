class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length, n=accounts[0].length;
        int max=0;
        for (int i=0; i<m; i++) {
            int num=0;
            for (int j=0; j<n; j++) {
                num+=accounts[i][j];
            }
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}