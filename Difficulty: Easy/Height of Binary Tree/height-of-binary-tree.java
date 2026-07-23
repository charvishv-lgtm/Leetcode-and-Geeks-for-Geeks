/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        if (root==null){
            return -1;
        }
        int leftweight=height(root.left);
        int rightweight=height(root.right);
        return 1+ Math.max(leftweight,rightweight);
    
    }
}