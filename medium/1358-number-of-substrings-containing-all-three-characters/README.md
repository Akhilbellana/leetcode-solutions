# Number of Substrings Containing All Three Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

 
Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 


Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 


Example 3:

Input: s = "abc"
Output: 1


 
Constraints:


	3 <= s.length <= 5 x 104
	s only consists of 'a', 'b' or 'c' characters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.5 MB  
**Submitted:** 2026-08-29T11:33:48.156Z  

```java
                    map.put(s.charAt(k), map.get(s.charAt(k)) + 1);
                    for (int value : map.values()) {
                        if (value == 0) {
                            break;
                            valid = false;
                for (int k = i; k <= j; k++) {
                        }
                    }
                    boolean valid = true;
            for (int j = i; j < s.length(); j++) {
        for (int i = 0; i < s.length(); i++) {
                Map<Character, Integer> map = new HashMap<>();
                map.put('a', 0);
                map.put('b', 0);
                map.put('c', 0);
                    if (valid) {

```

---

[View on LeetCode](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/)