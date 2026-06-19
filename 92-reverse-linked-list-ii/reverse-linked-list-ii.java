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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right)
        {
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode lp=dummy;
        for(int i=1;i<left;i++)
        {
            lp=lp.next;
        }
        ListNode ln=lp.next;
        ListNode rn=ln;
        for(int i=left;i<right;i++)
        {
            rn=rn.next;
        }
        ListNode ra=rn.next;
        rn.next=null;
        lp.next=reverseList(ln);
        ln.next=ra;
        return dummy.next;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode temp=head;
        ListNode prev=null;
        ListNode front=null;
        while(temp!=null)
        {
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}