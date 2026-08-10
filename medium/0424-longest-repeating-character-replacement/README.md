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
**Runtime:** 0 ms  
**Memory:** 42.3 MB  
**Submitted:** 2026-08-10T18:23:06.609Z  

```java
            int count=map.getOrDefault(s.charAt(j),0)+1;
            map.put(s.charAt(j),count);
            maxcount=Math.max(maxcount,count);
            while((j-i+1)-maxcount>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
            }
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
        while(j<s.length()){
        int maxlen=0;
        int maxcount=0;
        int j=0;
        int i=0;
        Map<Character, Integer>map=new HashMap<>();
    public int characterReplacement(String s, int k) {
            maxlen=Math.max(maxlen,j-i+1);

```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)