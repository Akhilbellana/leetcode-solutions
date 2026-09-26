# Peak Index in a Mountain Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer **mountain** array `arr` of length `n` where the values increase to a **peak element** and then decrease.

Return the index of the peak element.

Your task is to solve it in `O(log(n))` time complexity.

 

**Example 1:**

**Input:** arr = [0,1,0]

**Output:** 1

**Example 2:**

**Input:** arr = [0,2,1,0]

**Output:** 1

**Example 3:**

**Input:** arr = [0,10,5,2]

**Output:** 1

 

**Constraints:**

- 3 <= arr.length <= 105
- 0 <= arr[i] <= 106
- arr is guaranteed to be a mountain array.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 80.4 MB (beats 21.38%)  
**Submitted:** 2026-09-26T13:03:05.211Z  

```java
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[arr.length-1]>arr[arr.length-2]){
            return arr.length-1;
        }
        int l=1;
        int h=arr.length-2;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]>arr[m-1]&&arr[m]<arr[m+1]){
                l=m+1;
            }else if(arr[m]<arr[m-1]&& arr[m]>arr[m+1]){
                h=m-1;
            }else{
                return m;
            }

        }
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/peak-index-in-a-mountain-array/)