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
        if(head==null||k==1) return head;
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode pre=dummy,curr=head,nex=dummy;
        int len=0;
        while(curr!=null)
        {
            curr=curr.next;
            len++;
        }
        while(len>=k)
        {
            curr=pre.next;
            nex=curr.next;
            for(int i=1;i<k;i++)
            {
                curr.next=curr.next.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=curr.next;
            }
            pre=curr;
            len-=k;
        }
        return dummy.next;
    }
}