# Duplicate Zeros

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

 
Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]


Example 2:

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]


 
Constraints:


	1 <= arr.length <= 104
	0 <= arr[i] <= 9

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-09-06T05:26:02.992Z  

```java
        for(int n:arr){
            if(n==0){
                list.add(n);
            }
        }
        
            list.add(n);
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
    }

}

```

---

[View on LeetCode](https://leetcode.com/problems/duplicate-zeros/)