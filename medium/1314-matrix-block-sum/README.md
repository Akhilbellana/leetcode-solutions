# Matrix Block Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a m x n matrix mat and an integer k, return a matrix answer where each answer[i][j] is the sum of all elements mat[r][c] for:


	i - k <= r <= i + k,
	j - k <= c <= j + k, and
	(r, c) is a valid position in the matrix.


 
Example 1:

Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[12,21,16],[27,45,33],[24,39,28]]


Example 2:

Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 2
Output: [[45,45,45],[45,45,45],[45,45,45]]


 
Constraints:


	m == mat.length
	n == mat[i].length
	1 <= m, n, k <= 100
	1 <= mat[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 96.06%)  
**Memory:** 46.3 MB (beats 97.33%)  
**Submitted:** 2026-09-08T02:47:00.269Z  

```java
class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] prefix=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                prefix[i][j]=mat[i-1][j-1]+prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1];
            }
        }
        int[][]answer=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int r1=Math.max(i-k,0);
                int r2=Math.min(i+k,n-1);
                int c1=Math.max(j-k,0);
                int c2=Math.min(j+k,m-1);
                answer[i][j]=prefix[r2+1][c2+1]-prefix[r1][c2+1]-prefix[r2+1][c1]+prefix[r1][c1];
            }
        }
        return answer;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/matrix-block-sum/)