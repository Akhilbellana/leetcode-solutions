# Longest Subsequence With Non Zero Bitwise Xor

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T12:57:55.364Z  

```unknown
1class Solution {
2    public int romanToInt(String s) {
3        char[] a = s.toCharArray();
4        int x = 0;
5
6        for (int i = 0; i < a.length; i++) {
7
8            int current = value(a[i]);
9
10            if (i + 1 < a.length && current < value(a[i + 1])) {
11                x -= current;
12            } else {
13                x += current;
14            }
15        }
16
17        return x;
18    }
19
20    public int value(char c) {
21        if (c == 'I') return 1;
22        if (c == 'V') return 5;
23        if (c == 'X') return 10;
24        if (c == 'L') return 50;
25        if (c == 'C') return 100;
26        if (c == 'D') return 500;
27        return 1000;
28    }
29}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/)