# Stone Game Viii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T09:42:00.845Z  

```unknown
1class Solution {
2    public String kthDistinct(String[] arr, int k) {
3        HashMap<String,Integer> map=new HashMap<>();
4        for(String s:arr) map.put(s,map.getOrDefault(s,0)+1);
5        int c=0;
6        for(String s:arr){
7            if(map.get(s)==1){
8                c++;
9                if(c==k) return s;
10            }
11        }
12        return "";
13    }
14}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-viii/)