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