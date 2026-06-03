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
        ListNode temp=head;
        HashMap<ListNode,Integer> bh=new HashMap<>();
        int bry=0;
        while(temp!=null)
        {
            bry++;
            if(bh.containsKey(temp))
            {
                return temp;
            }
            bh.put(temp,bry);
            temp=temp.next;
        }
        return null;
    }
}