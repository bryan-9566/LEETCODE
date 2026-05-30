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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1,null);
        ListNode temp=dummy;
        int carry=0;
        ListNode t1=l1;
        ListNode t2=l2;
        while(t1!=null || t2!=null)
        {
            int sum=carry;
            if(t1!=null)
            {
                sum+=t1.val;
                t1=t1.next;
            }
            if(t2!=null)
            {
                sum+=t2.val;
                t2=t2.next;
            }
            ListNode newN=new ListNode(sum%10,null);
            temp.next=newN;
            temp=temp.next;
            carry=sum/10;
        }
        if(carry>0)
        {
            temp.next=new ListNode(carry,null);
        }
        return dummy.next;
    }
}