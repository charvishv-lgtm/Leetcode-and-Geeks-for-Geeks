class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        q.add(k);
        
    }
    static int findFrequency(Queue<Integer> q, int k) {
        int n=q.size();
        int count=0;
        for(int i=0;i<n;i++){
            int f=q.poll();
            if(f==k){
                count++;
            }
            q.add(f);
        }
        if (count==0){
            return -1;
        }
        return count;
    }
}