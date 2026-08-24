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
**Runtime:** 0 ms  
**Memory:** 42.4 MB  
**Submitted:** 2026-08-24T04:25:40.937Z  

```java
        
        for(int i=1;i<=n;i++){
            if(!list.contains(i)){
        }
        int count=0;
                count++;
            }
            if(count==k-1){
                return i;
            }
        return -1;
        List<Integer>list=new ArrayList<>();
        for(int n:arr){
            list.add(n);
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n=1000;
    public int findKthPositive(int[] arr, int k) {
class Solution {
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/kth-missing-positive-number/)