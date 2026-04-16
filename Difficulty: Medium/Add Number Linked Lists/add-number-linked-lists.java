/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node reverseList(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next;
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public Node addTwoLists(Node head1, Node head2) {
        head1=reverseList(head1);
        head2=reverseList(head2);
        Node newNode=new Node(0);
        Node curr=newNode;
        int carry=0;
        
        while(head1!=null || head2!=null || carry!=0){
            int sum=carry;
            if(head1!=null){
                sum+=head1.data;
                head1=head1.next;
            }
            if(head2!=null){
                sum+=head2.data;
                head2=head2.next;
            }
            carry=sum/10;
            curr.next=new Node(sum%10);
            curr=curr.next;
        }
        Node res=reverseList(newNode.next);
        while(res!=null && res.data==0 && res.next!=null){
            res=res.next;
        }
        return res;
        
    }
}