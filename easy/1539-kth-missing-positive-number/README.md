# Kth Missing Positive Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.

 
Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.


Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.


 
Constraints:


	1 <= arr.length <= 1000
	1 <= arr[i] <= 1000
	1 <= k <= 1000
	arr[i] < arr[j] for 1 <= i < j <= arr.length


 
Follow up:

Could you solve this problem in less than O(n) complexity?

## Solution

**Language:** Java  
**Runtime:** 62 ms (beats 5.52%)  
**Memory:** 45.6 MB (beats 6.33%)  
**Submitted:** 2026-08-24T04:37:01.213Z  

```java
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        List<Integer>list=new ArrayList<>();
        for(int n:arr){
            list.add(n);
        }
        int count=0;
        int i=1;
        while(count<=k){
            if(!list.contains(i)){
                count++;
            }
            if(count==k){
                return i;
            }
            i++;
        }
        return -1;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/kth-missing-positive-number/)