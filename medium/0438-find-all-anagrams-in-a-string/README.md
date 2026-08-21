# Find All Anagrams in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

 
Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".


Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".


 
Constraints:


	1 <= s.length, p.length <= 3 * 104
	s and p consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 98.41%)  
**Memory:** 46.9 MB (beats 58.99%)  
**Submitted:** 2026-08-21T17:52:44.395Z  

```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq = new int[26];
        List<Integer> list = new ArrayList<>();
        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            freq[s.charAt(j) - 'a']--;
            if (j - i + 1 == p.length()) {
                boolean valid = true;
                for (int n : freq) {
                    if (n != 0) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    list.add(i);
                }
                freq[s.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return list;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)