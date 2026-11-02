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
**Memory:** 43.9 MB (beats 80.92%)  
**Submitted:** 2026-11-02T06:39:33.398Z  

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
        Collections.reverse(list);
        ListNode newHead = null;
        ListNode tail = null;
        for (int i = 0; i < list.size(); i++) {
            ListNode newNode = new ListNode(list.get(i));
            if (newHead == null) {
                newHead = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return newHead;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-linked-list/)