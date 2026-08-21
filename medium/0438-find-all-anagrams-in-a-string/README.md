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
**Runtime:** 0 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-08-21T17:16:28.788Z  

```java
        for(int i=0;i<p.length();i++){
            if(map.containsKey(s.charAt(i))&& valid){
        }
                temp=i;
            }else if(map.containsKey(s.charAt(i))){
        boolean valid=true;
                valid=false;
                 map.put(s.charAt(i),map.get(s.charAt(i))-1);
            }
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
            for(int values : map.values()){
                if(values!=0){
            }
                    break;
                }
            valid=true;
            list.add(temp);
        }
            map.put(ch,map.getOrDefault(ch,0)+1);
        for(char ch:s.toCharArray()){
        List<Integer>list=new ArrayList<>();
        return list;
        
        int temp=-1;
    }

```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)