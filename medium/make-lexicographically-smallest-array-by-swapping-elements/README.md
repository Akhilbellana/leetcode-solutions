# Make Lexicographically Smallest Array By Swapping Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T02:34:25.725Z  

```unknown
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int i=0;
4        int j=0;
5        while(i<s.length()&&j<t.length()){
6            if(s.charAt(i)==t.charAt(j)){
7                i++;
8                j++;
9            }else{
10                j++;
11            }
12        }
13         if(i==s.length()){
14            return true;
15         }
16        return false;
17        
18    }
19}
```

---

[View on LeetCode](https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/)