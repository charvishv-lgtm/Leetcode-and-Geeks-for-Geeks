/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        if(head==null){ return 0;}
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                int counter=1;
                Node temp=slow.next;
                while(temp!=slow){
                    counter++;
                    temp=temp.next;
                }
                return counter;
            }
        }
        return 0;
    }
}