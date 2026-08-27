# Lexicographically Smallest Permutation Greater Than Target

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T13:04:48.742Z  

```unknown
1class Solution {
2    public int hammingWeight(int n) {
3        int count=0;
4        for(int i=0;i<31;i++){
5            if((n & (1<<i))!=0){
6                count++;
7            }
8        }
9        return count;
10        
11    }
12}
```

---

[View on LeetCode](https://leetcode.com/problems/lexicographically-smallest-permutation-greater-than-target/)