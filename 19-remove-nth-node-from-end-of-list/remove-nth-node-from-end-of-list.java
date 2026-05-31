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
        ListNode temp;
        temp=head;
        int cnt=0;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        if(cnt==n)
        {
            return head.next;
        }
        int bh=0;
        temp=head;
        while(temp!=null)
        {
            bh++;
            if(bh==cnt-n)
            {
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}