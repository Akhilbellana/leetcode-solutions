# Smallest Stable Index Ii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T14:12:11.751Z  

```unknown
1class Solution {
2    public boolean isHappy(int n) {
3        Set<Integer> set = new HashSet<>();
4        while (n != 1) {
5
6            if (set.contains(n)) {
7                return false;
8            }
9            set.add(n);
10            int sum = 0;
11            while (n > 0) {
12                int digit = n % 10;
13                sum += digit * digit;
14                n = n / 10;
15            }
16            if (sum == 1) {
17                return true;
18            }
19            n = sum;
20        }
21        return true;
22
23    }
24}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-stable-index-ii/)