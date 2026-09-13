# Cyclically Shift Rows And Columns

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T09:04:09.876Z  

```unknown
1class Solution {
2    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
3
4        int arr1[][] = new int[n][n];
5        for(int i=0;i<n;i++){
6            int kpos=rowShift[i]%n;
7            for(int j=0;j<n;j++){
8                arr1[i][j]=grid[i][(j+kpos)%n];
9            }
10        }
11
12        int arr2[][]=new int[n][n];
13        for(int j=0;j<n;j++){
14            int kpos=colShift[j]%n;
15            for(int i=0;i<n;i++){
16                arr2[i][j]=arr1[(i+kpos)%n][j];
17            }
18        }
19        return arr2;
20    }
21}
```

---

[View on LeetCode](https://leetcode.com/problems/cyclically-shift-rows-and-columns/)