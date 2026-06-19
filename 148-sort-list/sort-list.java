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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode middle=fmiddle(head);
        ListNode rhead=sortList(middle.next);
        middle.next=null;
        ListNode lhead=sortList(head);
        return merge(lhead,rhead);
    }
    public ListNode fmiddle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode b,ListNode h)
    {
        ListNode dummy=new ListNode(-1);
        ListNode bh=dummy;
        while(b!=null && h!=null)
        {
            if(b.val<=h.val)
            {
                dummy.next=b;
                dummy=dummy.next;
                b=b.next;
            }
            else
            {
                dummy.next=h;
                dummy=dummy.next;
                h=h.next;
            }
        }
        if(b!=null)
        {
            dummy.next=b;
            dummy=dummy.next;
            b=b.next;
        }
        if(h!=null)
        {
            dummy.next=h;
            dummy=dummy.next;
            h=h.next;
        }
        return bh.next;
    }
}