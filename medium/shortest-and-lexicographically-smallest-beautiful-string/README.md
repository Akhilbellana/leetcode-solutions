# Shortest And Lexicographically Smallest Beautiful String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T03:13:21.589Z  

```unknown
1class Solution {
2    public String shortestBeautifulSubstring(String s, int k) {
3        int ones = 0;
4        int i = 0;
5        int j = 0;
6        int min = Integer.MAX_VALUE;
7        String best = "";
8        while (j < s.length()) {
9            char st = s.charAt(j);
10            if (st == '1') {
11                ones++;
12            }
13            while (ones > k) {
14                if (s.charAt(i) == '1') {
15                    ones--;
16
17                }
18                i++;
19            }
20            while (ones == k) {
21                if (j - i + 1 < min) {
22                    best = s.substring(i, j + 1);
23                    min = j - i + 1;
24                } else if (min == j - i + 1) {
25                    for (int a = 0; a < min; a++) {
26                        if (best.charAt(a) != s.charAt(a + i)) {
27                            if (s.charAt(a + i) == '0') {
28                                best = s.substring(i, j + 1);
29                                
30                            }
31                            break;
32                        }
33                    }
34                }
35                if (s.charAt(i) == '1') {
36                    ones--;
37                }
38
39                i++;
40            }
41            j++;
42        }
43        return best;
44
45    }
46}
```

---

[View on LeetCode](https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string/)