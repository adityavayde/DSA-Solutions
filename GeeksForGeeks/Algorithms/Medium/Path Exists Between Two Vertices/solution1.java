class Solution {
    public boolean checkPath(ArrayList<ArrayList<Integer>> adj, int u, int v) {

        int n = adj.size();
        
        boolean[] vis = new boolean[n];
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(u);
        
        vis[u] = true;
        
        while (!q.isEmpty()) {
            
            int curr = q.poll();
            
            if (curr == v) return true;
            
            for (int next : adj.get(curr)) {
                
                if (!vis[next]) {
                    vis[next] = true;
                    q.add(next);
                }
            }
        }
        
        return false;
    }
}