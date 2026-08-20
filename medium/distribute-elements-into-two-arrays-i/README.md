# Distribute Elements Into Two Arrays I

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T20:09:08.163Z  

```unknown
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int sum = 0;
4        while (n > 0) {
5            int digit = n % 10;
6            sum+=digit;
7            n = n / 10;
8        }
9        return sum;
10    }
11}        
```

---

[View on LeetCode](https://leetcode.com/problems/distribute-elements-into-two-arrays-i/)