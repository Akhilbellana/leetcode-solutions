class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] ans=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=grid[i][(j - rowShift[i] + n) % n];
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans[i][j]=grid[(i-colShift[j]+n)%n][j];
            }
        }
        return ans;
        
    }
}