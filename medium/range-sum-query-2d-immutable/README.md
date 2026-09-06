# Range Sum Query 2d Immutable

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T15:38:11.057Z  

```unknown
1class NumMatrix {
2int[][] prefix;
3    public NumMatrix(int[][] matrix) {
4        int m=matrix.length;
5        int n=matrix[0].length;
6        prefix=new int[m+1][n+1];
7        for(int i=1;i<=m;i++){
8            for(int j=1;j<=n;j++){
9                prefix[i][j]=matrix[i-1][j-1]+prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1];
10            }
11        }
12        
13    }
14    
15    public int sumRegion(int row1, int col1, int row2, int col2) {
16        return prefix[row2+1][col2+1]-prefix[row1][col2+1]-prefix[row2+1][col1]+prefix[row1][col1];
17        
18    }
19}
20
21/**
22 * Your NumMatrix object will be instantiated and called as such:
23 * NumMatrix obj = new NumMatrix(matrix);
24 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
25 */
```

---

[View on LeetCode](https://leetcode.com/problems/range-sum-query-2d-immutable/)