# Find Three Consecutive Integers That Sum to a Given Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer `num`, return *three consecutive integers (as a sorted array)** that **sum** to *`num`. If `num` cannot be expressed as the sum of three consecutive integers, return* an **empty** array.*

 

**Example 1:**

```
Input: num = 33
Output: [10,11,12]
Explanation: 33 can be expressed as 10 + 11 + 12 = 33.
10, 11, 12 are 3 consecutive integers, so we return [10, 11, 12].

```

**Example 2:**

```
Input: num = 4
Output: []
Explanation: There is no way to express 4 as the sum of 3 consecutive integers.

```

 

**Constraints:**

- 0 <= num <= 1015

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 6.53%)  
**Memory:** 42.4 MB (beats 99.25%)  
**Submitted:** 2026-10-16T07:21:46.935Z  

```java
class Solution {
    public long[] sumOfThree(long num) {
        if (num % 3 != 0) {
            return new long[] {};
        }
        long ans = (num / 3) - 1;
        return new long[] { ans, ans + 1, ans + 2 };
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number/)