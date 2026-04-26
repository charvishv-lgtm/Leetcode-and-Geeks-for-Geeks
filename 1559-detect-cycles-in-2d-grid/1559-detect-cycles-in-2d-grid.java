class Solution {
    public boolean containsCycle(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] parent = new int[m * n];
        
        for (int i = 0; i < m * n; i++) {
            parent[i] = i;
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j + 1 < n && grid[i][j] == grid[i][j + 1]) {
                    int root1 = find(parent, i * n + j);
                    int root2 = find(parent, i * n + j + 1);
                    if (root1 == root2) {
                        return true;
                    }
                    parent[root1] = root2;
                }
                if (i + 1 < m && grid[i][j] == grid[i + 1][j]) {
                    int root1 = find(parent, i * n + j);
                    int root2 = find(parent, (i + 1) * n + j);
                    if (root1 == root2) {
                        return true;
                    }
                    parent[root1] = root2;
                }
            }
        }
        
        return false;
    }
    
    private int find(int[] parent, int i) {
        while (i != parent[i]) {
            parent[i] = parent[parent[i]];
            i = parent[i];
        }
        return i;
    }
}