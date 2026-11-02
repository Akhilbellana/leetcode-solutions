# Reverse Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a singly linked list, reverse the list, and return *the reversed list*.

 

**Example 1:**

```
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

```

**Example 2:**

```
Input: head = [1,2]
Output: [2,1]

```

**Example 3:**

```
Input: head = []
Output: []

```

 

**Constraints:**

- The number of nodes in the list is the range [0, 5000].
- -5000 <= Node.val <= 5000

 

**Follow up:** A linked list can be reversed either iteratively or recursively. Could you implement both?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 3.59%)  
**Memory:** 44.3 MB (beats 23.87%)  
**Submitted:** 2026-11-02T06:45:00.434Z  

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        if(list.isEmpty()){
            return null;
        }
        Collections.reverse(list);
        ListNode newHead = new ListNode(list.get(0));
        ListNode tail = newHead;
        for (int i = 1; i < list.size(); i++) {
            ListNode newNode = new ListNode(list.get(i));
            tail.next = newNode;
            tail = newNode;
        }
        return newHead;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-linked-list/)