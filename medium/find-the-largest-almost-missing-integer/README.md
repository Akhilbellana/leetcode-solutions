# Find The Largest Almost Missing Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T17:53:16.213Z  

```unknown
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int count=0;
4        int max=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1){
7                count++;
8                if(count>max){
9                    max=count;
10                }
11            }else{
12                count=0;
13            }
14        }
15        return max;
16    }
17}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-largest-almost-missing-integer/)