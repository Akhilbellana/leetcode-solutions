# Contiguous Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

 
Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.


Example 2:

Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.


Example 3:

Input: nums = [0,1,1,1,1,1,0,0,0]
Output: 6
Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.


 
Constraints:


	1 <= nums.length <= 105
	nums[i] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.9 MB  
**Submitted:** 2026-08-16T12:43:04.083Z  

```java
      for(int i=0;i<nums.length;i++){
        for(int j=i;j<nums.length;j++){
            if(nums[j]==0){
                z++;
            }else{
        }
      }
                o++;
            }
            if(z==o){
                max=Math.max(max,j-i+1);
            }
      return max;  
        int max=0;
        int z=0;
        int o=0;
    public int findMaxLength(int[] nums) {
class Solution {
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/contiguous-array/)