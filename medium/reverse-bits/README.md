# Reverse Bits

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T14:12:58.522Z  

```unknown
1class Solution {
2    public int reverseBits(int n) {
3        int ans = 0;
4        for (int i = 0; i < 32; i++) {
5            int z = n & 1;
6            n = n >> 1;
7            ans = ans << 1;
8            ans = ans | z;
9        }
10        return ans;
11
12    }
13}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-bits/)