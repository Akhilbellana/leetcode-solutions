class Solution {
    public void rotate(int[][] matrix) {
        int[][]temp=new int[matrix.length][matrix[0].length];
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[j][n-i-1]=temp[i][j];
            }
        }

        
    }
}