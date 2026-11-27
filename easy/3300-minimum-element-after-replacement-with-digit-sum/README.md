# Minimum Element After Replacement With Digit Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

You replace each element in `nums` with the **sum** of its digits.

Return the **minimum** element in `nums` after all replacements.

 

Original
Java
**Example 1:**

**Input:** nums = [10,12,13,14]

**Output:** 1

**Explanation:**

`nums` becomes `[1, 3, 4, 5]` after all replacements, with minimum element 1.

**Example 2:**

**Input:** nums = [1,2,3,4]

**Output:** 1

**Explanation:**

`nums` becomes `[1, 2, 3, 4]` after all replacements, with minimum element 1.

**Example 3:**

**Input:** nums = [999,19,199]

**Output:** 10

**Explanation:**

`nums` becomes `[27, 10, 19]` after all replacements, with minimum element 10.

 

**Constraints:**

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 44.2 MB (beats 78.90%)  
**Submitted:** 2026-11-27T11:46:15.247Z  

```java
class Solution {
    public int minElement(int[] nums) {
        int res=Integer.MAX_VALUE;
        for(int n:nums){
            int num=n;
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            res=Math.min(res,sum);
        }
        return res;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/)