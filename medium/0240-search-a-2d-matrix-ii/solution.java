class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int l=0;
            int h=matrix[0].length-1;
            while(l<=h){
                int m=l+(h-l)/2;
                if(matrix[i][m]==target){
                    return true;
                }else if(matrix[i][m]>target){
                    h=m-1;
                }else{
                    l=m+1;
                }
            }
        }
        return false;
        
    }
}