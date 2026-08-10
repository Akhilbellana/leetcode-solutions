# Longest Repeating Character Replacement

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

 
Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.


Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.

 
Constraints:


	1 <= s.length <= 105
	s consists of only uppercase English letters.
	0 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 66.46%)  
**Memory:** 46.2 MB (beats 50.81%)  
**Submitted:** 2026-08-10T18:31:59.814Z  

```java
class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int maxfreq=0;
        int maxlen=0;
        int[] freq=new int[26];
        while(j<s.length()){
           freq[s.charAt(j)-'A']++;
           maxfreq=Math.max(maxfreq,freq[s.charAt(j)-'A']);
            while((j-i+1)-maxfreq>k){
                freq[s.charAt(i)-'A']--;
                i++;
                }  
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)