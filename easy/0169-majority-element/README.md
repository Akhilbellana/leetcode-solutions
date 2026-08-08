# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

 
Constraints:


	n == nums.length
	1 <= n <= 5 * 104
	-109 <= nums[i] <= 109
	The input is generated such that a majority element will exist in the array.


 
Follow-up: Could you solve the problem in linear time and in O(1) space?

## Solution

**Language:** Java  
**Runtime:** 17 ms (beats 16.68%)  
**Memory:** 52.7 MB (beats 80.69%)  
**Submitted:** 2026-08-08T02:51:18.652Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)>nums.length/2){
                return n;
            }
        }
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)