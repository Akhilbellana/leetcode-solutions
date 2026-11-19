# Power of Three

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, return *`true` if it is a power of three. Otherwise, return `false`*.

An integer `n` is a power of three, if there exists an integer `x` such that `n == 3x`.

 

Original
Java
**Example 1:**

```
Input: n = 27
Output: true
Explanation: 27 = 33

```

**Example 2:**

```
Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.

```

**Example 3:**

```
Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).

```

 

**Constraints:**

- -231 <= n <= 231 - 1

 

**Follow up:** Could you solve it without loops/recursion?

## Solution

**Language:** Java  
**Runtime:** 28 ms (beats 7.68%)  
**Memory:** 46 MB (beats 36.85%)  
**Submitted:** 2026-11-19T06:34:29.167Z  

```java
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/power-of-three/)