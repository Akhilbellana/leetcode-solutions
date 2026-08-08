# Maximum Product of Three Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 
Example 1:
Input: nums = [1,2,3]
Output: 6
Example 2:
Input: nums = [1,2,3,4]
Output: 24
Example 3:
Input: nums = [-1,-2,-3]
Output: -6

 
Constraints:


	3 <= nums.length <= 104
	-1000 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 1 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-08-08T11:28:41.606Z  

```java
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product=1;
        for(int i=nums.length-1;i>=nums.length-3;i--){
            product*=nums[i];
        }
        return product;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/)