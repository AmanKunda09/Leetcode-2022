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
        if(head.next==null) return null;
        if(head==null) return null;
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
        int node=len-n;
        temp=head;
        for(int i=1;i<node;i++)
        {
            temp=temp.next;
        }
        if(n==1)
        {
            temp.next=null;
        }else if(n==len){
            head=head.next;
        }else{
            temp.next=temp.next.next;
        }
        return head;
    }
}