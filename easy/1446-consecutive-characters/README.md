# Consecutive Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

The **power** of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string `s`, return *the **power** of* `s`.

 

**Example 1:**

```
Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.

```

**Example 2:**

```
Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

```

 

**Constraints:**

- 1 <= s.length <= 500
- s consists of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 43.6 MB (beats 26.99%)  
**Submitted:** 2026-10-07T18:14:13.930Z  

```java
class Solution {
    public int maxPower(String s) {
        int i = 0;
        int count = 1;
        int max = 0;
        while (i < s.length() - 1) {
            char ch = s.charAt(i);
            if (s.charAt(i) != s.charAt(i + 1)) {
                max = Math.max(count, max);
                count = 1;
            } else {
                count++;
            }
            i++;
        }
        max = Math.max(max, count);
        return max;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/consecutive-characters/)