class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int it[] : prerequisites) {
            adj.get(it[1]).add(it[0]);
        }
        int depend[] = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int it : adj.get(i)) depend[it]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (depend[i] == 0)
                q.add(i);
        }
        List<Integer> size = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            size.add(node);
            for (int it : adj.get(node)) {
                depend[it]--;
                if (depend[it] == 0)
                    q.add(it);
            }
        }
        if (size.size() == numCourses)
            return true;
        return false;
    }
}
