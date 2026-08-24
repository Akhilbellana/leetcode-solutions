# Stone Game Viii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T10:11:31.746Z  

```unknown
1class Solution {
2    public String kthDistinct(String[] arr, int k) {
3        Map<String,Integer>map=new HashMap<>();
4        for(String s:arr){
5            map.put(s,map.getOrDefault(s,0)+1);
6        }
7        int count=0;   
8        for(int i=0;i<arr.length;i++){
9            if(map.get(arr[i])==1){
10                count++;
11            }
12            if(count==k){
13                return arr[i];
14            }
15        }
16        return "";
17    }
18}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-viii/)