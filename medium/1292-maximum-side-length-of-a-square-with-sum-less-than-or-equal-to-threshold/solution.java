class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int n=mat.length;
        int m=mat[0].length;
        int[][]prefix=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                prefix[i][j]=mat[i-1][j-1]+prefix[i][j-1]+prefix[i-1][j]-prefix[i-1][j-1];
            }
        }
        int max=0;
        for(int size=1;size<=Math.min(n,m);size++){
        for(int r=0;r+size<=n;r++){
