class Solution {
    public void reverseQueue(Queue<Integer> q) {
        int n=q.size();
        RQ(q);
    }
    private void RQ(Queue<Integer> q){
        int n=q.size();
        if(n==0){
            return;
        }
        int front=q.poll();
        RQ(q);
        q.add(front);
    }
}