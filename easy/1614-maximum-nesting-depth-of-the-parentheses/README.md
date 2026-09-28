# Maximum Nesting Depth of the Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a **valid parentheses string** `s`, return the **nesting depth** of `s`. The nesting depth is the **maximum** number of nested parentheses.

 

**Example 1:**

**Input:** s = "(1+(2*3)+((8)/4))+1"

**Output:** 3

**Explanation:**

Digit 8 is inside of 3 nested parentheses in the string.

**Example 2:**

**Input:** s = "(1)+((2))+(((3)))"

**Output:** 3

**Explanation:**

Digit 3 is inside of 3 nested parentheses in the string.

**Example 3:**

**Input:** s = "()(())((()()))"

**Output:** 3

 

**Constraints:**

- 1 <= s.length <= 100
- s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
- It is guaranteed that parentheses expression s is a VPS.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 0.28%)  
**Memory:** 42.7 MB (beats 84.45%)  
**Submitted:** 2026-09-28T04:47:56.390Z  

```java
class Solution {
    public int maxDepth(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int j=i;
            int count1=0;
            int count2=0;
               while(j>=0){
                if(s.charAt(j)=='('){
                    count1++;

                }
                if(s.charAt(j)==')'){
                    count2++;
                }
                j--;
            }
            max=Math.max(max,Math.abs(count1-count2));
            
        }
        return max;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/)