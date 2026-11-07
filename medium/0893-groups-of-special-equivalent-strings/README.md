# Groups of Special-Equivalent Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of strings of the same length `words`.

In one **move**, you can swap any two even indexed characters or any two odd indexed characters of a string `words[i]`.

Two strings `words[i]` and `words[j]` are **special-equivalent** if after any number of moves, `words[i] == words[j]`.

- For example, words[i] = "zzxy" and words[j] = "xyzz" are special-equivalent because we may make the moves "zzxy" -> "xzzy" -> "xyzz".

A **group of special-equivalent strings** from `words` is a non-empty subset of words such that:

- Every pair of strings in the group are special equivalent, and
- The group is the largest size possible (i.e., there is not a string words[i] not in the group such that words[i] is special-equivalent to every string in the group).

Return *the number of **groups of special-equivalent strings** from *`words`.

 

**Example 1:**

```
Input: words = ["abcd","cdab","cbad","xyzz","zzxy","zzyx"]
Output: 3
Explanation: 
One group is ["abcd", "cdab", "cbad"], since they are all pairwise special equivalent, and none of the other strings is all pairwise special equivalent to these.
The other two groups are ["xyzz", "zzxy"] and ["zzyx"].
Note that in particular, "zzxy" is not special equivalent to "zzyx".

```

**Example 2:**

```
Input: words = ["abc","acb","bac","bca","cab","cba"]
Output: 3

```

 

**Constraints:**

- 1 <= words.length <= 1000
- 1 <= words[i].length <= 20
- words[i] consist of lowercase English letters.
- All the strings are of the same length.

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 53.96%)  
**Memory:** 45.8 MB (beats 69.80%)  
**Submitted:** 2026-11-07T05:45:46.742Z  

```java
class Solution {
    public int numSpecialEquivGroups(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                //separate even and odd characters to string and sort 
                // because they said we can only swap odd to odd and even to odd , so we separated odd an even characters 
                if (i % 2 == 0) {
                    even.append(s.charAt(i));
                } else {
                    odd.append(s.charAt(i));
                }
            }
            char[] ch1 = even.toString().toCharArray();
            char[] ch2 = odd.toString().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            String temp1 = Arrays.toString(ch1);
            String temp2 = Arrays.toString(ch2);
            map.put(temp1 + temp2, map.getOrDefault(temp1 + temp2, 0) + 1);
        }
        return map.size();

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/groups-of-special-equivalent-strings/)