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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode bh=dummy;
        ListNode t1;
        ListNode t2;
        t1=list1;
        t2=list2;
        while(t1!=null && t2!=null)
        {
            if(t1.val<=t2.val)
            {
                dummy.next=t1;
                dummy=dummy.next;
                t1=t1.next;
            }
            else
            {
                dummy.next=t2;
                dummy=dummy.next;
                t2=t2.next;
            }
        }
        while(t1!=null)
        {
            dummy.next=t1;
            t1=t1.next;
            dummy=dummy.next;
        }
        while(t2!=null)
        {
            dummy.next=t2;
            t2=t2.next;
            dummy=dummy.next;
        }
        return bh.next;
    }
}