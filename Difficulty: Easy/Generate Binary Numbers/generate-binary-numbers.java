class Solution {
    public ArrayList<String> generateBinary(int n) {
        ArrayList<String> result=new ArrayList<>();
        Queue<String> q=new LinkedList<>();
        q.add("1");
        for(int i=0;i<n;i++){
            String front=q.poll();
            result.add(front);
            q.add(front+"0");
            q.add(front+"1");
        }
        return result;
        
    }
}
