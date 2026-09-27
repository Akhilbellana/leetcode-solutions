# Reverse Substrings Between Each Pair of Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should **not** contain any brackets.

 

**Example 1:**

```
Input: s = "(abcd)"
Output: "dcba"

```

**Example 2:**

```
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.

```

**Example 3:**

```
Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

```

 

**Constraints:**

- 1 <= s.length <= 2000
- s only contains lower case English characters and parentheses.
- It is guaranteed that all parentheses are balanced.

## Solution

**Language:** Java  
**Runtime:** 11 ms (beats 36.71%)  
**Memory:** 42.7 MB (beats 97.78%)  
**Submitted:** 2026-09-27T16:19:35.941Z  

```java
class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(' || ch == ')') {
                count++;
            }
        }
        while (count > 0) {
            int temp1 = -1;
            int temp2 = -1;
                for(int i=0;i<sb.length();i++){
                    if(sb.charAt(i)=='('){
                        temp1=i;
                    }
                }
                for (int i = temp1 + 1; i < sb.length(); i++) {
                    if (sb.charAt(i) == ')') {
                        temp2 = i;
                        break;
                    }
                }
            int left = temp1 + 1;
            int right = temp2 - 1;
            while (left < right) {
                char ch1 = sb.charAt(left);
                char ch2 = sb.charAt(right);
                sb.setCharAt(right, ch1);
                sb.setCharAt(left, ch2);
                left++;
                right--;
            }
            sb.deleteCharAt(temp2);
            sb.deleteCharAt(temp1);

            count = count - 2;
        }
        return sb.toString();

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/)