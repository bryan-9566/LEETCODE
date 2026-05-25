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
    public boolean isPalindrome(ListNode head) {
        ListNode temp;
        List<Integer> bry=new ArrayList<>();
        temp=head;
        while(temp!=null)
        {
            bry.add(temp.val);
            temp=temp.next;
        }
        int i=0,j=bry.size()-1;
        while(i<j)
        {
            if(bry.get(i)!=bry.get(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}