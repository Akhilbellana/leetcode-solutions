# Sum of Beauty of All Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The **beauty** of a string is the difference in frequencies between the most frequent and least frequent characters.

- For example, the beauty of "abaacc" is 3 - 1 = 2.

Given a string `s`, return *the sum of **beauty** of all of its substrings.*

 

**Example 1:**

```
Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
```

**Example 2:**

```
Input: s = "aabcbaa"
Output: 17

```

 

**Constraints:**

- 1 <= s.length <= 500
- s consists of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 521 ms (beats 14.51%)  
**Memory:** 46.7 MB (beats 15.97%)  
**Submitted:** 2026-09-26T19:11:44.999Z  

```java
class Solution {
    public int beautySum(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int values : map.values()) {
                    max = Math.max(max, values);
                    min = Math.min(min, values);
                }
                count += (max - min);
            }
        }
        return count;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-beauty-of-all-substrings/)