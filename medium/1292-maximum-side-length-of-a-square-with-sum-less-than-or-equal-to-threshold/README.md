# Maximum Side Length of a Square with Sum Less than or Equal to Threshold

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a m x n matrix mat and an integer threshold, return the maximum side-length of a square with a sum less than or equal to threshold or return 0 if there is no such square.

 
Example 1:

Input: mat = [[1,1,3,2,4,3,2],[1,1,3,2,4,3,2],[1,1,3,2,4,3,2]], threshold = 4
Output: 2
Explanation: The maximum side length of square with sum less than or equal to 4 is 2 as shown.


Example 2:

Input: mat = [[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2]], threshold = 1
Output: 0


 
Constraints:


	m == mat.length
	n == mat[i].length
	1 <= m, n <= 300
	0 <= mat[i][j] <= 104
	0 <= threshold <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.4 MB  
**Submitted:** 2026-09-10T18:03:37.288Z  

```java
class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int n=mat.length;
        int m=mat[0].length;
        int[][]prefix=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                prefix[i][j]=mat[i-1][j-1]+prefix[i][j-1]+prefix[i-1][j]-prefix
                [i-1][j-1];
            }
        }
        for(int r=0;r+size<=n;r++){
            for(int c=0;c+size<=m;c++){
        for(int size=1;size<Math.min(n,m);size++){
        int max=0;
                int r1=r;
                int r2=r+size-1;
                int c1=c;
                int c2=c+size-1;
                int sum=prefix[r2+1][c2+1]-prefix[r1][c2+1]-prefix[r2+1][c1]

```

---

[View on LeetCode](https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/)