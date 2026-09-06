# Unique Number of Occurrences

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 
Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Example 2:

Input: arr = [1,2]
Output: false


Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true


 
Constraints:


	1 <= arr.length <= 1000
	-1000 <= arr[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-09-06T07:12:08.338Z  

```java
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int value:map.values()){
        return true;
        Set<Integer>set=new HashSet<>();
            if(set.contains(value)){
        }
                return false;
            }
    }
            set.add(value);
}

```

---

[View on LeetCode](https://leetcode.com/problems/unique-number-of-occurrences/)