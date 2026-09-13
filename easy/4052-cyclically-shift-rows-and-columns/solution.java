class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] ans1=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans1[i][(j - rowShift[i] + n) % n]=grid[i][j];
            }
        }
        int[][]ans2=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans2[(i-colShift[j]+n)%n][j]=ans1[i][j];
            }
        }
        return ans2;
        
    }
}