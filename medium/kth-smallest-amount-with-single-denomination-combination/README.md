# Kth Smallest Amount With Single Denomination Combination

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T06:57:33.431Z  

```unknown
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int[] freq = new int[26];
4        for (int i = 0; i < s1.length(); i++) {
5            freq[s1.charAt(i) - 'a']++;
6        }
7        int i = 0;
8        int j = 0;
9        while (j < s2.length()) {
10            freq[s2.charAt(j) - 'a']--;
11            if (j - i + 1 == s1.length()) {
12                boolean valid = true;
13                for (int k = 0; k < freq.length; k++) {
14                    if (freq[k] != 0) {
15                        valid = false;
16                        break;
17                    }
18
19                }
20                if (valid) {
21                    return true;
22                } else {
23                    freq[s2.charAt(i) - 'a']++;
24                    i++;
25                }
26            }
27            j++;
28        }
29
30        return false;
31    }
32}
```

---

[View on LeetCode](https://leetcode.com/problems/kth-smallest-amount-with-single-denomination-combination/)