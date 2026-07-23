/*
Definition for Node
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
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> res= new ArrayList<>();
        
        if(root == null){return res;}
        Queue<Node> q=new LinkedList<>();
        Queue<Integer> hdq=new LinkedList<>();
        TreeMap<Integer, Integer> map=new TreeMap<>();
        
        q.add(root);
        hdq.add(0);
        
        while(!q.isEmpty()){
            Node curr=q.poll();
            int hd=hdq.poll();
            map.put(hd,curr.data);
            if(curr.left != null){
                q.offer(curr.left);
                hdq.offer(hd-1);
            }
            if(curr.right != null){
                q.offer(curr.right);
                hdq.offer(hd+1);
            }
        }
        
        for(int val:map.values()){
            res.add(val);
        }
        return res;
        
    }
}