# Smallest Stable Index Ii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T14:09:42.897Z  

```unknown
1class Solution {
2    public String toLowerCase(String s) {
3        StringBuilder sb=new StringBuilder();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(ch>='A'&&ch<='Z'){
7            ch=(char)(ch-'A'+'a');
8            }
9            sb.append(ch);
10        }
11        
12        return sb.toString();
13        
14    }
15}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-stable-index-ii/)