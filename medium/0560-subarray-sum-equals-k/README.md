# Subarray Sum Equals K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 
Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Example 2:
Input: nums = [1,2,3], k = 3
Output: 2

 
Constraints:


	1 <= nums.length <= 2 * 104
	-1000 <= nums[i] <= 1000
	-107 <= k <= 107

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-08-13T19:37:45.428Z  

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        int i=0;
        int j=0;
        int count=0;
        int sum=0;
        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>k){
                sum=sum-nums[i];
                i++;
            }
            if(sum==k){
                count++;
            }
                j++;
           
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-sum-equals-k/)