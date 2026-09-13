    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans[i][j]=grid[i][(j - rowShift[j] + n) % n];
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans[i][j]=grid[(i-colShift[i]+n)%n][j];
            }
        }
        
        return ans;
class Solution {
        int[][] ans=new int[n][n];
