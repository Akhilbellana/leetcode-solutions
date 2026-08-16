# Subarray Sums Divisible by K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

 
Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]


Example 2:

Input: nums = [5], k = 9
Output: 0


 
Constraints:


	1 <= nums.length <= 3 * 104
	-104 <= nums[i] <= 104
	2 <= k <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.5 MB  
**Submitted:** 2026-08-16T10:28:23.763Z  

```java
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
     for(int i=0;i<nums.length;i++){
        int sum=0;
        for(int j=i;j<nums.length;j++){
            sum+=nums[j];
        }
     }   
            if(sum%k==0){
                count++;
            }
    }
        int count=0;
     return count;
}

```

---

[View on LeetCode](https://leetcode.com/problems/subarray-sums-divisible-by-k/)