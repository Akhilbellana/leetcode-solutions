# Single Number II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` where every element appears **three times** except for one, which appears **exactly once**. *Find the single element and return it*.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

**Example 1:**

```
Input: nums = [2,2,3,2]
Output: 3

```

**Example 2:**

```
Input: nums = [0,1,0,1,0,1,99]
Output: 99

```

 

**Constraints:**

- 1 <= nums.length <= 3 * 104
- -231 <= nums[i] <= 231 - 1
- Each element in nums appears exactly three times except for one element which appears once.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 43.81%)  
**Memory:** 46.7 MB (beats 10.12%)  
**Submitted:** 2026-09-26T02:40:25.732Z  

```java
class Solution {
    public int singleNumber(int[] nums) {
       Map<Integer,Integer>map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=3){
                return nums[i];
            }
        }
        return -1;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-number-ii/)