/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        if (root==null){ return result;}
        Queue<Node> q=new LinkedList<>();
        q.add(root); // a=[1,]
        while(!q.isEmpty()){
            int s=q.size();// s=1
            //traverse for multitple nodes at that level
            for(int i=0;i<s;i++){
                Node curr= q.poll();
                if(i==s-1){
                    result.add(curr.data);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return result;
    }
}