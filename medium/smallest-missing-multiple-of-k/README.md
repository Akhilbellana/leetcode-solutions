# Smallest Missing Multiple Of K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T09:28:38.284Z  

```unknown
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        Set<Integer>set=new HashSet<>();
4        for(int n:nums){
5            set.add(n);
6        }
7        int i=1;
8        int val=k;
9        while(set.contains(val)){
10            val=i*k;
11            i++;
12        }
13        return val;
14        
15    }
16}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-missing-multiple-of-k/)