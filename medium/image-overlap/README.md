# Image Overlap

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T09:53:19.210Z  

```unknown
1class Solution {
2    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
3        int[][] ans1=new int[n][n];
4        for(int i=0;i<n;i++){
5            for(int j=0;j<n;j++){
6                ans1[i][(j - rowShift[i] + n) % n]=grid[i][j];
7            }
8        }
9        int[][]ans2=new int[n][n];
10        for(int i=0;i<n;i++){
11            for(int j=0;j<n;j++){
12                ans2[(i-colShift[j]+n)%n][j]=ans1[i][j];
13            }
14        }
15        return ans2;
16        
17    }
18}
```

---

[View on LeetCode](https://leetcode.com/problems/image-overlap/)