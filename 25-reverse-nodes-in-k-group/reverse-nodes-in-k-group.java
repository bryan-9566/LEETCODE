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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode knode=null;
        ListNode prev=null;
        ListNode nextn=null;
        while(temp!=null)
        {
            knode=findk(temp,k);
            if(knode==null)
            {
                if(prev!=null)
                {
                    prev.next=temp;
                }
                break;
            }
            nextn=knode.next;
            knode.next=null;
            reverse(temp);
            if(temp==head)
            {
                head=knode;
            }
            else
            {
                prev.next=knode;
            }
            prev=temp;
            temp=nextn;
        }
        return head;
    }
    public ListNode findk(ListNode head,int k)
    {
        k--;
        while(head!=null && k>0)
        {
            k--;
            head=head.next;
        }
        return head;
    }
    public ListNode reverse(ListNode head)
    {
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