# Maximum Length Substring With Two Occurrences

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.
 
Example 1:


Input: s = "bcbbbcba"

Output: 4

Explanation:
The following substring has a length of 4 and contains at most two occurrences of each character: "bcbbbcba".

Example 2:


Input: s = "aaaa"

Output: 2

Explanation:
The following substring has a length of 2 and contains at most two occurrences of each character: "aaaa".

 
Constraints:


	2 <= s.length <= 100
	s consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.1 MB  
**Submitted:** 2026-08-14T05:11:28.687Z  

```java
        Map<Character,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        int len=0;
        while(j<s.length()){
            while(map.get(s.charAt(j))>2){
               map.put(s.charAt(i),map.get(s.charAt(i))-1);
               if(map.get(s.charAt(i))==0){
                map.remove(s.charAt(i));
                 i++;
               
            }
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    public int maximumLengthSubstring(String s) {
class Solution {
               }
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

```

---

[View on LeetCode](https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/)