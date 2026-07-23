/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        return BST(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean BST(Node node, long min, long max){
        if (node==null){return true;}
        if (node.data<=min || node.data>=max){ return false;}
        return BST(node.left,min,node.data) && BST(node.right,node.data,max); 
    }
}           