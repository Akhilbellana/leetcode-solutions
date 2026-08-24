# Stone Game Viii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T06:38:12.326Z  

```unknown
1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int min=Integer.MAX_VALUE;
4        int max=Integer.MIN_VALUE;
5        List<Integer>list=new ArrayList<>();
6        for(int n:arr){
7            list.add(n);
8        }
9        int count=0;
10        int i=1;
11        while(count<=k){
12            if(!list.contains(i)){
13                count++;
14            }
15            if(count==k){
16                return i;
17            }
18            i++;
19        }
20        return -1;
21        
22    }
23}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-viii/)