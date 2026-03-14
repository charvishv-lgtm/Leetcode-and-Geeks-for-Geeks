import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Solution {
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> q = new LinkedList<>();
        Queue<Integer> hdQueue = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        q.add(root);
        hdQueue.add(0);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            int hd = hdQueue.poll();

            if (!map.containsKey(hd)) {
                map.put(hd, curr.data);
            }

            if (curr.left != null) {
                q.add(curr.left);
                hdQueue.add(hd - 1);
            }

            if (curr.right != null) {
                q.add(curr.right);
                hdQueue.add(hd + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}