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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)
        {
            return head;
        }
        ListNode tail=head;
        int cnt=1;
        while(tail.next!=null)
        {
            cnt++;
            tail=tail.next;
        }
        if(k%cnt==0)
        {
            return head;
        }
        k=k%cnt;
        tail.next=head;
        int reach=cnt-k;
        ListNode temp=head;
        int bry=1;
        while(temp!=null)
        {
            if(bry==reach)
            {
                break;
            }
            bry++;
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}