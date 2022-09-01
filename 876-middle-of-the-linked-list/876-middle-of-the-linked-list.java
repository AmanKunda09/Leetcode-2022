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
    public ListNode middleNode(ListNode head) {
        ListNode dummy=head;
        int l=0;
        while(head.next!=null)
        {
            head=head.next;
            l++;    
        }
        if(l%2==0)
        {
            l=l/2;
        }
        else l=(l/2)+1;
        for(int i=0;i<l;i++)
        {
            dummy=dummy.next;
        }
        return dummy;
    }
}