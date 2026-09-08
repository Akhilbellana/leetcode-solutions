# Count Commas In Range

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T07:50:06.030Z  

```unknown
1class Solution {
2    public int countCommas(int n) {
3        int count=0;
4        for(int i=1;i<=n;i++){
5            if(i>=1000){
6                count++;
7            }
8        }
9        return count;
10    }
11}
```

---

[View on LeetCode](https://leetcode.com/problems/count-commas-in-range/)