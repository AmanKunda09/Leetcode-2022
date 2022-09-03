/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        ListNode temp1=headA;
        ListNode temp2=headB;
        int lenA=0,lenB=0;
        while(temp1!=null)
        {
            temp1=temp1.next;
            lenA++;
        }
        while(temp2!=null)
        {
            temp2=temp2.next;
            lenB++;
        }
        temp1=headA;
        temp2=headB;
        if(lenA>lenB)
        {
            int len=lenA-lenB;
            for(int i=0;i<len;i++)
            {
                temp1=temp1.next;
            }
        }else{
            int len=lenB-lenA;
            for(int i=0;i<len;i++)
                temp2=temp2.next;
        }
        while(temp1!=null||temp2!=null)
        {
            if(temp1==temp2)
                return temp1;
           
                temp1=temp1.next;
                temp2=temp2.next;
            
        }
        return null;
    }
}