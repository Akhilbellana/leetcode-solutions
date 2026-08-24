# Stone Game Viii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T04:51:02.929Z  

```unknown
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        int n=nums.length;
4        long max=0;
5        long sum=0;
6        HashSet<Integer>set=new HashSet<>();
7        int i=0;
8        int j=0;
9        while(j<n){
10           while(set.contains(nums[j])){
11           set.remove(nums[i]);
12           sum-=nums[i];
13           i++;
14           }
15           set.add(nums[j]);
16           sum+=nums[j];
17            
18           if(j-i+1==k){
19                max=Math.max(max,sum);
20                set.remove(nums[i]);
21                sum-=nums[i];
22                i++;
23           }
24           j++;
25        }
26        return max;
27
28    }
29}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-viii/)