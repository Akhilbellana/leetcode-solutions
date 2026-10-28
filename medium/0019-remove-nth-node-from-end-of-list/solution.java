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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        if(len==n){
            head=head.next;
            return head;
        }
        len=len-n;
        while(temp!=null){
            if(len==1){
                if(temp.next.next==null){
                    temp.next=null;
                }else{
                temp.next=temp.next.next;
                }
                return head;
            }
            len--;
            temp=temp.next;
        }
        return head;
        
    }
}