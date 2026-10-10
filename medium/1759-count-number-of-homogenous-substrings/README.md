# Count Number of Homogenous Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return *the number of **homogenous** substrings of *`s`*.* Since the answer may be too large, return it **modulo** `109 + 7`.

A string is **homogenous** if all the characters of the string are the same.

A **substring** is a contiguous sequence of characters within a string.

 

**Example 1:**

```
Input: s = "abbcccaa"
Output: 13
Explanation: The homogenous substrings are listed as below:
"a"   appears 3 times.
"aa"  appears 1 time.
"b"   appears 2 times.
"bb"  appears 1 time.
"c"   appears 3 times.
"cc"  appears 2 times.
"ccc" appears 1 time.
3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.
```

**Example 2:**

```
Input: s = "xy"
Output: 2
Explanation: The homogenous substrings are "x" and "y".
```

**Example 3:**

```
Input: s = "zzzzz"
Output: 15

```

 

**Constraints:**

- 1 <= s.length <= 105
- s consists of lowercase letters.

## Solution

**Language:** Java  
**Runtime:** 11 ms (beats 65.54%)  
**Memory:** 47.4 MB (beats 66.84%)  
**Submitted:** 2026-10-10T17:52:09.892Z  

```java
class Solution {
    public int countHomogenous(String s) {
        int i = 0;
        int j = 0;
        long count = 0;
        int m = (int) 1e9 + 7;
        while (j < s.length()) {
            if (j > 0 && s.charAt(j) != s.charAt(j - 1)) {
                count+=(long) (j - i) * (j - i + 1) / 2;
                count %= m;
                i = j;
            }

            j++;
        }
        count +=(long) (j - i) * (j - i + 1) / 2;
        count %= m;
        return (int)count;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-number-of-homogenous-substrings/)