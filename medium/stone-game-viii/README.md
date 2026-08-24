# Stone Game Viii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T13:17:03.527Z  

```unknown
1class Solution {
2    public int minSubarray(int[] nums, int p) {
3       Map<Integer,Integer>map=new HashMap<>();
4       map.put(0,-1);
5       long tot=0;
6       for(int n:nums){
7        tot+=n;
8       }
9       int target=(int)(tot%p);
10       if(target==0){
11        return 0;
12       }
13       int min=Integer.MAX_VALUE;
14       long sum=0;
15       for(int i=0;i<nums.length;i++){
16           sum+=nums[i];
17           int req=(int)((sum%p-target+p)%p);
18           if(map.containsKey(req)){
19            min=Math.min(min,i-map.get(req));
20           }
21           map.put((int)(sum%p),(i));
22       }
23       if(min==Integer.MAX_VALUE || min==nums.length){
24        return -1;
25       }else{
26        return min;
27       }
28    }
29}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-viii/)