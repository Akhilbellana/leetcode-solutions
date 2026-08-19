# Can Make Arithmetic Progression From Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

 
Example 1:

Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.


Example 2:

Input: arr = [1,2,4]
Output: false
Explanation: There is no way to reorder the elements to obtain an arithmetic progression.


 
Constraints:


	2 <= arr.length <= 1000
	-106 <= arr[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 83.47%)  
**Memory:** 44.1 MB (beats 73.03%)  
**Submitted:** 2026-08-19T19:28:24.629Z  

```java
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            if(arr[j]-arr[i]!=d){
                 return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/)