/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       Node curr=head,next;
        while(curr!=null){
            next=curr.next;
            Node temp=new Node(curr.val);
            curr.next=temp;
            temp.next=next;
            curr=next;
        }
        curr=head;
        while(curr!=null)
        {
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
            
            curr=curr.next.next;
        }
        curr=head;
        Node tempHead=new Node(0);
        Node copy,copyIter=tempHead;
        while(curr!=null)
        {
            next=curr.next.next;
            
            copy=curr.next;
            copyIter.next=copy;
            copyIter=copy;
            
            curr.next=next;
            curr=next;
        }
        return tempHead.next;
    }
}