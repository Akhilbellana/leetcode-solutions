# Distinct Subsequences

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T05:26:58.931Z  

```unknown
1class Solution {
2    public void duplicateZeros(int[] arr) {
3        List<Integer> list = new ArrayList<>();
4        for (int n : arr) {
5            if (n == 0) {
6                list.add(n);
7            }
8            list.add(n);
9        }
10        for (int i = 0; i < arr.length; i++) {
11            arr[i] = list.get(i);
12        }
13    }
14}
```

---

[View on LeetCode](https://leetcode.com/problems/distinct-subsequences/)