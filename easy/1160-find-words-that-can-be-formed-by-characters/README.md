# Find Words That Can Be Formed by Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once for each word in words).

Return the sum of lengths of all good strings in words.

 
Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.


Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.


 
Constraints:


	1 <= words.length <= 1000
	1 <= words[i].length, chars.length <= 100
	words[i] and chars consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42 MB  
**Submitted:** 2026-08-06T18:26:23.061Z  

```java
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq=new int[26];
        for(char ch:chars.toCharArray()){
            freq[ch-'a']++;
        }
        int res=0;
        for(String word : words){
            boolean valid=true;
            int[] temp=freq.clone();
            for(char ch:word.toCharArray()){
                if(temp[ch-'a']==0){
                    valid=false;
                    break;
                }
                temp[ch-'a']--;
            }
            if(valid){
                res+=word.length();
            }
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/)