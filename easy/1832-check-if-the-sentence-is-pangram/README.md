# Check if the Sentence Is Pangram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A **pangram** is a sentence where every letter of the English alphabet appears at least once.

Given a string `sentence` containing only lowercase English letters, return `true`* if *`sentence`* is a **pangram**, or *`false`* otherwise.*

 

**Example 1:**

```
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

```

**Example 2:**

```
Input: sentence = "leetcode"
Output: false

```

 

**Constraints:**

- 1 <= sentence.length <= 1000
- sentence consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 29.70%)  
**Memory:** 42.3 MB (beats 95.56%)  
**Submitted:** 2026-11-06T17:12:27.987Z  

```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character>set=new HashSet<>();
        for(char ch:sentence.toCharArray()){
            set.add(ch);
        }
        return set.size()==26 ;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)