# Smallest Stable Index Ii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T17:07:28.608Z  

```unknown
1class Solution {
2    public int minBitFlips(int start, int goal) {
3        int z = start ^ goal;
4        int count = 0;
5        while (z > 0) {
6            if ((z & 1) == 1) {
7                count++;
8            }
9            z = z >> 1;
10        }
11        return count;
12
13    }
14}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-stable-index-ii/)