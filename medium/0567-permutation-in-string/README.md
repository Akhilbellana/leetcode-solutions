# Permutation in String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 
Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").


Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false


 
Constraints:


	1 <= s1.length, s2.length <= 104
	s1 and s2 consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-08-21T06:49:41.879Z  

```java
                    if(freq[k]!=0){
                        valid=false;
            if(j-i+1==s1.length()){
                for(int k=0;k<freq.length;k++){
            freq[s2.charAt(j)-'a']--;
            boolean valid=true;
        int j=0;
        while(j<s2.length()){
        int i=0;
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
        int[] freq=new int[26];
    public boolean checkInclusion(String s1, String s2) {
class Solution {

```

---

[View on LeetCode](https://leetcode.com/problems/permutation-in-string/)