/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int cnt=0;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return find(slow,fast,head);
            }
        }
        return null;
    }
    public ListNode find(ListNode slow,ListNode fast,ListNode head)
    {
        slow=head;
        while(fast!=slow)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}